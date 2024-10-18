import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);
        // Ввод диаметров
        System.out.print("Введите диаметр шарика (X): ");
        int X = scanner.nextInt();
        System.out.print("Введите диаметры отверстий (A, B, C, D): ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        // Инициализация счетчика
        int counter = 0;
        // Проверка каждого отверстия
        if (A >= X) {
            counter++;
        }
        if (B >= X) {
            counter++;
        }
        if (C >= X) {
            counter++;
        }
        if (D >= X) {
            counter++;
        }
        // Вывод результата
        System.out.println("Количество отверстий, через которые удастся протащить шарик: " + counter);
        // Закрытие Scanner
        scanner.close();
    }
}
