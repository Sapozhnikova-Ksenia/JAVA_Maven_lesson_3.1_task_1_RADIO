package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    // присвоение приватной переменной currentStation
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // присвоение приватной переменной currentVolume
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    //следующая станция
    public void setNextRadioStation() {
        if (currentRadioStation != lastRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = firstRadioStation;
        }
    }

    //предыдущая станция
    public void setPrevRadioStation() {
        if (currentRadioStation != firstRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = lastRadioStation;
        }
    }

    //через пульт
    public void setNumberRadioStationFromPult(int newCurrentRadioStation) {
        if (newCurrentRadioStation < firstRadioStation) {
            return;
        }
        if (newCurrentRadioStation > lastRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    //увеличение громкости
    public void setIncreaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    //уменьшение громкости
    public void setFeduceVolume() {
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}


