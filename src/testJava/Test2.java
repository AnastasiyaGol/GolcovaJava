package testJava;

import java.util.Objects;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Введите пожалуйста имя");
        String name = x.nextLine();
        if (Objects.equals(name, "Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        x.close();
    }
}

