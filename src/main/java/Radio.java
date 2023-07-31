public class Radio {
    private int currentStation;
    private int soundVolume;

    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > 9) {
            return;
        }

        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;

        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        {

            if (soundVolume > 100) {
                return;
            }

            if (soundVolume < 0) {
                return;
            }
            this.soundVolume = soundVolume;
        }
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void reduceVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}