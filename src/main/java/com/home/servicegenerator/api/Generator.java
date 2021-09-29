package com.home.servicegenerator.api;

import com.github.javaparser.ast.visitor.Visitable;

public interface Generator<R extends Visitable> {
    R generate(final R baseUnit, final Object arg);
}
