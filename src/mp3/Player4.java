package mp3;

/**
 * Created by Евгений on 07.11.2017.
 */
/*      Плеер 4. Имеет final цену(задается в конструкторе) и геттер. Имеет плейлист
        playSong Может проиграть последнюю песню, playAllSongs может проиграть все песни*/
public class Player4 extends Mp3PlayerMain implements IAllSongs {
    public Player4(double price) {
        super(price);
    }

    public static void main(String... args) {
        new Player4(10).playSong();
        new Player4(10).playSongs();
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + songs[songs.length - 1]);
    }

    @Override
    public void playSongs() {
        new Player3(10).playSongs();
    }
}
