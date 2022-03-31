package testJava;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.println("Введите пожалуйста любое число");
        int number = i.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
        i.close();
    }
}
