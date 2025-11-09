package com.cs.builder;

/**
 * Builder Pattern Example: Computer
 *
 * Intent: Separate construction of a complex object from its representation.
 * Allows step-by-step construction of objects with optional parameters.
 *
 * Principles Followed:
 * 1. SRP (Single Responsibility Principle) - Computer holds data; Builder constructs object.
 * 2. OCP (Open/Closed Principle) - Adding new optional parameters does not modify client code.
 * 3. Encapsulation - Fields are private, object constructed via builder.
 * 4. Immutability - Built object is immutable after construction.
 * 5. Fluent Interface - Method chaining improves readability.
 */
class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private boolean wifiEnabled;
    private boolean bluetoothEnabled;

    // Private constructor ensures object is only created via Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.wifiEnabled = builder.wifiEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu + ", RAM: " + ram + "GB, Storage: " + storage + "GB");
        System.out.println("GPU: " + gpu + ", WiFi: " + wifiEnabled + ", Bluetooth: " + bluetoothEnabled);
    }

    /**
     * Builder class for Computer
     *
     * Responsibilities:
     * - Construct Computer object step-by-step.
     * - Provide fluent interface for setting optional parameters.
     *
     * Principles Followed:
     * 1. SRP - Builder only handles construction.
     * 2. OCP - New optional parameters can be added as new builder methods.
     * 3. Fluent Interface - Method chaining improves readability.
     */
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private boolean wifiEnabled;
        private boolean bluetoothEnabled;

        public Builder setCPU(String cpu) {
            this.cpu = cpu; return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram; return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage; return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu; return this;
        }

        public Builder setWiFiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled; return this;
        }

        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled; return this;
        }

        // Constructs the actual Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}