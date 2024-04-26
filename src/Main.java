import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.pow;


public class Main {
    public static void main(String[] args) {
        // Виклик методу main з кожного класу в зазначеному порядку
        Exercise_1_1.main(args);
        Exercise_1_2.main(args);
        Exercise_2.main(args);
        Exercise_3.main(args);
        Exercise_4_1.main(args);
        Exercise_4_2.main(args);
        Exercise_5_1.main(args);
        Exercise_5_2.main(args);
    }
}
class Exercise_1_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println("давай працюй " + i);
        }
    }
}


class Exercise_1_2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            System.out.println("давай працюй " + i);
            i++;
        }
    }
}


 class Exercise_2 {
    public static void main(String[] args) {
        for (int h = 0; h <= 3; h++) {
            for (int i = 0; i <= 59; i++) {
                System.out.print("h:" + h );
                System.out.println("  min:"  + i);
                if (i == 59) {
                    System.out.print("h:" + h );
                    System.out.println("  min:"  + 0);
                }
            }
        }
    }
}


class Exercise_3 {
    public static void main(String[] args) {
        int h = 0;
        while (h <= 3) {
            int i = 0;
            while (i <= 59) {
                System.out.print("h:" + h);
                System.out.println("  min:" + i);
                if (i == 59) {
                    System.out.print("h:" + h);
                    System.out.println("  min:" + 0);
                }
                i++;
            }
            h++;}}}


class Exercise_4_1 {
    public static void main(String[] args) {
        for (int h = 0; h <= 2; h++) {
            for (int i = 0; i <= 59; i++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.print("h:" + h);
                    if (i <= 9) {
                        System.out.print("  min:0" + i);
                    } else {
                        System.out.print("  min:" + i);
                    }
                    if (s <= 9) {
                        System.out.print("   0" + s + "sec\n");
                    } else {
                        System.out.print("   " + s + "sec\n");
                    }
                    if (s == 59) {
                        System.out.print("h:" + h);
                        if (i <= 9) {
                            System.out.print("  min:0" + i);
                        } else {
                            System.out.print("  min:" + i);
                        }
                        System.out.print("   00sec\n");
                    }
                }
            }
        }
    }
}


class Exercise_4_2 {
    public static void main(String[] args) {
        int h = 0;
        while (h <= 2) {
            int i = 0;
            while (i <= 59) {
                int s = 0;
                while (s <= 59) {
                    System.out.print("h:" + h);
                    if (i <= 9) {
                        System.out.print("  min:0" + i);
                    } else {
                        System.out.print("  min:" + i);
                    }
                    if (s <= 9) {
                        System.out.print("   0" + s + "sec\n");
                    } else {
                        System.out.print("   " + s + "sec\n");
                    }
                    if (s == 59) {
                        System.out.print("h:" + h);
                        if (i <= 9) {
                            System.out.print("  min:0" + i);
                        } else {
                            System.out.print("  min:" + i);
                        }
                        System.out.print("   00sec\n");
                    }
                    s++;
                }
                i++;
            }
            h++;
        }
    }
}


class Exercise_5_1 {
    //Варіант 9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть початкову границю діапазону:");
        double start = scanner.nextDouble();
        System.out.println("Введіть кінцеву границю діапазону:");
        double end = scanner.nextDouble();
        tabulateFunction(start, end);
    }

    private static void tabulateFunction(double start, double end) {
        double step = 0.2;
        int countInRange = 0;
        System.out.println("x\t\tf(x)");
        for (double x = start; x <= end; x += step) {
            double result = sin(pow(x, 2)) + cos(pow(x, 2)) - 10 * x;
            System.out.printf("%.2f\t\t%.4f\n", x, result);
            if (result >= start && result <= end) {
                countInRange++;
            }
        }
        if (countInRange > 0) {
            System.out.println("Кількість значень функції в діапазоні: " + countInRange);
        } else {
            System.out.println("Значень функції в заданому діапазоні немає.");
        }
    }
}


class Exercise_5_2 {
    //Варіант 9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть початкову границю діапазону:");
        double start = scanner.nextDouble();
        System.out.println("Введіть кінцеву границю діапазону:");
        double end = scanner.nextDouble();
        tabulateFunction(start, end);
    }
    private static void tabulateFunction(double start, double end) {
        double step = 0.2;
        int countInRange = 0;
        System.out.println("x\t\tf(x)");
        double x = start;
        while (x <= end) {
            double result = sin(pow(x, 2)) + cos(pow(x, 2)) - 10 * x;
            System.out.printf("%.2f\t\t%.4f\n", x, result);
            if (result >= start && result <= end) {
                countInRange++;
            }
            x += step;
        }
        if (countInRange > 0) {
            System.out.println("Кількість значень функції в діапазоні: " + countInRange);
        } else {
            System.out.println("Значень функції в заданому діапазоні немає.");
        }}}