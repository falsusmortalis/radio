public class Radio {
    private int amountStation = 10;
    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int currentVolume;
    private int numberStation;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation) {
        this.maxNumberStation = maxStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > maxNumberStation) {
            return;
        }
        if (numberStation < minNumberStation) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void next() {
        int numberStation = this.getNumberStation();
        if (numberStation == maxNumberStation) {
            this.numberStation = minNumberStation;
            return;
        }
        this.numberStation++;
    }

    public void prev() {
        int numberStation = this.getNumberStation();
        if (numberStation == minNumberStation) {
            this.numberStation = maxNumberStation;
            return;
        }
        this.numberStation--;
    }

    public void inputNumberStation(int RadioStation) {
        if (RadioStation > maxNumberStation) {
            return;
        }
        if (RadioStation < minNumberStation) {
            return;
        }
        this.numberStation = RadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void IncreaseVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void DecreaseVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }
}