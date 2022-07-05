package models;

import com.github.javafaker.Faker;


public class TagsFactory {
    static Faker faker = new Faker();

    public static Tags get() {
        return Tags.builder()
                .tags(faker.slackEmoji().foodAndDrink())
                .build();

    }
}