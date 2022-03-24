import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch watch1 = new StopWatch();
        Scanner input = new Scanner(System.in);
        int click;

        do {
            System.out.println("Enter 1 to start and any number to stop: ");
            click = input.nextInt();
            switch (click) {
                case 1:
                    System.out.println(watch1.start());
                    break;
                default:
                    System.out.println(watch1.stop());
                    break;
            }
        } while (click == 1);

        System.out.println(watch1);

    }
}
