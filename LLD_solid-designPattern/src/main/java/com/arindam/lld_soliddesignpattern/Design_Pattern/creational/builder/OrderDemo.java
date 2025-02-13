package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.builder;

public class OrderDemo {

    public static void main(String[] args) {

        PizzaOrder pizzaOrder = new PizzaOrder.Builder().size("Large")
                .crust("Thin")
                .addTopping("Cheese")
                .addTopping("Pepperoni")
                .customerName("Arindam")
                .customerPhone("1234567890")
                .isDelivery(true)
                .deliveryTimeMinutes(30)
                .paymentMethod("Credit Card")
                .specialInstructions("Extra Crispy")
                .build();

    }
}
