# OOPS Banner App

## Overview

OOPS Banner App is a Java console application that demonstrates the progressive application of Java programming concepts, Object-Oriented Programming principles, Collections Framework, and code refactoring techniques.

The application displays the word **"OOPS"** in a banner format using ASCII art patterns.

The final implementation (UC8) uses a **HashMap**, **StringBuilder**, **Nested Loops**, and **Reusable Methods** to create a scalable and maintainable banner rendering system.

---

## Features

* Display the word **OOPS** in banner format.
* Store character patterns using a **HashMap**.
* Dynamically render words using character lookups.
* Reusable and modular code structure.
* Demonstrates Object-Oriented Programming concepts.
* Uses Java Collections Framework.
* Uses efficient StringBuilder-based string construction.

---

## Technologies Used

* Java
* IntelliJ IDEA
* Git & GitHub
* Java Collections Framework
* Object-Oriented Programming

---

## Project Evolution

### UC1 - Print OOPS

Print the text "OOPS" to the console.

### UC2 - Banner using Print Statements

Display OOPS using ASCII art and multiple print statements.

### UC3 - Banner using String.join()

Replace string concatenation with String.join() for improved readability.

### UC4 - String Array and Loop

Store banner lines in an array and use loops for rendering.

### UC5 - Inline Array Initialization

Initialize the entire banner array in a single statement.

### UC6 - Refactor into Functions

Move character pattern generation into reusable methods.

### UC7 - Character Pattern Class

Introduce a CharacterPattern class to encapsulate character data and patterns.

### UC8 - HashMap Based Rendering (Final Version)

Store character patterns in a HashMap and dynamically render banner messages using lookups.

This approach provides:

* Better scalability
* Better maintainability
* Dynamic character lookup
* Reduced code duplication
* Improved modularity

---

## OOPS Concepts Demonstrated

### Encapsulation

Character patterns are managed through dedicated methods and data structures.

### Abstraction

Pattern generation is hidden behind utility methods.

### Modularity

Pattern creation and rendering logic are separated.

### Reusability

Character patterns can be reused for multiple banner messages.

### Single Responsibility Principle

Each method performs one specific task.

---

## Collections Framework Usage

### HashMap

Used to store character-pattern mappings.

Example:

```java
'O' -> O Pattern
'P' -> P Pattern
'S' -> S Pattern
```

Benefits:

* Fast lookup
* Dynamic rendering
* Easy extensibility

---

## Data Structure Used

```java
HashMap<Character, String[]>
```

Where:

* Key = Character
* Value = Banner Pattern

Example:

```java
Map<Character, String[]> patterns
```

---

## Algorithm

1. Create banner patterns for O, P and S.
2. Store patterns in a HashMap.
3. Convert the word "OOPS" into a character array.
4. Iterate through banner rows.
5. For each row:

    * Retrieve pattern from HashMap.
    * Append pattern using StringBuilder.
6. Print the assembled row.
7. Repeat until all rows are rendered.

---

## Sample Output

```text
 ****    ****    *****     ****
*    *  *    *   *    *   *
*    *  *    *   *****     ***
*    *  *    *   *            *
 ****    ****    *        ****
```

---

## Project Structure

```text
OOPSBannerApp
│
├── src
│   └── com
│       └── src
│           └── OOPSBannerApp.java
│
├── README.md
└── .gitignore
```

---

## Git Workflow Followed

```text
main
 │
 └── dev
      │
      ├── feature/UC1-PrintOOPS
      ├── feature/UC2-BannerPrint
      ├── feature/UC3-StringJoin
      ├── feature/UC4-StringArrayLoop
      ├── feature/UC5-InlineArrayInitialization
      ├── feature/UC6-MethodRefactoring
      ├── feature/UC7-CharacterPatternClass
      └── feature/UC8-HashMapPatterns
```

Feature branches were merged into the dev branch after successful implementation and testing.

---

## Key Learnings

* Java Fundamentals
* Arrays
* Loops
* Methods
* Inner Classes
* Constructors
* Getters
* Encapsulation
* HashMap
* StringBuilder
* Nested Loops
* Git Branching Strategy
* Feature Branch Workflow
* Code Refactoring Techniques

---

## Author

Aryan Pujari

Java Full Stack Development Learning Project
