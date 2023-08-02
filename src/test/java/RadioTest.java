import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test

    public void setCurrentStationRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationOutOfRang() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationOutOfRangNew() {
        Radio radio = new Radio(23);

        radio.setCurrentStation(4);
        radio.setCurrentStation(23);
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationBeforeOfRang() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        radio.setCurrentStation(4);
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }


    @Test

    public void setCurrentStationNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationNext2New() {
        Radio radio = new Radio(14);

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationPrevNew() {
        Radio radio = new Radio(19);

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 18;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setCurrentStationPrev2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void setSoundVolume1() {
        Radio radio = new Radio();

        radio.setSoundVolume(150);
        radio.setSoundVolume(100);
        int actual = radio.getSoundVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void setSoundVolume2() {
        Radio radio = new Radio();

        radio.setSoundVolume(99);
        radio.setSoundVolume(150);
        int actual = radio.getSoundVolume();
        int expected = 99;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void setSoundVolume3() {
        Radio radio = new Radio();

        radio.setSoundVolume(-34);
        radio.setSoundVolume(50);
        int actual = radio.getSoundVolume();
        int expected = 50;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void setIncreaseVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(50);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 51;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void setIncreaseVolume2() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void setReduceVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(30);
        radio.reduceVolume();
        int actual = radio.getSoundVolume();
        int expected = 29;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void setReduceVolume2() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.reduceVolume();
        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }
}
