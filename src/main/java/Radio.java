public class Radio {
    public int numberStation;

    public void next() {
        if (numberStation < 9) {
            numberStation++;
        } else {
            numberStation = 0;
        }
    }

    public void prev() {
        if (numberStation > 0) {
            numberStation--;
        } else {
            numberStation = 9;
        }
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int currentVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void IncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;

        }
    }

    public void DecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}