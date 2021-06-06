# Apache Commons Chain Example

This Spring Boot 2 utilize the Apache `commons-chain` library and implements **Chain of Responsibility**.

Refer: https://www.baeldung.com/apache-commons-chain

### Sample Flow:

```
INPUT: one: one, two: two
Initiate the apache commons chain behaviour flow...
Primary comando
Inside DummySessionClient
Secondary comando
Inside DummyOneClient: ONE
Third comando
Inside DummyTwoClient: TWO
Finished the command process. Result: ChainResponse{outputOne='one / admin123', outputTwo='two / admin123'}
```


### Run:
```
mvn spring:boot

http://localhost:8080/chain/test?one=one&two=two

```

### Tools:

* Java 8
* Maven 3



