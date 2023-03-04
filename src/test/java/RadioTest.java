import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);
    Radio radio2 = new Radio();

    @Test
    public void shouldSetRadio() { //выполнение функции переключения
        radio.setNumberStation(7);
        radio.next();
        Assertions.assertEquals(8, radio.getNumberStation());
    }

    @Test
    public void changeUp() { //внутри диапазона
        radio.setNumberStation(6);
        radio.next();
        Assertions.assertEquals(7, radio.getNumberStation());
    }

    @Test
    public void changeUp1() { //1
        radio.setNumberStation(0);
        radio.next();
        Assertions.assertEquals(1, radio.getNumberStation());
    }

    @Test
    public void changeUp2() { //1
        radio.setNumberStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getNumberStation());
    }

    @Test
    public void changePrev() { //0-9
        radio.setNumberStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getNumberStation());
    }

    @Test
    public void changePrev1() { //-1 10
        radio.setNumberStation(-2);
        radio.prev();
        Assertions.assertEquals(9, radio.getNumberStation());
    }

    @Test
    public void changePrev2() { //внутри
        radio.setNumberStation(4);
        radio.prev();
        Assertions.assertEquals(3, radio.getNumberStation());
    }

    @Test
    public void shouldInputRadioStation() {
        radio.setNumberStation(5);
        Assertions.assertEquals(5, radio.getNumberStation());
    }

    @Test
    public void shouldInputRadioStation1() { //ввод границы
        radio.setNumberStation(1);
        Assertions.assertEquals(1, radio.getNumberStation());
    }

    @Test
    public void shouldInputRadioStation2() { //отрицательные значения
        radio.setNumberStation(-2);
        Assertions.assertEquals(0, radio.getNumberStation());
    }

    @Test
    public void shouldInputRadioStation3() { //за границы
        radio.setNumberStation(15);
        Assertions.assertEquals(0, radio.getNumberStation());
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
        radio.setCurrentVolume(100);
        radio.IncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void changeVolumeUp102() { //переключение границы 101
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
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

