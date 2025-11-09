package com.cs.factory.usingInterface;

//------------------ Interface-based Factory Pattern ------------------

/**
* - Interface used because all types share behavior, not implementation.
* - Follows SRP, OCP, DIP, and Polymorphism principles.
* - Extensible: adding WhatsAppNotification requires no change in client.
* - Use interfaces when classes share *behavioral contracts* but not state or logic.
*/

/**
* Interface representing a generic Notification.
* 
* Follows Interface Segregation Principle (ISP) — defines minimal required behavior.
* Promotes Polymorphism — all notification types can be treated uniformly.
* Supports Dependency Inversion Principle (DIP) — client depends on abstraction, not concretion.
*/
interface Notification {
 void notifyUser();
}

