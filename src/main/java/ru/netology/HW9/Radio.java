package ru.netology.HW9;

public class Radio {
    private int radioStation;
    private int currentVolume;

    public int getRadioStation() {
        return radioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setRadioStation(int newRadioStation) {

        if (newRadioStation > 9) {
            return;
        }
        if (newRadioStation < 0) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {

        if (radioStation < 9) {
            radioStation = radioStation + 1;
        } else radioStation = 0;

    }

    public void prevRadioStation() {

        if (radioStation > 0) {
            radioStation = radioStation - 1;
        } else radioStation = 9;

    }

    public void setVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
