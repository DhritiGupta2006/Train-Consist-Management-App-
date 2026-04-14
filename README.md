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

---

## Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)

### 🎯 Objective
To combine the benefits of uniqueness (from Set) and predictable sequencing (from List). This ensures that a train consist is both physically accurate in its order and logically sound by preventing duplicate attachments.

### 🔄 Application Flow
1. **Attachment:** Bogies are added in a specific order: Engine, Sleeper, Cargo, Guard.
2. **Duplicate Check:** An attempt is made to add "Sleeper" again.
3. **Internal Logic:** The `LinkedHashSet` identifies the duplicate and ignores it without crashing.
4. **Display:** The program prints the final formation, showing the original order with no duplicates.

---

## Use Case 6: Map Bogie to Capacity (HashMap)

### 🎯 Objective
To associate bogies with operational attributes like seating or load capacity. This use case moves beyond flat lists or sets by introducing key-value data representation using the `HashMap`.

### 🔄 Application Flow
1. **Mapping Creation:** A `HashMap` is initialized where bogie names are keys and capacities are values.
2. **Data Entry:** Capacities for different bogie types (e.g., Sleeper, Cargo) are inserted using `put()`.
3. **Iteration:** The system traverses the `entrySet()` to retrieve both the bogie name and its capacity.
4. **Output:** The console displays a formatted mapping of all registered bogie capacities.

---

## Use Case 7: Sort Bogies by Capacity (Comparator)

### 🎯 Objective
To rank and organize bogies based on business logic (seating capacity). This use case introduces custom objects and the `Comparator` interface to enable flexible, non-natural ordering.

### 🔄 Application Flow
1. **Object Creation:** Bogies are created as objects with `name` and `capacity` properties.
2. **Storage:** Objects are stored in a dynamic `List`.
3. **Sorting:** A `Comparator` is applied to rearrange the list based on the integer capacity.
4. **Output:** The console displays the bogies ranked from lowest to highest capacity.

---

## Use Case 9: Group Bogies by Type (Collectors.groupingBy)

### 🎯 Objective
To transform flat data into a hierarchical structure. This use case uses advanced Stream collectors to categorize bogies by type, facilitating organized reporting and resource management.

### 🔄 Application Flow
1. **Source:** A list of `Bogie` objects containing different types (Sleeper, AC Chair, etc.).
2. **Classification:** A stream is processed where each bogie is classified by its `type`.
3. **Aggregation:** `Collectors.groupingBy` gathers bogies of the same type into lists.
4. **Storage:** The result is stored in a `Map<String, List<Bogie>>`.
5. **Output:** The system prints a structured report showing all bogies grouped under their respective categories.

---

## Use Case 10: Count Total Seats in Train (reduce)

### 🎯 Objective
To provide numerical metrics for the train consist by aggregating individual bogie capacities into a total value. This introduces the concept of reduction in functional programming.

### 🔄 Application Flow
1. **Data Source:** A list of `Bogie` objects with varying capacities.
2. **Transformation:** The `map()` function extracts only the `capacity` (Integer) from each object.
3. **Aggregation:** The `reduce(0, Integer::sum)` operation adds all extracted values together.
4. **Output:** The system displays the final total seating capacity of the entire train.

---

## Use Case 11: Validate Train ID & Cargo Codes (Regex)

### 🎯 Objective
To ensure data integrity by validating user input against strict business rules. This use case introduces `Pattern` and `Matcher` to prevent malformed data from entering the system.

### 🔄 Application Flow
1. **Regex Definition:** Patterns are defined for Train IDs (`TRN-\d{4}`) and Cargo Codes (`PET-[A-Z]{2}`).
2. **Compilation:** The `Pattern` class compiles these strings for efficient reuse.
3. **Matching:** The `Matcher` class compares input strings against the compiled patterns.
4. **Validation:** The system uses `matches()` to confirm if the entire string follows the rule, rejecting incorrect formats like lowercase letters or wrong digit counts.

