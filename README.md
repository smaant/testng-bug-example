## Run
### 1. Correct behaviour
mvn test -Dsuite=no_inheritance

### 2. Bug demonstation
mvn test -Dsuite=with_inheritance

## Bug summary
If @beforeMethod or @afterMethod fails then all children of the same base class will be skipped