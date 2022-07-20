package com.home.origami.generator;

import com.github.javaparser.ast.visitor.Visitable;
import com.home.origami.api.context.Context;

public interface Generator {
    Visitable generate(final Visitable baseUnit, final Context arg);
}