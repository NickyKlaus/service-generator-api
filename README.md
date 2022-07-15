# origami-api
Standard API for **Origami plugin**

Implement *ASTProcessingSchema* to declare the changes in AST of the source code and use them in **Origami plugin** as your own external processing schemas.

You can also use *Context* and *Property* to share the data between **Origami** processing schemas.

*Generator* interface provides the ability to create a Java-based representation of the AST according to the processing schema. 
