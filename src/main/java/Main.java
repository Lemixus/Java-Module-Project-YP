import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RaceClass race = new RaceClass();

        for (int i = 1; i <= 3; i++) {
            int speed = 0;
            String name = "";

            while (true) {
                System.out.println("Введите название машины " + i + ":");
                name = scanner.nextLine().trim();

                if (!name.isEmpty())
                    break;
                else
                    System.out.println("Введите непустое название машины");

            }

            while (true) {
                System.out.println("Введите скорость машины " + i + ":");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Введите скорость от 1 до 250");
                    }

                } else {
                    System.out.println("Введите целое число");
                    scanner.next();
                }
            }

            CarClass car = new CarClass(name, speed);
            race.calculateRaceLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.leader);
        scanner.close();
    }
}
