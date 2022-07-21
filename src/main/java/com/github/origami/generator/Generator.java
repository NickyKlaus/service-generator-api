package com.github.origami.generator;

import com.github.javaparser.ast.visitor.Visitable;
import com.github.origami.api.context.Context;

public interface Generator {
    Visitable generate(final Visitable baseUnit, final Context arg);
}
