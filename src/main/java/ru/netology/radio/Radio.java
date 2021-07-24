package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;


    //увеличение громкости
    public int increaseVolume() {
        int currentVolume= 10;
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }

        return currentVolume;
    }

    //уменьшение громкости
    public int feduceVolume() {
        int currentVolume=0;
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }

        return currentVolume;
    }


    //через пульт
    public void setPultRadioStation(int radioStation) {
        if (radioStation < firstRadioStation) {
            return;
        }
        if (radioStation > lastRadioStation) {
            return;
        }
        currentRadioStation = radioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    //следующая станция
    public int nextRadioStation() {
        int currentRadioStation = 9;
        if (currentRadioStation < lastRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == lastRadioStation) {
            currentRadioStation = firstRadioStation;
        }
        return currentRadioStation;
    }

    //предыдущая станция
    public int prevRadioStation() {
        int currentRadioStation = 0;
        if (currentRadioStation > firstRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == firstRadioStation) {
            currentRadioStation = lastRadioStation;
        }
        return currentRadioStation;
    }

}


