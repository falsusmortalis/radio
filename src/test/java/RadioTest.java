import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void shouldSetRadio() { //выполнение функции переключения
        int numberStation = 10;
        radio.setNumberStation(numberStation);
        radio.next();
        Assertions.assertEquals(0, radio.getNumberStation());
    }
    @Test
    public void changeUp() { //внутри диапазона
        int numberStation = 6;
        radio.setNumberStation(numberStation);
        radio.next();
        Assertions.assertEquals(7, radio.getNumberStation());
    }
    @Test
    public void changeUp1() { //1
        int numberStation = 11;
        radio.setNumberStation(numberStation);
        radio.next();
        Assertions.assertEquals(1, radio.getNumberStation());
    }
    @Test
    public void changePrev() { //0-10
        int numberStation = 0;
        radio.setNumberStation(numberStation);
        radio.prev();
        Assertions.assertEquals(10, radio.getNumberStation());
    }
    @Test
    public void changePrev1() { //-1 10
        int numberStation = -1;
        radio.setNumberStation(numberStation);
        radio.prev();
        Assertions.assertEquals(10, radio.getNumberStation());
    }
    @Test
    public void changePrev2() { //внутри
        int numberStation = 4;
        radio.setNumberStation(numberStation);
        radio.prev();
        Assertions.assertEquals(3, radio.getNumberStation());
    }
    @Test
    public void shouldInputRadioStation() { //выставить радиостанцию
        int RadioStation = 8;
        int currentStation = 3;
        radio.setNumberStation(currentStation);
        radio.inputNumberStation(RadioStation);
        Assertions.assertEquals(8, radio.getNumberStation());
    }
    @Test
    public void shouldInputRadioStation1() { //ввод границы
        int RadioStation = 10;
        int currentStation = 3;
        radio.setNumberStation(currentStation);
        radio.inputNumberStation(RadioStation);
        Assertions.assertEquals(10, radio.getNumberStation());
    }
    @Test
    public void shouldInputRadioStation2() { //отрицательные значения
        int RadioStation = -2;
        int currentStation = 3;
        radio.setNumberStation(currentStation);
        radio.inputNumberStation(RadioStation);
        Assertions.assertEquals(3, radio.getNumberStation());
    }
    @Test
    public void shouldInputRadioStation3() { //за границы
        int RadioStation = 11;
        int currentStation = 10;
        radio.setNumberStation(currentStation);
        radio.inputNumberStation(RadioStation);
        Assertions.assertEquals(10, radio.getNumberStation());
    }
    //тесты по громкости
    @Test
    public void changeVolumeUp() { //переключение внутри диапазона
        int currentVolume = 40;
        radio.setCurrentVolume(currentVolume);
        radio.IncreaseVolume();
        Assertions.assertEquals(41, radio.getCurrentVolume());
    }
    @Test
    public void changeVolumeUp1() { //переключение границы 0-1
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.IncreaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void changeVolumeUp101() { //переключение границы 101
        int currentVolume = 100;
        radio.setCurrentVolume(currentVolume);
        radio.IncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
      @Test
    public void changeVolumeDown() { //переключение внутри вниз
        int currentVolume = 33;
        radio.setCurrentVolume(currentVolume);
        radio.DecreaseVolume();
        Assertions.assertEquals(32, radio.getCurrentVolume());
    }
    @Test
    public void changeVolumeDown1() { //переключение границы ничего не происходит
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.DecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void changeVolumeDown2() { //переключение за границами
        int currentVolume = -1;
        radio.setCurrentVolume(currentVolume);
        radio.DecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}

