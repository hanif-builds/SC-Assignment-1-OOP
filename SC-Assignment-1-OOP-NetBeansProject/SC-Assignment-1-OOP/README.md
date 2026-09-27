# SC-Assignment-1-OOP

Software Construction — Assignment 01 (OOP Concepts: Encapsulation, Inheritance, Polymorphism, Abstraction, AI Code Review)

**Author:** Hanif Ullah
**Course:** Software Construction — UET Peshawar, Abbottabad Campus
**Instructor:** Engr. Rizwan Shah

## Structure

```
SC-Assignment-1-OOP/
├── Task1/
│   └── DigitalWallet.java        (Encapsulation)
├── Task2/
│   ├── Employee.java             (contains Employee, Developer, SalesManager)
│   └── Main.java                 (Polymorphism demo)
├── Task3/
│   ├── SmartDevice.java          (interface)
│   ├── SmartBulb.java
│   └── SmartThermostat.java
├── Task4/
│   ├── LibrarySystem_Original_AIVersion.java   (unmodified AI output)
│   └── LibrarySystem_Fixed.java                (corrected version)
└── README.md
```

## Task 1 — The 'Broken Vault' (Encapsulation)
`DigitalWallet` hides `accountHolder`, `balance`, and `pinCode` behind private fields.
`pinCode` is `final` — set once in the constructor, never exposed via a getter.
`withdraw(amount, enteredPin)` is the only way balance changes, and only succeeds if
the PIN matches (checked via `.equals()`, not `==`) and sufficient funds exist.

**Run it:**
```
cd Task1
javac DigitalWallet.java
java DigitalWallet
```

## Task 2 — The 'Evolving Workforce' (Inheritance & Polymorphism)
`Employee` is the base class; `Developer` and `SalesManager` extend it and override
`calculatePay()` with their own formula. `Main` builds a `List<Employee>` containing
both subclasses and proves polymorphism: the same line, `employee.calculatePay()`,
produces a different result depending on the real object stored at that position.

**Run it:**
```
cd Task2
javac *.java
java Main
```

## Task 3 — 'Design by Contract' (Abstraction)
`SmartDevice` is an interface with `turnOn()`, `turnOff()`, `getStatus()`.
`SmartBulb` and `SmartThermostat` both implement it, each with completely different
internal behavior, plus their own unique method (`setBrightness()` / `setTemperature()`).

**Run it:** (write a small test class, or import into your own Main)
```
cd Task3
javac *.java
```

## Task 4 — The AI Code Review (Meta-Learning)
`LibrarySystem_Original_AIVersion.java` is what a typical AI tool returns for the
prompt: *"Write a Java program for a simple Library System using OOP. Include classes
for Book and Member."* It uses public fields with no validation, allowing the same
book to be issued to two members at once. `LibrarySystem_Fixed.java` corrects this by
moving the issue/return logic inside `Book` itself, which guards its own state.

**Run either version:**
```
cd Task4
javac LibrarySystem_Original_AIVersion.java && java LibrarySystem_Original_AIVersion
javac LibrarySystem_Fixed.java && java LibrarySystem_Fixed
```

## Full written report (code + reflections)
See the submitted PDF for code snippets and written reflections for all four tasks.
