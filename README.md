## Run
### 1. Correct behaviour
```bash
mvn test -Dsuite=no_inheritance
```
### 2. Bug demonstation
```bash
mvn test -Dsuite=with_inheritance
```
## Bug summary
If ```@beforeMethod``` or ```@afterMethod``` fails then all children of the same base class will be skipped
