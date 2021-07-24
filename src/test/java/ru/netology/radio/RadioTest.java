package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();

        assertEquals(10, radio.increaseVolume());
    }

    @Test
    public void shouldFeduceVolume() {
        Radio radio = new Radio();
        radio.feduceVolume();

        assertEquals(0, radio.feduceVolume());
    }

    @Test
    public void shouldsetPultRadioStation() {
        Radio radio = new Radio();
        radio.setPultRadioStation(8);

        radio.setPultRadioStation(6);

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation(){
        Radio radio= new Radio();
        radio.nextRadioStation();
        assertEquals(0,radio.nextRadioStation());
    }

    @Test
    public void shouldPrevRadioStation(){
        Radio radio= new Radio();
        radio.prevRadioStation();
        assertEquals(9,radio.prevRadioStation());
    }


}

// public void shouldSetUpRadioStationToSteps (){

//    Radio radio= new Radio();

//    radio.setUpRadioStationToSteps();

//  assertEquals(6, radio.getUpRadioStationToSteps()  );

