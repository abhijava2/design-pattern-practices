package com.being.developer.creational.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        System.err.println("Builder Pattern Example!");
        // Client code
            Pizza pizza = Pizza.PizzaBuilder.of()
                            .withDough("thin crust")
                            .withSauce("tomato sauce")
                            .withTopping("pepperoni")
                            .build();

            System.out.println("Here is your pizza:");
            System.out.println(pizza);     
    }     
}
