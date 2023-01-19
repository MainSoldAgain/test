package by.sleptsov.learn;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import java.util.ArrayList;
import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    public ClassicalMusic() {
        initMusicList();
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("INITIALIZATION");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("DESTRUCTION");
    }


    private ArrayList<String> musicList = new ArrayList<>(3);
    private Random random = new Random();

    private void initMusicList(){
        this.musicList.add("Moonlights sonata");
        this.musicList.add("Hungarian Rhapsody");
        this.musicList.add("Times of Year");
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