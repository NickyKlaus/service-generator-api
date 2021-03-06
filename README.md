# origami-api

[![Java CI with Maven](https://github.com/NickyKlaus/origami-api/actions/workflows/maven.yml/badge.svg)](https://github.com/NickyKlaus/origami-api/actions/workflows/maven.yml)

**[Origami](https://nickyklaus.github.io/origami/)** Maven plugin API

Implement `ASTProcessingSchema` to declare the changes in AST of the source code and use them in Origami plugin as your own external processing schemas.

You can also use `Context` and `Property` to share the data between Origami processing schemas.

`Generator` interface allows to create the Abstract Syntax Tree of generated source code according to the processing schema.
This API also provides a default implementation of `Generator` to create and test processing schemas outside the Origami plugin. 

To use **origami-api** in your project register server in Maven `settings.xml`

```
<servers>
  <server>
    <id>github</id>
    <username>${env.GITHUB_USERNAME}</username>
    <password>${env.GITHUB_TOKEN}</password>
  </server>
</servers>
```

add repository to your project POM 

```
<repository>
  <id>github</id>
  <name>GitHub Apache Maven Packages</name>
  <url>https://maven.pkg.github.com/NickyKlaus/origami-api</url>
</repository>
```

and then just add `origami-api` dependency

```
<dependency>
  <groupId>com.github</groupId>
  <artifactId>origami-api</artifactId>
  <version>${origami-api.version}</version>
</dependency>
```

**origami-api** uses the [Abstract Syntax Tree](https://github.com/javaparser/javaparser/tree/master/javaparser-core/src/main/java/com/github/javaparser/ast) provided by [![Javaparser](https://javaparser.org/img/jp-logo.png "Javaparser")](https://javaparser.org)
