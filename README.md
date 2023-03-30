# Concurrency testing demos - JCStress

Project uses a `lib` submodule classes to show how to use [JCStress](https://github.com/openjdk/jcstress) tests.

To run all tests from `jcstress-demo` submodule, just run 

```shell
mvn clean verify
```

It will build all classes, assemble a JAR file and automatically initialize tests.

For more information about testing framework, follow below links:

* [Github JCStress project repository](https://github.com/openjdk/jcstress)
* [OpenJDK JCStress Page](https://openjdk.org/projects/code-tools/jcstress/)
* [Aleksey Shipilev — Workshop: Java Concurrency Stress (JCStress). Part 1](https://youtu.be/koU38cczBy8)
* [Aleksey Shipilev — Workshop: Java Concurrency Stress (JCStress). Part 2](https://youtu.be/iTZNhknTGrg)
* [Fosdem 2021 - JCStress: Eliminating the Nightmare of Debugging Concurrency Problems](https://av.tib.eu/media/52791)
