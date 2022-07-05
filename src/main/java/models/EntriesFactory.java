package models;

import com.github.javafaker.Faker;


public class EntriesFactory{
    static Faker faker = new Faker();

    public static Entries get() {
        return Entries.builder()
                .entries(faker.name().firstName())
                .build();

    }
}