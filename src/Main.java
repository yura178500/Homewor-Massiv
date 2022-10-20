import java.util.Random;
public class Main {
    int[] day = generateRandomArray();
    public static int[] generateRandomArray() {
        //Задача 1
        java.util.Random random = new java.util.Random();
        int[] day = new int[30];
        for (int i = 0; i < day.length; i++) {
            int[] amount = new int[30];
            for (int j = 0; j < amount.length; j++) {
                amount[j] = random.nextInt(100_000) + 100_000;
                amount += day[amount[j]];
                System.out.println("Сумма трат за месяц составила" + amount);
            }
        }

        // Задача 2
        java.util.Random random = new java.util.Random();
        int[] day = new int[30];
        int[] amount = new int[30];
        for (int i = 0; i < day.length; i++) {
            System.out.println(day[i]);
            int maxAmount = -1;
            for (int j = 0; j < amount.length; j++) {
                if (amount[i] > maxAmount) {
                    maxAmount = amount[i];
                    System.out.println("Максимальная сумма трат за день составила" + maxAmount);}
                }       }
            int minAmount = -1;
            for (int j = 0; j < amount.length; j++) {
            if (amount[j] > minAmount) {
                minAmount = amount[j];
                System.out.println("Мигимальная сумма трат за день составила" + minAmount);
            }
        }

        //Зажача 3
        int[] day = new int[30];
        for (int i = 0; i < day.length; i++) {
        int[] amount = new int[30];
        for (int i = 0; i < amount.length; i++) {
                amount[i] = random.nextInt(100_000) + 100_000;
                amount += day[amount[i]];
                amount = amount / 30;
                System.out.println("Средняя cумма трат за месяц составила" + amount);}
            }
        }
        // Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            Arrays.sort(reverseFullName);
            System.out.println(Arrays.toString(reverseFullName));}}}









