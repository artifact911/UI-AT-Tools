package org.art.spotify.pages;

import lombok.Getter;

@Getter
public enum SignUpPageMonth {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private final String name;

    SignUpPageMonth(String name) {
        this.name = name;
    }
}
