package ru.netology.HW9;

public class Radio {

    private int amountStations = 10;
    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int radioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        int amountStation = 10;
    }

    public Radio(int amountStations) {
        this.amountStations = amountStations;
        amountStations = lastRadioStation + 1;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getAmountStations() {
        return amountStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setAmountStations(int newAmountStations) {

        if (newAmountStations > lastRadioStation + 1) {
            return;
        }
        if (newAmountStations < firstRadioStation) {
            return;
        }
        newAmountStations = amountStations;
    }


    public void setRadioStation(int newRadioStation) {

        if (newRadioStation > lastRadioStation) {
            return;
        }
        if (newRadioStation < firstRadioStation) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {

        if (radioStation < lastRadioStation) {
            radioStation = radioStation + 1;
        } else radioStation = firstRadioStation;

    }

    public void prevRadioStation() {

        if (radioStation > firstRadioStation) {
            radioStation = radioStation - 1;
        } else radioStation = lastRadioStation;

    }


    public void setVolume(int newCurrentVolume) {

        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}