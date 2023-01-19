package by.sleptsov.learn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    public RockMusic() {
        initMusicList();
    }

    private ArrayList<String> musicList = new ArrayList<>(3);

    private Random random = new Random();

    private void initMusicList(){
        this.musicList.add("Another bites the Dust");
        this.musicList.add("AWAKE AND WAKEUP");
        this.musicList.add("Monster");
    }

    public ArrayList<String> getMusicList() {
        return musicList;
    }

    @Override
    public String getSong() {
        int index = random.nextInt(3);
        return musicList.get(index) + " " + index;
    }
}