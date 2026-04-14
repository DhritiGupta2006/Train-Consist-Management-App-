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

## Use Case 3: Track Unique Bogie IDs (HashSet)

### 🎯 Objective
To enforce business rules that prevent duplicate bogie IDs from being registered. This use case introduces the `Set` interface and `HashSet` implementation to ensure data integrity within the railway system.

### 🔄 Application Flow
1. **Registration:** Several bogie IDs are added to a `HashSet`.
2. **Deduplication:** The system attempts to add a duplicate ID ("BG101").
3. **Rejection:** The `HashSet` automatically rejects the duplicate, maintaining only unique values.
4. **Summary:** The program displays the verified list of unique IDs and the total count.

