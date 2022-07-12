package com.home.origami.api.context;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public interface Context {
    Map<String, Object> getProperties();
    Optional<Object> getPropertyByName(String name);

    default <T> T get(String name, Class<T> cls) throws IllegalArgumentException {
        var object = getPropertyByName(name);
        if (object.isPresent()) {
            if (
                    ( object.get() instanceof Enum<?> &&
                            ((Enum<?>) object.get())
                                    .getDeclaringClass()
                                    .getCanonicalName()
                                    .equals(cls.getCanonicalName()) ) ||
                            ( object.get().getClass().isAssignableFrom(cls) )
            ) {
                return cls.cast(object.get());
            }
        }
        throw new IllegalArgumentException(name + " is not set");
    }

    static Collection<Property> requireNonNullValues(
            final Collection<Property> properties,
            final String errorMessage
    ) {
        if (properties.stream().map(Property::getValue).anyMatch(Objects::isNull)) {
            throw new NullPointerException(errorMessage);
        }
        return properties;
    }
}
