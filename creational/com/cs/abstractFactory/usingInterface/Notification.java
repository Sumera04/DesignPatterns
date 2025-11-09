package com.cs.abstractFactory.usingInterface;

/**
 * The Notification interface defines the behavior of sending a message.
 * 
 * Follows Interface Segregation Principle (ISP) — minimal contract.
 * Enables Polymorphism — all notifications behave the same externally.
 */
interface Notification {
	void notifyUser();
}

