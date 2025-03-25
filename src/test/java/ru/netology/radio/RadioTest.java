package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test // геттер для уровня громкости
    public void volumeMustSet() {
        Radio radio = new Radio();

        radio.setVolumeLevel(1);

        int expected = 1;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test // максимальный уровень громкости
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.limitMaxVolume();

        int expected = 100;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);

    }

    @Test // диапазон уровня громкости от 0 до 100
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolumeLevel(50);

        int expected = 50;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);

        radio.setVolumeLevel(-1);

        Assertions.assertEquals(expected, actual);

        radio.setVolumeLevel(101);

        Assertions.assertEquals(expected, actual);

    }

    @Test // если значение 100 и нажать кнопку "+", то значение остается на 100
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.volumeLevel = 99;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);

        radio.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test // если значение 0 и нажать кнопку "-", то значение остается на 0
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.volumeLevel = 1;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);

        radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test // геттер для номера радиостанции
    public void getRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(2);

        int expected = 2;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // максимальное кол-во выбора радиостанций
    public void limitMaxRadioStation() {
        Radio radio = new Radio();

        radio.limitMaxRadioStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test // диапазон выбора номера радиостанции от 0 до 9
    public void setRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

        radio.setRadioStationNumber(-1);

        Assertions.assertEquals(expected, actual);

        radio.setRadioStationNumber(10);

        Assertions.assertEquals(expected, actual);

    }

    @Test // если значение 9 и нажать кнопку "next", то значение меняется на 0
    public void nextRadio() {
        Radio radio = new Radio();

        radio.radioStationNumber = 9;
        radio.nextRadio();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test // если значение 9 и нажать кнопку "next", то значение меняется на 0
    public void prevRadio() {
        Radio radio = new Radio();

        radio.radioStationNumber = 0;
        radio.prevRadio();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }
}