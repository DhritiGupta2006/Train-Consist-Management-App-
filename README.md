# Train Consist Management App

This application simulates a railway management system to handle train compositions, including passenger and goods bogies.

---

## Use Case 1: Initialize Train and Display Consist Summary

### 🎯 Objective
To initialize the application state and create a dynamic container for the train consist. This introduces the entry point of Java applications and the basics of dynamic collections.

### 🔄 Application Flow
1. **Startup:** The user runs the program.
2. **Greeting:** Application prints a welcome message.
3. **Initialization:** An empty `ArrayList` is created to hold future bogies.
4. **Summary:** The program displays the current bogie count (0).

---

## Use Case 4: Maintain Ordered Bogie Consist (LinkedList)

### 🎯 Objective
To model the physical chaining of train bogies where the sequence (Locomotive → Passenger → Cargo) is critical. This use case introduces `LinkedList` to support efficient positional insertions and removals.

### 🔄 Application Flow
1. **Chaining:** A `LinkedList` is initialized to store bogies in a specific sequence.
2. **Growth:** Bogies (Engine, Sleeper, AC, Cargo, Guard) are added in order.
3. **Mid-Sequence Insertion:** A "Pantry Car" is inserted at index 2.
4. **Detachment:** The system removes the first (Engine) and last (Guard) bogies.
5. **Final Layout:** The program displays the surviving ordered consist.
