import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        WordCounter wordCounter = new WordCounter();

        String singleInput;
        String fullContent = null;

        System.out.println("Napisz tekst. Aby zliczyć słowa wpisz 'wynik, aby zakończyć wpisz 'quit'.");

        do {
            singleInput = scanner.next();

            if (!singleInput.equalsIgnoreCase("wynik") && !singleInput.equalsIgnoreCase("quit")){
                builder.append(singleInput+" ");
                fullContent = builder.toString();
            }
            else if (singleInput.equalsIgnoreCase("wynik")) {
                wordCounter.coutWords(fullContent);
                wordCounter.showMapOfWors();
                wordCounter.clearMap();
            }

        } while (!singleInput.equalsIgnoreCase("quit"));

    }
}
