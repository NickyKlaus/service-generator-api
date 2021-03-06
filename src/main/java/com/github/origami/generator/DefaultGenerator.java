package com.github.origami.generator;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.origami.api.ASTProcessingSchema;
import com.github.origami.api.context.Context;

/**
 * Generates special representation of all Abstract Syntax Tree nodes of implementation class using the base class as
 * a template.
 *
 * This generator delegates processing AST-nodes of the base class to the internal visitor.
 *
 * @see Generator
 * @see DefaultVisitor
 * @see ASTProcessingSchema
 */
public final class DefaultGenerator implements Generator {
    private final DefaultVisitor visitor;

    private DefaultGenerator(final Builder builder) {
        super();
        this.visitor = builder.visitor;
    }

    /**
     * Generates target class using internal visitor.
     * @param baseUnit - a base class AST-node (usually root-node)
     * @param context - generation context with meta information
     * @return AST-node of the target class (usually root-node)
     */
    @Override
    public Visitable generate(final Visitable baseUnit, final Context context) {
        if (baseUnit instanceof Node) {
            for (Node n : ((Node)baseUnit).getChildNodes()) {
                generate(n, context);
            }
        }
        return baseUnit.accept(visitor, context);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private final DefaultVisitor visitor;

        private Builder() {
            this.visitor = new DefaultVisitor();
        }

        /**
         * Sets a schema for AST processing.
         * @param processingSchema - a schema containing the actions for every base class' element that would be applied
         *                        to them to generate corresponding target class element.
         * @return Builder object
         */
        public synchronized Builder processingSchema(final ASTProcessingSchema processingSchema) {
            if (processingSchema == null) {
                throw new IllegalArgumentException("Tries to register invalid processing schema!");
            }
            this.visitor.registerProcessingSchema(processingSchema);
            return this;
        }

        public synchronized DefaultGenerator build() {
            return new DefaultGenerator(this);
        }
    }
}
