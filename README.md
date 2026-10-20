# Java Fundamentals

**Small Java programs for practicing input, arithmetic, control flow, and methods.**

These are early programming exercises. Each source file is a separate example, and the collection records the foundations behind my larger projects.

## Explore the code

| Area | Examples |
| --- | --- |
| Arithmetic and methods | [calculator.java](calculator.java), [DriveCost.java](DriveCost.java), [Bmis.java](Bmis.java) |
| Conditions and number operations | [Palindrome.java](Palindrome.java), [Case.java](Case.java), [Randommath.java](Randommath.java) |
| Applied calculations | [Paint.java](Paint.java), [timeconvert.java](timeconvert.java), [tria.java](tria.java) |
| Additional practice | [multiple.java](multiple.java), [pop2.java](pop2.java) |

## Run an example

With a JDK installed, run these commands from the repository root:

```bash
javac -d out Palindrome.java
java -cp out time.Palindrome
```

The class declares the `time` package, so the package name is required when launching it. The `-d out` option creates the matching package directory automatically.

```text
Enter a three digit num:
121
This is a palindrome!
```

Try `123` to exercise the non-palindrome branch. This sample is intended for three-digit positive numbers; it is not a general-purpose palindrome library.

Compile each exercise independently and check its package declaration before running it. This repository has no shared build system or unified test suite. The palindrome compile-and-run example above was checked during the documentation update.

## Continue exploring

- [Java applications and data structures](https://github.com/Stormshaper455/School) — linked lists, graph algorithms, and JavaFX exercises.
- [Python + SQLite Staff Manager](https://github.com/Stormshaper455/My-projects-/tree/main/python-sql-staff-manager) — a persistent database application with integration checks.
- [My GitHub profile](https://github.com/Stormshaper455) — selected projects and current focus.
