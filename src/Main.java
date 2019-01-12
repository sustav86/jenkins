import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(System.out::println);
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi! " + i);
        }
    }
}
