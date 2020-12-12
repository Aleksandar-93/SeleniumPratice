package com.cybertek.tests;

import com.github.javafaker.Faker;

public class HelloWorld {
    // Maven using IntelliJ Idea from test automation shorts
    public static void main(String[] args) {
        System.out.println("hello world");

        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());

        System.out.println(faker.chuckNorris().fact());

    }
}
