package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.builder;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {

    //pizza details
    private final String size;
    private final String crust;
    private final List<String> toppings;

    // Customer Information
    private final String customerName;
    private final String customerPhone;

    // Delivery Preferences
    private final boolean isDelivery;
    private final int deliveryTimeMinutes;

    // Payment Details
    private final String paymentMethod;

    // Special Instructions
    private final String specialInstructions;

    // Private constructor to enforce usage of the builder
    private PizzaOrder(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
        this.customerName = builder.customerName;
        this.customerPhone = builder.customerPhone;
        this.isDelivery = builder.isDelivery;
        this.deliveryTimeMinutes = builder.deliveryTimeMinutes;
        this.paymentMethod = builder.paymentMethod;
        this.specialInstructions = builder.specialInstructions;
    }

    // Static Builder Class
    public static class Builder {
        private String size;
        private String crust;
        private List<String> toppings = new ArrayList<>();
        private String customerName;
        private String customerPhone;
        private boolean isDelivery = true; // Default value
        private int deliveryTimeMinutes = 30; // Default value
        private String paymentMethod;
        private String specialInstructions;

        // Builder Methods
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Builder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public Builder isDelivery(boolean isDelivery) {
            this.isDelivery = isDelivery;
            return this;
        }

        public Builder deliveryTimeMinutes(int deliveryTimeMinutes) {
            this.deliveryTimeMinutes = deliveryTimeMinutes;
            return this;
        }

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder specialInstructions(String specialInstructions) {
            this.specialInstructions = specialInstructions;
            return this;
        }

        // Build Method
        public PizzaOrder build() {
            return new PizzaOrder(this);
        }
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", toppings=" + toppings +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", isDelivery=" + isDelivery +
                ", deliveryTimeMinutes=" + deliveryTimeMinutes +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", specialInstructions='" + specialInstructions + '\'' +
                '}';
    }

}
