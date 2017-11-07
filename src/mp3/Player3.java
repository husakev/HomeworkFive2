package mp3;

/**
 * Created by Евгений on 31.10.2017.
 */
/*      Плеер 3. Имеет final цену(задается в конструкторе) и геттер. Имеет плейлист.
        playSong Может проиграть первую песню. playAllSongs может проиграть все песни */
public class Player3 extends Mp3PlayerMain implements IAllSongs {
    public Player3(double price) {

        super(price);
    }

    public static void main(String... args) {
        new Player3(10).playSong();
        new Player3(10).playSongs();
    }

    @Override
    public void playSong() {

        System.out.println("Playing: " + songs[0]);
    }

    @Override
    public void playSongs() {
        for (String x : songs) {
            System.out.println("Playing: " + x);
        }
    }
}
