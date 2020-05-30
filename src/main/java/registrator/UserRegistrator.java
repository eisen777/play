package registrator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrator {
    public static boolean checkName(String name) {
        char[] nameArray = name.toCharArray();
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(name);

        for(char x:nameArray){
            if (matcher.find()){
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
            return UsersInput.Input(new Scanner(System.in).nextLine());


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
        try {
        System.out.println("Введите возраст:");
        return UsersInput.Input(new Scanner(System.in).nextInt());
        }catch (InputMismatchException e){
            System.out.println("по-моему Вы немного напутали со своим возрастом, давайте ка еще разок!");
            return UserRegistrator.regAge();
        }
    }
    public static int regChange() {
        return new Scanner(System.in).nextInt();
    }
}