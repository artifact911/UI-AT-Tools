package org.art.spotify.pages;

import lombok.Getter;

@Getter
public enum SignUpPageGender {
    MALE("Мужчина"),
    FEMALE("Женщина"),
    OTHER("Другое"),
    NO_ANSWER("Не хочу отвечать");

    private final String name;

    SignUpPageGender(String name) {
        this.name = name;
    }
}
