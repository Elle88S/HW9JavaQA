package ru.netology.HW9;

public class Radio {
    private int radioStation;


    public int getRadioStation() {            //сеттеры и геттеры для станций задаем
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {     //инкапсуляция станций

        if (newRadioStation > 9) {
            return;
        }
        if (newRadioStation < 0) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {                     //правило переключения с 9 на 0

        if (radioStation < 9) {
            radioStation = radioStation + 1;
        } else radioStation = 0;
        int next = radioStation;
    }

    public void prevRadioStation() {                      //правило переключения с 0 на 9

        if (radioStation > 0) {
            radioStation = radioStation - 1;
        } else radioStation = 9;
        int prev = radioStation;
    }


    public int currentVolume;                      //переменная звука

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume) {     //сеттер звука

        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {                       //правило прибавления звука
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduseVolume() {                           //правило уменьшения звука
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
