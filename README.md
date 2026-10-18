# Java Exercises

Java exercises for practicing programming fundamentals and object-oriented programming.

## Modules

| Module | Topics |
|---|---|
| [00-sequential-structure](00-sequential-structure) | Input, output, variables, operators |
| [01-oop-basics](01-oop-basics) | Classes, objects, attributes, methods |
| 02-encapsulation | Getters/setters, access modifiers |
| 03-inheritance | Inheritance, `super` |
| 04-polymorphism | Overriding, interfaces, abstract classes |
| 05-exceptions | Exception handling, try-catch |
| 06-collections | ArrayList, HashMap |

## Running

In IntelliJ IDEA: right-click the file and select **Run**.

From the command line, inside a module folder:

```bash
javac -d out src/entities/*.java src/application/*.java
java -cp out application.Ex01_TriangleAreaComparison
```

## Formatting

Code is formatted with [Prettier](https://prettier.io) and `prettier-plugin-java`.

```bash
npm install
npx prettier --write "**/*.java"
```