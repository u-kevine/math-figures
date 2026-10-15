# Object-Oriented Programming Project: Shape Calculator (Java Edition)

Welcome to this beginner-friendly coding project! In this guide, you will learn and apply three core pillars of Object-Oriented Programming (OOP): **Abstraction**, **Inheritance**, and **Polymorphism**.

We will build a simple, beginner-friendly console program in **Java** that calculates the area and volume of three basic geometric shapes: a 2D **Rectangle**, a 2D **Square**, and a 3D **Cube**.

---

## The Mathematical Formulas

Before we write any code, let's look at the simple mathematical formulas your classes will implement. Here, $w$ represents width, $l$ represents length, and $s$ represents the side length.

### 1. Rectangle (2D)
*   **Area ($A$):**
    $$A = \text{width} \times \text{length}$$
*   **Volume ($V$):** As a 2D shape, it has no volume (return $0.0$).

### 2. Square (2D)
*   **Area ($A$):**
    $$A = s^2$$
*   **Volume ($V$):** As a 2D shape, it has no volume (return $0.0$).

### 3. Cube (3D)
*   **Area ($A$ - Base Area or Surface Area):** Let's calculate the total surface area of a cube:
    $$A = 6 \times s^2$$
*   **Volume ($V$):**
    $$V = s^3$$

---

## Step-by-Step Implementation Guide

### Step 1: Create an Abstract Class (Abstraction)
Abstraction means hiding complex implementation details and showing only the essential features. We will create an abstract parent class called `Shape`.

*   Define two abstract methods: `public abstract double area();` and `public abstract double volume();`.
*   Remember: Any child class *that extends* `Shape` *must* write these methods, or Java will refuse to compile!

### Step 2: Implement Inheritance and Child Classes
Inheritance allows child classes to inherit attributes and methods from a parent class using the `extends` keyword. Your task is to create three classes: `Rectangle`, `Square`, and `Cube`.

1.  **The `Rectangle` Class:**
    *   Create a class that extends `Shape`. Give it private fields for `width` and `length`, and a constructor to set them.
    *   Override `area()` to return width $\times$ length.
    *   Override `volume()` to return `0.0`.

2.  **The `Square` Class:**
    *   Create a class that extends `Shape`. Give it a private field for `side`, and a constructor.
    *   Override `area()` to return side $\times$ side.
    *   Override `volume()` to return `0.0`.

3.  **The `Cube` Class:**
    *   Create a class that extends `Shape`. Give it a private field for `side`, and a constructor.
    *   Override `area()` to return $6 \times \text{side} \times \text{side}$.
    *   Override `volume()` to return side $\times$ side $\times$ side.

### Step 3: Leverage Polymorphism
Polymorphism means "many forms." It allows us to treat different objects through the same uniform interface (`Shape`).

Write a helper method called `reportShape(Shape shape)` in your main program. It accepts *any* object derived from `Shape`. It doesn't need to know if it's a Rectangle, Square, or Cube—it just calls `.area()` and `.volume()`, and Java automatically runs the correct code for that specific shape!

```java
public static void reportShape(Shape shape) {
    System.out.println("Shape: " + shape.getClass().getSimpleName());
    System.out.printf("  - Area   : %.2f\n", shape.area());
    System.out.printf("  - Volume : %.2f\n", shape.volume());
    System.out.println("-----------------------------------");
}
```

Now, write your own `main` method, create a few shape objects, and pass them into `reportShape` to see polymorphism in action!

---

## Discussion Questions for Students
1. Why do we use the keyword `abstract` for the parent `Shape` class? What happens if you try to create an object directly using `Shape s = new Shape();`?
2. How does the `reportShape` function prove that polymorphism works? 