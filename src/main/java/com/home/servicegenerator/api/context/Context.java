package com.home.servicegenerator.api.context;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Name;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public interface Context {
    Name getPipelineId();
    MethodDeclaration getPipeline();
    Optional<? extends Property> getPropertyByName(String name);

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
