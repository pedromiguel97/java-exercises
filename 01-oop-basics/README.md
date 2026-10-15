# 01 - Object-Oriented Programming Basics

This module covers the fundamental concepts of Object-Oriented Programming (OOP) in Java.

## Exercises

### Ex01 - Triangle Area Comparison
**File:** `src/application/Ex01_TriangleAreaComparison.java`

**Concepts:**
- Class definition and attributes
- Instance methods
- Object instantiation
- Mathematical calculations (Heron's formula)
- Object comparison and conditional logic

**Problem:**
Create a Triangle class and a program that:
1. Reads measurements for two triangles
2. Calculates their areas using Heron's formula
3. Compares and displays which has the larger area

**Related Files:**
- `src/entities/Triangle.java` - Triangle class definition

---

### Ex02 - Product Inventory Management
**File:** `src/application/Ex02_ProductInventory.java`

**Concepts:**
- Class attributes
- Instance methods for business logic
- `toString()` override for display
- String formatting
- State management and mutation

**Problem:**
Create a Product class to manage inventory:
1. Store product data (name, price, quantity)
2. Calculate total stock value
3. Add/remove products from inventory
4. Display formatted product information

**Related Files:**
- `src/entities/Product.java` - Product class definition

---

### Ex03 - Rectangle Values
**File:** `src/application/Ex03_RectangleValues.java`

**Problem:** _(enunciado pendente)_

---

## How to Run

### Using IntelliJ IDEA
1. Right-click on any exercise file (Ex01, Ex02, etc)
2. Select "Run 'ExerciseName.main()'"

### Using Command Line
```bash
javac -d bin src/entities/*.java src/application/*.java
java -cp bin application.Ex01_TriangleAreaComparison
java -cp bin application.Ex02_ProductInventory
```

---

## Adding New Exercises

1. Create a new class in `src/application/ExNN_ExerciseName.java`
2. Add problem statement in comments at the top
3. Create required entity classes in `src/entities/`
4. Update this README with exercise description

---

## Key Concepts Covered

- Class definition and structure
- Attributes (instance variables)
- Methods (behavior)
- Object instantiation with `new`
- Accessing attributes and calling methods
- Method parameters and return types
- Overriding `toString()` for custom display
- Basic mathematical operations
- Conditional logic and object comparison
