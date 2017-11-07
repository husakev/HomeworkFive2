package mp3;

/**
 * Created by Евгений on 07.11.2017.
 */
/*          Плеер 5. Имеет final цену(задается в конструкторе) и геттер. Имеет плейлист
            playSong Может проиграть первую песню.
            playAllSongs может проиграть все песни с конца плейлиста в начало */
public class Player5 extends Mp3PlayerMain implements IAllSongs {
    public Player5(double price) {
        super(price);
    }

    public static void main(String... args) {
        new Player5(10).playSong();
        new Player5(10).playSongs();
    }

    @Override
    public void playSongs() {
        for (int i = songs.length - 1; i >= 0; i--) {
            System.out.println("Playing: " + songs[i]);
        }
    }

    @Override
    public void playSong() {
        new Player3(10).playSong();
    }
}
