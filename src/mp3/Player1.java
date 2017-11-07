package mp3;

/**
 * Created by Евгений on 26.10.2017.
 */
/*    Плеер 1. Имеет final цену(задается в конструкторе) и геттер. Имеет только 1 песню
(нельзя объявить эту переменную в классе этого плеера). playSong Может проиграть песню. */
public class Player1 extends Mp3PlayerMain {

    public Player1(double price) {

        super(price);
    }

    public static void main(String... args) { //void main прописал во всех класах чтоб
                                              //удобней проверять было
        new Player1(10).playSong();
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + song);
    }
}