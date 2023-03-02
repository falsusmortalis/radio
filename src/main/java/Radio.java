public class Radio {
    private int numberStation;
    private int currentVolume;

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

    protected void next() {
        if (numberStation < 9) {
            numberStation++;
        } else {
            numberStation = 0;
        }
    }

    protected void prev() {
        if (numberStation > 0) {
            numberStation--;
        } else {
            numberStation = 9;
        }
    }

    protected void IncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;

        }
    }

    protected void DecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}