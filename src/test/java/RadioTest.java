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

    public void setCurrentStationPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

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
}
