package com.cs.abstractFactory.usingInterface;

/**
 * The Abstract Factory Pattern provides an interface for creating families of related or 
 * dependent objects without specifying their concrete classes. 
 * In this example, each NotificationAbstractFactory creates a Notification and its corresponding Template.
 * This ensures consistent pairing and isolates creation logic.
 * It follows SRP, OCP, and DIP, making the system scalable and easy to extend —
 * for example, adding a WhatsAppNotificationFactory won’t require changing existing code.”
 * 
 * The client code depends only on the abstract factory and abstract products.
 * 
 * DIP — client depends on abstractions, not implementations.
 * Polymorphism — same code works for all families.
 * 
 * Notes & SOLID Principles:
 * ---------------------------------------------------------------
 * SRP — each class/factory handles one specific task.
 * OCP — add new families (e.g., WhatsAppNotification) without changing existing code.
 * DIP — client depends on abstractions (interfaces), not concrete classes.
 * LSP — each subclass (Email, SMS, Push) can safely replace its parent interface.
 * Polymorphism — factories and products are used interchangeably.
 *
 * Advantages:
 * - Ensures that products from the same family (Notification + Template) are compatible.
 * - Centralizes creation logic in one place.
 * - Enables plug-and-play extensibility.
 *
 * When to Use Abstract Factory:
 * - When your system needs to create *families of related objects*.
 * - When you want to keep creation logic consistent across product families.
 * - When adding new types frequently (Email → WhatsApp, Slack, etc.).
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {

        // Choose which factory to use (could come from configuration)
        NotificationAbstractFactory factory = new SMSNotificationFactory();

        // Create the products via factory
        Notification notification = factory.createNotification();
        NotificationTemplate template = factory.createTemplate();

        // Use them
        System.out.println("Using Template: \n" + template.getTemplateContent());
        notification.notifyUser();
    }
}

/* 
 Q&A – ABSTRACT FACTORY PATTERN

Q1: What is the Abstract Factory Pattern?
A1: It is a creational design pattern that provides an interface for creating families of related 
or dependent objects without specifying their concrete classes.

Q2: What problem does it solve?
A2: It helps ensure that a family of related objects (e.g., UI components for a specific OS theme) 
are created together, maintaining consistency and avoiding incompatible combinations.

Q3: What is the key difference between Factory Method and Abstract Factory?
A3: 
- Factory Method focuses on creating one product type (via inheritance).
- Abstract Factory focuses on creating families of related products (via composition).

Q4: What is a real-world example of the Abstract Factory Pattern?
A4:
- UI frameworks that generate components for different operating systems (WindowsButton, MacButton).
- Database toolkits that provide specific connections and queries per database vendor.
- Notification systems that create both Notifiers and Templates for different channels.

Q5: What are the main participants in the Abstract Factory Pattern?
A5:
- AbstractFactory: Declares interfaces for creating products.
- ConcreteFactory: Implements creation of related products.
- AbstractProduct: Declares product interfaces.
- ConcreteProduct: Implements concrete versions of products.
- Client: Uses the factory to create products without knowing concrete classes.

Q6: Which SOLID principles does it follow?
A6:
- SRP: Each factory has a single purpose — creating a family of products.
- OCP: You can introduce new factories without modifying existing code.
- DIP: Client depends on abstract factories and product interfaces, not concrete classes.

Q7: What are the advantages of using Abstract Factory?
A7:
- Ensures compatibility among products in the same family.
- Promotes consistency across related objects.
- Provides a clear separation between product creation and usage.
- Makes it easy to switch entire product families at runtime.

Q8: What are the disadvantages?
A8:
- Adds complexity and number of classes.
- Difficult to add new product types once the factory interfaces are defined.

Q9: When should you use the Abstract Factory Pattern?
A9:
- When you need to create families of related or dependent objects.
- When systems should be independent of how their products are created or composed.
- When enforcing consistency between products is important.

Q10: What are some examples in Java libraries or frameworks?
A10:
- Swing and AWT UI factories (e.g., Toolkit for OS-specific components).
- Java Persistence API (JPA) creating platform-specific entity managers.
- Spring BeanFactory and ApplicationContext abstractions.

Q11: How does Abstract Factory relate to other creational patterns?
A11:
- Often built on top of Factory Method implementations.
- Can work alongside the Prototype Pattern to clone products instead of instantiating them.
- Simplifies client code compared to using multiple separate factories.
*/

