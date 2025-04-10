package ru.netology.radio;

public class Radio {
    private int volumeLevel; // текущий уровень громкости
    private int radioStationNumber; // текущий номер радиостанции
    private int maxStationsCount; // максимальное количество радиостанций

    public Radio() {
        this.maxStationsCount = 9; // установка максимального количества радиостанций, 10 шт. (от 0 до 9)
    }

    public Radio(int stationsCount) {
        this.maxStationsCount = stationsCount - 1;

    }

    public int getVolumeLevel() { // геттер для уровня громкости
        return volumeLevel;
    }

    public void limitMaxVolume() { // максимальный уровень громкости
        volumeLevel = 100;
    }

    public void setVolumeLevel(int newVolumeLevel) { // диапазон уровня громкости от 0 до 100
        if (newVolumeLevel < 0) {
            return;
        }
        if (newVolumeLevel > 100) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }

    public void increaseVolume() { // увеличить громкость на 1
        if (volumeLevel < 100) { // если значение 100 и нажать кнопку "+", то значение остается на 100
            volumeLevel = volumeLevel + 1;
        }
    }

    public void decreaseVolume() { // уменьшить громкость на 1
        if (volumeLevel > 0) { // если значение 0 и нажать кнопку "-", то значение остается на 0
            volumeLevel = volumeLevel - 1;
        }
    }

    public int getRadioStationNumber() { // геттер для номера радиостанции
        return radioStationNumber;
    }

    public void limitMaxRadioStation() { // максимальное кол-во выбора радиостанций
        radioStationNumber = maxStationsCount;
    }

    public void setRadioStationNumber(int RadioStationNumber) { // диапазон выбора номера радиостанции от 0 до 9
        if (RadioStationNumber < 0) {
            return;
        }
        if (RadioStationNumber > maxStationsCount) {
            return;
        }
        this.radioStationNumber = RadioStationNumber;
    }

    public void nextRadio() { // сменить радиостанцию кнопкой "next"
        if (radioStationNumber == maxStationsCount) {
            radioStationNumber = 0; // если значение 9 и нажать кнопку "next", то переходим на значение 0
        } else {
            radioStationNumber = radioStationNumber + 1;
        }
    }

    public void prevRadio() { // сменить радиостанцию кнопкой "prev"
        if (radioStationNumber == 0) {
            radioStationNumber = maxStationsCount; // если значение 0 и нажать кнопку "prev", то переходим на значение 9
        } else {
            radioStationNumber = radioStationNumber - 1;
        }
    }
}