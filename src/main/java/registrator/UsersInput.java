package registrator;

import java.util.InputMismatchException;
import java.util.Scanner;

//этот класс нужен, чтобы обрабатывать ввод пользователя, для того чтобы можно было выйти
// из любого этапа игры написав "выйти"
public class UsersInput {
    public static boolean exit = false;
    public static String Input(String Input){
        if (Input.equals("выйти")){
            exit = true;
            System.out.println("ну не хотите как хотите! Больно надо с Вами играть(((");
        }
        return Input;

    }
    public static int Input(int Input){
       try{
           return Input;
       }catch (InputMismatchException e){
           System.out.println("хватит пихать в меня свои буковки когла надо циферки!!!");
           return UsersInput.Input(new Scanner(System.in).nextInt());
       }


    }
}
