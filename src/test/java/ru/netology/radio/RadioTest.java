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
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        radio.setPrevRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationFromPult() {
        Radio radio = new Radio();
        radio.setNumberRadioStationFromPult(5);

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setIncreaseVolume();

        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetFeduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setFeduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }


}
