package com.cs.singleton;
//Creational Design Pattern — Singleton
//Real-World Example: Logger (ensures consistent logging across app)
/*
Problem:
You want all parts of your application to log messages consistently
to the same file or console — not create multiple logger objects.

Solution:
Use Singleton so that only one Logger instance manages all logs.
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

 // Step 1: Private static variable to hold the single instance
 private static Logger instance;

 // Step 2: Private constructor prevents direct instantiation
 private Logger() {}

 // Step 3: Global access method (lazy initialization)
 public static Logger getInstance() {
     if (instance == null) {
         synchronized (Logger.class) {
             if (instance == null) {
                 instance = new Logger();
             }
         }
     }
     return instance;
 }

 // Example method — logs messages with timestamps
 public void log(String message) {
     SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
     System.out.println("[" + formatter.format(new Date()) + "] " + message);
 }

 public static void main(String[] args) {
     Logger logger1 = Logger.getInstance();
     Logger logger2 = Logger.getInstance();

     logger1.log("Application started");
     logger2.log("User logged in");

     System.out.println("Both loggers are same instance: " + (logger1 == logger2));
 }
}

/*
Output:
[10:32:01] Application started
[10:32:01] User logged in
Both loggers are same instance: true
*/

/* --- Interview Q&A ---

Q1: Why is Logger a good example of Singleton?
A1: Because you want all log messages to go through a single, consistent instance.

Q2: What happens if Logger wasn’t Singleton?
A2: Multiple logger instances could write to different files or formats — inconsistent logs.

Q3: How can we make this thread-safe?
A3: Use synchronized block (as shown) or use Enum Singleton in Java.

Q4: What if we want different log levels (INFO, ERROR)?
A4: Extend the log() method or use Strategy pattern for flexible logging behavior.

Q5: Real-world analogy:
A5: A single control tower (Logger) manages all flight communications (logs).
*/

