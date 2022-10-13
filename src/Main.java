public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println(" Задание 1");
        int[] numbers = new int[3];
        double[] fraction = {1.57, 7.654, 9.986,};
        char[] letters = new char[]{'x', 'y', 'z'};


    }//Объявление массива, без вывода на экран(как по заданию)

    public static void task2() {
        System.out.println(" Задание 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.printf("%s, %s, %s%n", numbers[0], numbers[1], numbers[2]);

        double[] fraction = {1.57, 7.654, 9.986};
        System.out.printf("%s, %s, %s%n", fraction[0], fraction[1], fraction[2]);

        char[] letters = new char[3];
        letters[0] = 'x';
        letters[1] = 'y';
        letters[2] = 'z';
        System.out.printf("%s, %s, %s%n", letters[0], letters[1], letters[2]);


    }

    public static void task3() {
        System.out.println(" Задание 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }

        }
        System.out.println();
        double[] fraction = new double[]{1.57, 7.654, 9.986};
        for (int i = fraction.length - 1; i >= 0; i--) {
            if (fraction[i] != 1.57) {
                System.out.print(fraction[i] + ", ");
            } else {
                System.out.print(fraction[i]);
            }
        }
        System.out.println();
        char[] letters = new char[3];
        letters[0] = 'x';
        letters[1] = 'y';
        letters[2] = 'z';
        for (int i = letters.length - 1; i >= 0; i--) {
            if (letters[i] != 'x') {
                System.out.print(letters[i] + ", ");
            } else {
                System.out.print(letters[i]);
            }
        }
        System.out.println();


    }

    public static void task4() {
        System.out.println(" Задание 4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + 1 + " ");
            }
        }
    }


}