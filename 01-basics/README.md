# 01 - Object-Oriented Programming Basics

This module covers the fundamental concepts of Object-Oriented Programming (OOP) in Java.

## Exercises

### 1. Product Class
**File:** `src/entities/Product.java`

**Concepts:**
- Class definition and attributes
- Methods (instance methods)
- `toString()` override
- Working with strings and formatting

**Description:**
A simple `Product` class that demonstrates:
- Storing product data (name, price, quantity)
- Calculating total value in stock
- Managing inventory (add/remove products)
- String formatting with `String.format()`

**Usage:**
See `src/application/Program2.java`

---

### 2. Triangle Class & Area Calculation
**File:** `src/entities/Triangle.java`

**Concepts:**
- Class attributes
- Instance methods
- Mathematical operations (Heron's formula)
- Object instantiation and comparison

**Description:**
Demonstrates calculating the area of a triangle using Heron's formula:
```
s = (a + b + c) / 2
Area = √[s(s-a)(s-b)(s-c)]
```

**Usage:**
See `src/application/Program.java` - creates two Triangle objects and compares their areas.

---

## How to Run

### Using IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Right-click on `Program.java` or `Program2.java`
3. Select "Run 'Program.main()'"

### Using Command Line
```bash
# Compile
javac -d bin src/entities/*.java src/application/*.java

# Run
java -cp bin application.Program
java -cp bin application.Program2
```

---

## Key Takeaways
- ✓ Creating classes with attributes and methods
- ✓ Using the `new` keyword to instantiate objects
- ✓ Accessing object attributes and calling methods
- ✓ Method parameters and return types
- ✓ String representation with `toString()`
- ✓ Basic mathematical operations in Java
