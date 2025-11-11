package com.cs.interpreter;

//Behavioral Design Pattern
//Real-World Example: Expression evaluator for simple logical or mathematical grammar

/*
Principles Followed:
- Single Responsibility Principle (SRP): Each Expression class handles one grammar rule or operation.
- Open/Closed Principle (OCP): New rules or expressions can be added without modifying existing code.
- Encapsulation: Each expression encapsulates its interpretation logic.

Pros of Interpreter Pattern:
1. Makes it easy to define and extend simple grammars.
2. Each rule is represented clearly as a class.
3. Easy to evaluate complex expressions by combining smaller expressions.

Cons:
1. Becomes hard to manage for large grammars (many classes).
2. Slower compared to parser generators for complex languages.

Real-World Analogy:
- Language Translator: Each word (terminal) and grammar rule (non-terminal) knows how to interpret 
  itself to produce meaning.
- Calculator: Each operation (+, -, AND, OR) interprets its result based on input expressions.
*/

//Step 4: Client — builds grammar and evaluates sentences
public class InterpreterDemo {
  // Rule: "John is male" -> John OR Robert
  public static Expression getMaleExpression() {
      Expression john = new TerminalExpression("John");
      Expression robert = new TerminalExpression("Robert");
      return new OrExpression(john, robert);
  }

  // Rule: "Julie is a married woman" -> Julie AND Married
  public static Expression getMarriedWomanExpression() {
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);
  }

  public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
  }
}

/* Interview Q&A:

Q1: What is the Interpreter Pattern?
A1: It defines a grammar for a language and provides an interpreter to evaluate expressions written in that language.

Q2: When to use the Interpreter Pattern?
A2: When you have a simple, well-defined grammar that needs to be parsed or evaluated 
frequently (e.g., calculators, search filters, configuration rules).

Q3: What are Terminal and Non-Terminal Expressions?
A3: 
- Terminal: Represents basic symbols or variables (leaf nodes).
- Non-Terminal: Represents grammar rules composed of other expressions.

Q4: How does it follow design principles?
A4: Each expression handles one rule (SRP) and new rules can be added without modifying existing code (OCP).

Q5: Real-world examples?
A5:
- SQL Query parsing
- Expression evaluation in calculators
- Rule engines or filter matchers (like email filters).

Q6: Drawback?
A6: Large grammars lead to too many small classes, making it complex to maintain.
*/

