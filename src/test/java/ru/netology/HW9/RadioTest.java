package ru.netology.HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Станции настройка количества


    @Test
    public void setting() {
        Radio radio = new Radio();
        radio.setRadioStation(15);
        int expected = 15;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void settingMaxStations() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(20, radio.getAmountStations());
    }

    @Test
    public void settingNoStations() {
        Radio radio = new Radio();
        Assertions.assertEquals(20, radio.getAmountStations());
    }

    @Test
    public void settingMin() {
        Radio radio = new Radio(1);
        Assertions.assertEquals(1, radio.getAmountStations());
    }

    @Test
    public void settingInLimit() {
        Radio radio = new Radio(5);
        Assertions.assertEquals(5, radio.getAmountStations());
    }


    @Test
    public void settingInvalid() {
        Radio radio = new Radio();
        radio.setAmountStations(0);
        Assertions.assertEquals(20, radio.getAmountStations());
    }

    @Test
    public void settingInvalid2() {
        Radio radio = new Radio();
        radio.setAmountStations(21);
        Assertions.assertEquals(20, radio.getAmountStations());
    }

    @Test
    public void settingInvalid3() {
        Radio radio = new Radio();
        radio.setAmountStations(-1);
        Assertions.assertEquals(20, radio.getAmountStations());
    }
    //Переключение станций

    @Test
    public void shouldTurntoPrevFrom0() {
        Radio radio = new Radio();
        radio.prevRadioStation();
        int expected = 19;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurntoNextFrom9() {
        Radio radio = new Radio();
        radio.setRadioStation(19);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurntoNextInlimit() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurntoPrevInLimit() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        radio.prevRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.setRadioStation(2);
        int expected = 2;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetInvalidStation() {
        Radio radio = new Radio();
        radio.setRadioStation(21);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetInvalidStation2() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // Звук

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBehindLimit100() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBehindLimit0() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBorderHigh() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBorderDown() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduseVolumeBorderDown() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.reduseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduseVolumeInBorderHigh() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.reduseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnder100() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnder0() {
        Radio radio = new Radio();
        radio.reduseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

