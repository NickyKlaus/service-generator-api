package com.nickyklaus.origami.generator;

import com.github.javaparser.ast.visitor.Visitable;
import com.nickyklaus.origami.api.context.Context;

public interface Generator {
    Visitable generate(final Visitable baseUnit, final Context arg);
}
