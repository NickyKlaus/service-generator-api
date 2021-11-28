package com.home.servicegenerator.api.context;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Name;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public interface Context {
    Name getPipelineId();
    MethodDeclaration getPipeline();
    Map<String, Object> getProperties();
    Optional<Property> getPropertyByName(String name);

    static Collection<? extends Property> requireNonNullValues(
            final Collection<? extends Property> properties,
            final String errorMessage
    ) {
        if (properties.stream().map(Property::getValue).anyMatch(Objects::isNull)) {
            throw new NullPointerException(errorMessage);
        }
        return properties;
    }
}
