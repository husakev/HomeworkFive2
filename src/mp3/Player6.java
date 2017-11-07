package mp3;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Евгений on 07.11.2017.
 */
/*      Плеер 6. Имеет final цену(задается в конструкторе) и геттер. Имеет плейлист
        playSong Может проиграть первую песню, playAllSongs может проиграть все песни
        Имеет метод public void shuffle() - перемешивает все песни в плейлисте местами */
public class Player6 extends Mp3PlayerMain implements IAllSongs {

    public Player6(double price) {
        super(price);
    }

    public static void main(String... args) {
        new Player6(10).playSong();
        new Player6(10).playSongs();
        new Player6(10).shuffle();
        new Player6(10).playSongs();
    }

    @Override
    public void playSongs() {
        new Player3(10).playSongs();
    }

    @Override
    public void playSong() {
        new Player3(10).playSong();
    }
    public void shuffle(){
        Collections.shuffle(Arrays.asList(songs));

    }
}
