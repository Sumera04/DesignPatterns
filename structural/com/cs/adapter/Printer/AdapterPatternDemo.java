package com.cs.adapter.Printer;

//Client — Works with the target interface only
public class AdapterPatternDemo {
 public static void main(String[] args) {
     // Client expects Printer interface, not LegacyPrinter directly
     Printer printer = new PrinterAdapter(new LegacyPrinter());
     printer.print(); // Adapter internally calls legacy method
 }
}
