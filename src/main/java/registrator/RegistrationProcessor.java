package registrator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistrationProcessor {
    public static void Header(){
        System.out.println("Добрый день! Пожалуйста, зарегистрируйтесь...\n в любой моент Вы можете выйти, стоит только написать слово \"выйти\"");
        String userName;

        do {
            userName = UserRegistrator.regName();
        } while (!UserRegistrator.checkName(userName));
        if (!UsersInput.exit){
            int age;

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
        }

    }
    public static void regChange(int regChange){
        PlayGuessTheNumberAHuman c = new PlayGuessTheNumberAHuman();
        PlayGuessTheNumberAMachine a = new PlayGuessTheNumberAMachine();
        if(regChange == 1){
            do {
                c.setUser_number();
            }while (!c.play());
        }
        else if (regChange == 2){
            do {
                a.StartPlay();


            }while (a.play());
        }
        else {
            System.out.println("нененене, так не пойдет, давайте ка либо 1 либо 2");
            regChange(UsersInput.Input(new Scanner(System.in).nextInt()));
        }
    }
    public static void main(String[] args) {
        try {
            Header();
            if (!UsersInput.exit){//todo доработать выйход из любой точки программы
                int regChange = UsersInput.Input(new Scanner(System.in).nextInt());
                regChange(regChange);
            }
            else {
                return;
            }
        }catch (InputMismatchException e){
            //todo доработать продолжение работы после вызова исключения
            System.out.println("Эй, хватит пихать в меня свои буковки когда надо циферки, подумай над своим поведением, а я ухожу!!!");

        }


    }
}