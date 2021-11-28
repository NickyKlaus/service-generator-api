package com.home.servicegenerator.api;

import com.github.javaparser.ast.visitor.Visitable;
import com.home.servicegenerator.api.context.Context;

public interface Generator {
    Visitable generate(final Visitable baseUnit, final Context arg);
}
