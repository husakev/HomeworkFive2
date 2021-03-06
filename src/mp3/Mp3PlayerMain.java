package mp3;

/**
 * Created by Евгений on 31.10.2017.
 */
/*   Существуют различные MP3 плееры. Каждый из них чем-то отличается от другого. В задаче
рассмотрим несколько видов плееров начиная от дешевых к дорогим. Суть задания заключается
в создании классов, которые будут описывать все эти плееры. В главном классе программы
необходимо создать объекты каждого класса и продемонстрировать их работу.
 Плееры работают с таким понятием как “песня” и “плейлист”. Песню будем рассматривать как
строку, которая состоит из названия песни. К примеру вот как выглядит одна песня
String song1 = “The Best Song”; Плейлист выглядит как массив песен(строк).
String[] playlist = new String[] {“The best song”, “Good song”, “Super Song”}; Проигрывая
песню, плееру необходимо вывести в консоль - “Playing: “ + songName; Например вот такой
вывод должен получиться при проигрывании песни “The best song”: Playing: The best song
        Код логики методов не должен дублироваться в классах! Плееры не могут иметь больше
возможностей, чем указано! Каждый новый плеер == новый класс. Каждый плеер имеет метод
public void playSong. Проигрывает первую имеющуюся песню на плеере.
 Некоторые плееры имеют метод public void playAllSongs() Проигрывает все песни на плеере*/
public abstract class Mp3PlayerMain {
    final double price;
    String song = "The Best Song";

    public Mp3PlayerMain(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public abstract void playSong() throws InterruptedException;

    public static void main(String[] args) throws InterruptedException {

    }
}
