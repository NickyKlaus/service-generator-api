# origami-api

[![Java CI with Maven](https://github.com/NickyKlaus/origami-api/actions/workflows/maven.yml/badge.svg)](https://github.com/NickyKlaus/origami-api/actions/workflows/maven.yml)

**Origami** Maven plugin API

Implement *ASTProcessingSchema* to declare the changes in AST of the source code and use them in **Origami plugin** as your own external processing schemas.

You can also use *Context* and *Property* to share the data between **Origami** processing schemas.

*Generator* interface provides the ability to create a Java-based representation of the AST according to the processing schema. 

Register server in Maven `settings.xml`

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

and then just add *origami-api* dependency

```
<dependency>
  <groupId>com.home</groupId>
  <artifactId>origami-api</artifactId>
  <version>${origami-api.version}</version>
</dependency>
```
