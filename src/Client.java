import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctObserver(subject);
        new BinObserver(subject);
        new HexObserver(subject);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        subject.setState(number);
        subject.execute();
    }
}
