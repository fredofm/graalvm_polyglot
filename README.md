# Java and Python Integration Example for GraalVM

This example demonstrates how to integrate Python on GraalVM with a Java application.

## Prerequisites

- GraalVM
- Python support

## Getting Started

- Download GraalVM Commuity or Enterprise and set your GRAALVM_HOME to point to it.

- Add the Python support. GraalVM comes with `gu` (GraalVM updater) which is a command line utility to install and manage additional functionalities. To install Python support run this single command:

```shell
$GRAALVM_HOME/bin/gu install python
```

- Compile the package:

```shell
mvn clean package
```

- Run the application:

```shell
java -jar ./target/graalvm-polyglot-1.0-SNAPSHOT.jar
```  

You should get the following output:

```shell
JAVA: Hello from Java!
Python: Hello from Python code!
JAVA: Printing the "id" property of the object returned by the python code. ID=42
```

## GraalVM available extensions

You can get the list of currently supported extensions (from GraalVM 22.0.0.2) with the following command:

```shell
$GRAALVM_HOME/bin/gu available
```

You will an output like that one:

|ComponentId      |        Version     |        Component name            |    Stability          |           Origin |
|-----------------|--------------------|----------------------------------|-----------------------|---------------------|
|espresso         |        22.0.0.2    |        Java on Truffle              | Experimental       |           github.com|
|espresso-llvm     |       22.0.0.2    |        Java on Truffle LLVM Java libr|Experimental       |           github.com|
|llvm-toolchain     |      22.0.0.2    |        LLVM.org toolchain            |Experimental       |           github.com|
|native-image     |        22.0.0.2    |        Native Image                  |Experimental       |           github.com|
|nodejs           |        22.0.0.2    |        Graal.nodejs                  |Experimental       |           github.com|
|python          |         22.0.0.2    |        Graal.Python                  |Experimental       |           github.com|
|R               |         22.0.0.2    |        FastR                         |Experimental       |           github.com|
|ruby           |          22.0.0.2    |        TruffleRuby                   |Experimental       |           github.com|
|wasm           |          22.0.0.2    |        GraalWasm                     |Experimental       |           github.com|
