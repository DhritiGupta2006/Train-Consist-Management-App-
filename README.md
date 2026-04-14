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

## Use Case 2: Object-Oriented Bogie Management

### 🎯 Objective
To transition from simple String lists to a more robust Object-Oriented model. This use case introduces a dedicated `Bogie` class to store complex data (IDs and Types) instead of raw text.

### 🔄 Application Flow
1. **Object Creation:** A separate `Bogie` class is defined with properties like `id` and `type`.
2. **List Initialization:** The `ArrayList` is typed to hold `Bogie` objects: `List<Bogie>`.
3. **Attachment:** New `Bogie` instances are created and added to the train.
4. **ID Search:** The program iterates through the list to find a specific bogie by its unique ID.

