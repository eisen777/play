package registrator;

import java.util.Scanner;

public class UserRegistrator {
    public static boolean checkName(String name) {
        char[] nameArray = name.toCharArray();
        for(char x:nameArray){
            if (x == '0' || x == '1'||  x == '2'||  x == '3' ||  x == '4' ||  x == '5'  ||  x == '6'  ||  x == '7'
                    ||  x == '8'  ||  x == '9'){
                System.out.println("в имени содержаться цифры, попробуйте ещё раз");
                return false;
            }
        }
        for(char x:nameArray){
            if (x == ' '){
                System.out.println("имя должно состоять из одного слова, попробуйте ещё раз");
                return false;
            }
        }
        if (name.equals("")) {
            System.out.println("Пустое имя, попробуйте ещё раз");
            return false;
        }
        else {
            System.out.println("Имя корректно, продолжайте...");
            return true;
        }
    }

    public static String regName() {
        System.out.println("Введите имя:");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkAge(int age) {
        if (age <= 18) {
            System.out.println("Ваш возраст меньше 18, вход запрещен...");
            return false;
        } else {
            System.out.println("Возраст больше 18, добро пожаловать!");
            return true;
        }
    }

    public static int regAge() {
        System.out.println("Введите возраст:");
        return new Scanner(System.in).nextInt();
    }
    public static int regChange() {
        return new Scanner(System.in).nextInt();
    }
}