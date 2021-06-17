# Design Patterns Samples - Command Pattern (This code is not tested yet)
This is my attempt to improve my understanding of design patterns.

## What's command pattern?
* Behavioral pattern
* For abstracting actions as commands

## Terminologies
**Command Interface:** Interface declaring and abstracting the operation.
**Concrete Command Classes:** Implementing above interface and have reference to receiver to execute the operation.
**Receiver:** This is actual implementation of commands and receiver is responsible to execute the command.
**Invoker:** Takes command object to execute the operation.

Your implementation might exclude *Receiver* at times, and you might just end it at concrete command class.

## Advantages
* Makes code scalable and loosely couple.
* Gives an escape from too much conditional logic 
* Calling different actions at runtime gets easier.

## What's happening in this usecase?


### Mvn Run:
```mvn compile exec:java -Dexec.mainClass="com.shaziya.patterns.command.Runner"```

### References:
https://vibskant.medium.com/command-design-pattern-java-d91b82d270c7
(The coding example is taken from the above blog)

