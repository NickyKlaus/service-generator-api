# origami-api
Standard API for **Origami plugin**

[![Java CI with Maven](https://github.com/NickyKlaus/origami-api/actions/workflows/maven.yml/badge.svg)](https://github.com/NickyKlaus/origami-api/actions/workflows/maven.yml)

Implement *ASTProcessingSchema* to declare the changes in AST of the source code and use them in **Origami plugin** as your own external processing schemas.

You can also use *Context* and *Property* to share the data between **Origami** processing schemas.

*Generator* interface provides the ability to create a Java-based representation of the AST according to the processing schema. 

Add repository to your project POM 

```
<distributionManagement>
  <repository>
    <id>github</id>
    <name>GitHub Apache Maven Packages</name>
    <url>https://maven.pkg.github.com/NickyKlaus/origami-api</url>
  </repository>
</distributionManagement>
```

and then just add *origami-api* dependency

```
<dependency>
    <groupId>com.github.NickyKlaus</groupId>
    <artifactId>origami-api</artifactId>
    <version>${origami-api.version}</version>
</dependency>
```
