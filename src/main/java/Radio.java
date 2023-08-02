public class Radio {
    private int currentStation;
    private int soundVolume;
    private int stationsCount = 10;

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > (stationsCount - 1)) {
            return;
        }

        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void next() {
        if (currentStation == (stationsCount - 1)) {
            currentStation = 0;
        } else {
            currentStation++;

        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = (stationsCount - 1);
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