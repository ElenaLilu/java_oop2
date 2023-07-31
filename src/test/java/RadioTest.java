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

    public void setCurrentStation

}
