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

---

## Use Case 13: Performance Comparison (Loops vs Streams)

### 🎯 Objective
To evaluate the execution efficiency of different iteration styles. This use case moves away from theoretical assumptions and uses `System.nanoTime()` to measure actual performance between imperative loops and functional streams.

### 🔄 Application Flow
1. **Data Generation:** A large list (10,000 items) is generated to provide a meaningful benchmark.
2. **Measurement (Loop):** The system records the start and end time of a standard `for-each` loop filter.
3. **Measurement (Stream):** The system records the start and end time of a `stream().filter()` pipeline.
4. **Analysis:** The elapsed times are compared to show the overhead vs. readability trade-offs.

---

## Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)

### 🎯 Objective
To enforce "fail-fast" validation using custom exception handling. This ensures that only logically valid bogies (capacity > 0) are added to the train system, preventing data corruption in analytics and reporting.

### 🔄 Application Flow
1. **Validation:** The `PassengerBogie` constructor checks the capacity value before assignment.
2. **Exception Throwing:** If `capacity <= 0`, the system throws a custom `InvalidCapacityException`.
3. **Exception Handling:** The calling code uses `try-catch` blocks to manage errors gracefully without crashing the application.
4. **Outcome:** Invalid objects are never fully instantiated, ensuring only valid data exists in the system.

---

## Use Case 15: Safe Cargo Assignment Using try-catch-finally

### 🎯 Objective
To handle runtime operational errors without crashing the system. This use case uses `try-catch-finally` to manage unsafe cargo assignments (e.g., Petroleum in a Rectangular bogie) while ensuring audit logs are always written.

### 🔄 Application Flow
1. **Assignment Request:** The user attempts to assign a cargo type to an existing bogie.
2. **Rule Validation:** Inside the `try` block, the system checks if the shape/cargo combination is hazardous.
3. **Exception Handling:** If unsafe, a `CargoSafetyException` is thrown and caught by the `catch` block, preventing a crash.
4. **Cleanup/Logging:** The `finally` block executes a mandatory audit log entry, regardless of whether the assignment succeeded or failed.
5. **Continuation:** The application remains stable and ready for the next command.

---

## Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)

### 🎯 Objective
To implement the Bubble Sort algorithm manually. This ensures a deep understanding of comparison-based sorting and array manipulation without relying on `Arrays.sort()`.

### 🔄 Algorithmic Flow
1. **Adjacent Comparison:** Compare two neighboring capacities.
2. **Positional Swap:** If the first is larger than the second, they swap places.
3. **Ascending Bubble:** High-capacity values move toward the end of the list with each iteration.
4. **Completion:** The loops terminate once every element is smaller than its successor.

---

## Use Case 17: Sort Bogie Names Using Arrays.sort()

### 🎯 Objective
To transition from manual algorithms to optimized standard library methods. This use case demonstrates how `Arrays.sort()` provides a more maintainable, readable, and efficient way to organize train data alphabetically.

### 🔄 Application Flow
1. **Input:** A string array containing various bogie type names in unsorted order.
2. **Library Call:** The system invokes `Arrays.sort(bogieNames)`, which uses Java's optimized internal sorting logic.
3. **Internal Sorting:** The strings are compared based on their Unicode values (Natural Ordering).
4. **Output:** The sorted array is printed using `Arrays.toString()`.

---

## Use Case 18: Linear Search for Bogie ID (Array-Based Searching)

### 🎯 Objective
To implement a reliable search mechanism for identifying specific bogies. This use case teaches sequential traversal and equality comparison, allowing the system to pinpoint data within an unsorted consist.

### 🔄 Application Flow
1. **Input:** An array of Bogie IDs and a target "Search Key."
2. **Traversal:** The system iterates through the array from index 0 to $n-1$.
3. **Comparison:** Every element is checked against the key using `.equals()`.
4. **Early Termination:** If a match is found, the loop breaks immediately to save processing time.
5. **Output:** The system reports whether the bogie exists in the current consist.


