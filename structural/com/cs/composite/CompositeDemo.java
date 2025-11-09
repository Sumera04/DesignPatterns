package com.cs.composite;

//Real-World Example: Company hierarchy where managers supervise employees (tree-like structure)
/*
Principles Followed:
- Single Responsibility Principle (SRP): Each class represents either a composite (Manager) or a leaf (Employee).
- Open/Closed Principle (OCP): New roles (e.g., Intern, TeamLead) can be added without changing existing code.
- Liskov Substitution Principle (LSP): Both leaf and composite types can be treated uniformly via the Employee interface.
- Dependency Inversion Principle (DIP): Client code depends on the abstraction (Employee), not concrete implementations.

Pros of Composite Pattern:
1. Treats individual and composite objects uniformly.
2. Simplifies client code by allowing the same operations on both single objects and groups.
3. Facilitates easy addition or removal of elements in the hierarchy.
4. Naturally models tree structures like organizations, filesystems, or menus.

Real-World Analogy:
- An organization chart: CEO → Managers → Developers.
- A file system: Folders (composites) can contain files (leaves) or other folders.
*/
public class CompositeDemo {
  public static void main(String[] args) {
      // Leaf nodes
      Employee dev1 = new Developer("Alice", "Frontend Developer");
      Employee dev2 = new Developer("Bob", "Backend Developer");

      // Composite node
      Employee manager = new Manager("Charlie", "Engineering Manager");
      manager.add(dev1);
      manager.add(dev2);

      // Higher-level composite node
      Employee ceo = new Manager("Diana", "CEO");
      ceo.add(manager);

      // Display entire structure
      ceo.showDetails();
  }
}

/*Interview Q&A:
Q1: What problem does the Composite Pattern solve?
A1: It enables uniform treatment of single objects (leaves) and object groups (composites) within hierarchical structures.

Q2: How is Composite different from Decorator?
A2: Composite organizes objects into a tree hierarchy; Decorator dynamically adds behavior to a single object.

Q3: How does it follow the Liskov Substitution Principle?
A3: Both leaf and composite types implement the same interface, allowing interchangeable use.

Q4: What’s a common real-world use of Composite?
A4: File systems, GUI components (containers and controls), and organizational hierarchies.

Q5: What are the drawbacks?
A5: Can make the design too general and may expose operations that don’t make sense for leaf objects (e.g., add/remove on Developer).
*/
