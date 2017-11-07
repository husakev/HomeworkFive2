package mp3;

/**
 * Created by Евгений on 31.10.2017.
 */
/*              Плеер 2. Имеет final цену(задается в конструкторе) и геттер.
                Имеет только 1 песню(нельзя объявить эту переменную в классе этого плеера)
                playSong Пытаясь проиграть песню выдает ошибку в консоль - “error”. */
public class Player2 extends Mp3PlayerMain {
    public Player2(double price) {
        super(price);
    }

    public static void main(String... args) throws InterruptedException {
        new Player2(10).playSong();
    }

    @Override
    public void playSong() throws InterruptedException {
        System.out.println("Playing: .....");
        Thread.sleep(1000);
        System.out.println("Playing: error");
    }
}