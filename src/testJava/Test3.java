package testJava;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        System.out.print("Задайте размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] someArr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите следующее число");
            someArr[i] = scanner.nextInt();
        }

        System.out.println("Вывод элементов массива кратных 3: ");
        for (int i : someArr) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

}

