import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadio() { //выполнение функции переключения
        Radio radio = new Radio();

        radio.setNumberStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMin() { //за пределами
        Radio radio = new Radio();
        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMax() { //переключение на 9, граничные значения
        Radio radio = new Radio();
        radio.setNumberStation(9);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMin() { //переключение на 0, граничные значения
        Radio radio = new Radio();
        radio.setNumberStation(0);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUp() { //внутри диапазона
        Radio radio = new Radio();
        radio.setNumberStation(2);
        radio.next();

        int expected = 3;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUpAbove() { //переключение на станцию выше с 9 на 0
        Radio radio = new Radio();
        radio.setNumberStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeDown() { //переключение на станцию ниже внутри диапазона
        Radio radio = new Radio();
        radio.setNumberStation(3);
        radio.prev();

        int expected = 2;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeDownBelow() { //переключение на границах вниз, с 0 на 9
        Radio radio = new Radio();
        radio.setNumberStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveSetCurrentStation() {
        Radio station = new Radio();
        station.setNumberStation(10);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    //тесты по громкости
    @Test
    public void changeVolumeUp() { //переключение выше на границах диапазона (0 - 1)
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.IncreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeDown() { //переключение ниже внутри границ диапазона (5 -4)
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.DecreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() { // невозможность переключения за пределы верхних границ (10 максимум)
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.IncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxVolume1() { // невозможность переключения за пределы верхних границ (10 максимум)
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() { // невозможность переключения за пределы нижних границ (0 минимум)
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.DecreaseVolume();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeIncrease() { //переключение вверх на предел границ (9 - 10)
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.IncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeDecreaseTo9() { //переключение вниз на предел нижних границ (10 - 9)
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.DecreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeDecrease() { //переключение вниз на предел нижних границ (1 - 0)
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.DecreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolumeIncrease10() { //вверх 9-10
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.IncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeAbove() { //невозможность переключения за пределы верхних границ (10)
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.IncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBelowSetCurrentVolume() { //невозможность переключения за пределы нижнихх границ (0)
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
