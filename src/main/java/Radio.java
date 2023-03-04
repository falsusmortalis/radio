public class Radio {
    private int numberStation;
    private int countStation;
    private int currentVolume;
    private int maxNumberStation;
    private int minNumberStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int countStation) { //с параметром
        this.countStation = countStation;
    }

    public Radio() { //конструктор без параметров
        this.countStation = 10;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > countStation - 1) {
            return;
        }
        if (numberStation < minNumberStation) {
            return;
        }
        this.numberStation = numberStation;
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

    public void next() {
        //  int numberStation = this.getNumberStation();
        if (numberStation < countStation - 1) {
            numberStation++;
        } else {
            numberStation = 0;
        }
    }

    public void prev() {
        // int numberStation = this.getNumberStation();
        if (numberStation > 0) {
            numberStation--;
        } else {
            numberStation = countStation - 1;
        }
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
        if (currentVolume > 0) {
            this.currentVolume--;
        }
        return;
    }
}