package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    void shouldSetNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.setNextRadioStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }
    @Test
    void shouldSetNextRadioStationToNewCurv() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        radio.setPrevRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStationToNewCurv() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationFromPult() {
        Radio radio = new Radio();
        radio.setNumberRadioStationFromPult(5);

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationFromPultToReturnForMore() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.setNumberRadioStationFromPult(12);

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationFromPultToReturnForMinNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setNumberRadioStationFromPult(-12);

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setIncreaseVolume();

        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetIncreaseVolumeForMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setIncreaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetFeduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setFeduceVolume();

        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetFeduceVolumeToMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setFeduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}
