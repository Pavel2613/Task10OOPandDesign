package ru.netology.radio;

public class Radio {
    private int volumeLevel; // текущий уровень громкости
    private int radioStationNumber; // текущий номер радиостанции

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
        radioStationNumber = 9;
    }

    public void setRadioStationNumber(int newRadioStationNumber) { // диапазон выбора номера радиостанции от 0 до 9
        if (newRadioStationNumber < 0) {
            radioStationNumber = 9;
        }
        if (newRadioStationNumber > 9) {
            radioStationNumber = 0;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void nextRadio() { // сменить радиостанцию кнопкой "next"
        if (radioStationNumber == 9) {
            radioStationNumber = 0; // если значение 9 и нажать кнопку "next", то переходим на значение 0
        } else {
            radioStationNumber = radioStationNumber + 1;
        }
    }

    public void prevRadio() { // сменить радиостанцию кнопкой "prev"
        if (radioStationNumber == 0) {
            radioStationNumber = 9; // если значение 0 и нажать кнопку "prev", то переходим на значение 9
        } else {
            radioStationNumber = radioStationNumber - 1;
        }
    }
}