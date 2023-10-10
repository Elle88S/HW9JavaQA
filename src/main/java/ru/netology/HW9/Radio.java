package ru.netology.HW9;

public class Radio {

    private int maxStations;
    private int allStations;

    private int radioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        this.maxStations = 9;
    }

    public Radio(int amountStations) {
        this.maxStations = amountStations - 1;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getAmountStations() {
        return maxStations + 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setAmountStations(int newAmountStations) {

        if (newAmountStations > maxStations + 1) {
            return;
        }
        newAmountStations = maxStations;
    }


    public void setRadioStation(int newRadioStation) {

        if (newRadioStation > maxStations) {
            return;
        }
        if (newRadioStation < 0) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {

        if (radioStation < maxStations) {
            radioStation = radioStation + 1;
        } else radioStation = 0;

    }

    public void prevRadioStation() {

        if (radioStation > 0) {
            radioStation = radioStation - 1;
        } else radioStation = maxStations;

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