import java.util.Random;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1 () {
        System.out.println("Task 1");
        int number = 1;
        int evenOdd = number%2;
        if (number == 0) {
            System.out.println("The number " + number + " is odd");
        } else if (evenOdd == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }
    }

    public static void task2 () {
        System.out.println("\nTask 2");
        float p = 9f; //given number
        float q = 12f; //given number
        float a = 10f; //closest to this given number
        float pADiff = p - a;
        float qADiff = q - a;
        if (Math.abs(pADiff) > Math.abs(qADiff)) {
            System.out.println(q + " is closer to " + a + " than " + p);
        } else if (Math.abs(pADiff) == Math.abs(qADiff)) {
            System.out.printf("The numbers are equidistant from " + a);
        } else {
            System.out.println(p + " is closer to " + a + " than " + q);
        }
    }

    public static void task3 () {
        System.out.println("\nTask 3");
        int min = 3;
        int max = 158;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;

        int intervalMin = 22;
        int intervalMax = 99;
        if (i > intervalMin && i < intervalMax) {
            System.out.println("The number " + i + " is within the given interval (from " + intervalMin + " to " + intervalMax + ")");
        } else {
            System.out.println("The number " + i + " is not in the interval (from " + intervalMin + " to " + intervalMax + ")");
        }
    }

    public static void task4 () {
        System.out.println("\nTask 4");
        int min = 100;
        int max = 999;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;

        int a = i/100;
        int b = i%100/10;
        int c = i%10;

        boolean A = a > b && a > c;
        boolean B = b > a && b > c;
        boolean C = c > b && c > a;
        if (A) {
            System.out.println("Out of the numbers " + a +", " + b +" and " + c + ", the number " + a + " is the largest");
        } else if (B) {
            System.out.println("Out of the numbers " + a +", " + b +" and " + c + ", the number " + b + " is the largest");
        } else if (C) {
            System.out.println("Out of the numbers " + a +", " + b +" and " + c + ", the number " + c + " is the largest");
        } else {
            System.out.println("Either all numbers are equal or two of the inputs are largest and equal to each other");
        }
    }

    public static void task5 () {
        System.out.println("\nTask 5");
        int min = -100;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int a = random.nextInt(diff + 1) + min;
        int b = random.nextInt(diff + 1) + min;
        int c = random.nextInt(diff + 1) + min;
        //System.out.print(a + " " + b + " " + c);
       //System.out.println("");

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b >= c) {
            if (a >= c) {
            System.out.println(b +" "+ a +" "+ c);
        } else {
                System.out.println(b + " " + c + " " + a);
            }
        }
         else if (b >= a) {
            System.out.println(c +" "+ b +" "+ a);
        } else {
            System.out.println(c +" "+ a +" "+ b);
        }
    }

    public static void task6 () {
        System.out.println("\nTask 6");
        int min = 0;
        int max = 28800;
        int diff = max - min;
        Random random = new Random();
        float sec = random.nextInt(diff + 1) + min;
        float hrs = sec/3600;

        System.out.printf("Until the end of the day %.0f seconds, or %.1f hours left", sec, hrs);
    }

}