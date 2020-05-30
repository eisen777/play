package registrator;

import java.util.Scanner;
import java.util.Random;

public class PlayGuessTheNumberAHuman {
    Random rnd = new Random(System.currentTimeMillis());
    private final int MAX = 100;
    private final int MIN = 0;
    private int Random_number = MIN + rnd.nextInt(MAX - MIN + 1);

    private int User_number;

    public void setUser_number() {
        System.out.println("Введите число:");
        int temp = UsersInput.Input(new Scanner(System.in).nextInt());
        if (temp < 0 | temp > 100){
            System.out.println("введите число в диапазоне от 0 до 100");
            setUser_number();
        }
        else {
            User_number = temp;
        }
    }

    public int Show_random(){

        return Random_number;
    }
    public boolean play(){
        if (User_number == Random_number){
            System.out.println("Ура, Вы угадали");
            return true;
        }
        else if (User_number > Random_number){
            System.out.println("Ответ неверный! Число меньше");
            System.out.println("правильный ответ: " + Show_random());
            return false;
        }
        else {
            System.out.println("Ответ неверный! Число больше");
            System.out.println("правильный ответ: " + Show_random());
            return false;

        }


    }

}
