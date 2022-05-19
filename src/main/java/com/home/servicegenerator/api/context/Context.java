package com.home.servicegenerator.api.context;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public interface Context {
    Map<String, Object> getProperties();
    Optional<Object> getPropertyByName(String name);

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
