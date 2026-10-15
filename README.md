# Java Exercises

A structured collection of Java exercises following the curriculum of [Nelio Alves' Java Course](https://www.udemy.com/course/java-completo/).

Organized by topic with clear separation between foundational concepts and object-oriented programming.

---

## Course Structure

Exercises are organized by difficulty and topic:

| Module | Topics | Status |
|--------|--------|--------|
| [00-sequential-structure](./00-sequential-structure/) | Input, Processing, Output, Variables, Operators | In Progress |
| [01-oop-basics](./01-oop-basics/) | Classes, Objects, Methods, Attributes | In Progress |
| 02-encapsulation | Getters/Setters, Access Modifiers | Coming Soon |
| 03-inheritance | Class Inheritance, Super Keyword | Coming Soon |
| 04-polymorphism | Method Overriding, Interfaces, Abstract Classes | Coming Soon |
| 05-exceptions | Exception Handling, Try-Catch | Coming Soon |
| 06-collections | ArrayList, HashMap, Collections Framework | Coming Soon |

---

## Getting Started

### Prerequisites
- Java 8 or higher
- IntelliJ IDEA or any Java IDE
- Git

### Setup

```bash
git clone https://github.com/pedromiguel97/java-exercises.git
cd java-exercises
```

### Running Exercises

Using IntelliJ IDEA:
1. Open the project
2. Right-click on any exercise file
3. Select "Run"

Using Command Line:
```bash
javac src/entities/*.java src/application/*.java
java -cp . application.ExerciseName
```

---

## Project Structure

```
java-exercises/
├── README.md                    # Main documentation
├── LEARNING_PATH.md            # Detailed progression guide
├── LICENSE
├── .gitignore
│
├── 00-sequential-structure/
│   ├── README.md              # Module documentation
│   └── src/
│       ├── Ex001_SumTwoIntegers.java
│       ├── Ex002_CircleArea.java
│       └── (Add more exercises here)
│
├── 01-oop-basics/
│   ├── README.md              # Module documentation
│   ├── src/
│   │   ├── application/       # Main programs
│   │   │   ├── Ex01_TriangleAreaComparison.java
│   │   │   └── Ex02_ProductInventory.java
│   │   └── entities/          # Class definitions
│   │       ├── Triangle.java
│   │       └── Product.java
│   └── docs/
│       └── diagrams/          # UML diagrams (PlantUML)
│
├── 02-encapsulation/
│   ├── README.md
│   └── src/
│       ├── application/
│       └── entities/
│
└── (More modules...)
```

---

## Adding New Exercises

For each module, follow this pattern:

1. Create a new exercise file: `ExNN_ExerciseName.java`
2. Add problem statement in comments at the top
3. For OOP modules, create entity classes in `src/entities/`
4. Update the module README

Example:
```java
/*
 * Exercise NN: Exercise Name
 * 
 * Problem:
 * Clear description of what to do
 */
public class ExNN_ExerciseName {
    public static void main(String[] args) {
        // Implementation
    }
}
```

---

## Code Quality Standards

- Clean, readable code following Java conventions
- Meaningful variable and method names
- Problem statements in comments
- No external dependencies (pure Java)
- Progressive difficulty within each module

---

## Learning Resources

- [Java Completo - Nelio Alves (Udemy)](https://www.udemy.com/course/java-completo/)
- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [LEARNING_PATH.md](./LEARNING_PATH.md) - Detailed progression guide

---

## License

MIT License - see [LICENSE](LICENSE) file

---

**Last Updated:** October 15, 2026
