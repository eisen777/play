package registrator;

import java.util.Scanner;

public class RegistrationProcessor {
    public static void main(String[] args) {
        System.out.println("Добрый день! Пожалуйста, зарегистрируйтесь...");
        String userName = "";
        int Number = 0;
        PlayGuessTheNumberAHuman c = new PlayGuessTheNumberAHuman();
        PlayGuessTheNumberAMachine a;
        boolean change = true;
        do {
            userName = UserRegistrator.regName();
        } while (!UserRegistrator.checkName(userName));

        int age = 0;

        do {
            age = UserRegistrator.regAge();

        } while (!UserRegistrator.checkAge(age));

        User user = new User(userName, age);
        System.out.println("------------------------------------------------");
        System.out.println("Успешная регистрация пользователя " + user.getName());
        System.out.println("Добрый день, " + user.getName());
        System.out.println("------------------------------------------------");
        user.showUserInfo();
        System.out.println("------------------------------------------------");
        System.out.println("Поиграем? Угадать число (1) или Загадать число(2)?");
        int regChange = new Scanner(System.in).nextInt();
        if(regChange == 1){
            do {
               c.setUser_number();
            }while (!c.play());
        }
        else if (regChange == 2){
            do {
                a =  new PlayGuessTheNumberAMachine();


           }while (a.play());
        }
        else {
            System.out.println("Введите 1 или 2");
        }
    }
}