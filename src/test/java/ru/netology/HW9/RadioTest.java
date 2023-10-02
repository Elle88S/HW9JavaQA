package ru.netology.HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Станции

    @Test
    public void shouldTurntoPrevFrom0() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurntoNextFrom9() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurntoNextInlimit() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
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
        radio.setRadioStation(12);
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

    @Test
    public void test() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(10, radio.getAmountStations());
    }
    @Test
    public void test1() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getAmountStations());
    }  @Test
    public void test2() {
        Radio radio = new Radio(1);
        Assertions.assertEquals(1, radio.getAmountStations());
    }
    @Test
    public void test3() {
        Radio radio = new Radio(50);
        Assertions.assertEquals(10, radio.getAmountStations());
    }
    @Test
    public void test4() {
        Radio radio = new Radio(-1);
        Assertions.assertEquals(10, radio.getAmountStations());
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
        radio.setVolume(0);
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
        radio.setVolume(0);
        radio.reduseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

