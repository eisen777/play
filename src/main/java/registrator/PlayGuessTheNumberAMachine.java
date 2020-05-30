package registrator;

import java.util.Random;
import java.util.Scanner;

public class PlayGuessTheNumberAMachine {
    Random rnd = new Random(System.currentTimeMillis());
    private int max;
    private int min;
    private int Random_number;
    public void StartPlay() {
        String temp;
        min = 0;
        max = 100;
        System.out.println("Загадайте пожалуйста число от 1 до 100, а я попробую отгадать");
        System.out.println("если у меня не получится с первого раза, то скажите больше или меньше");
        System.out.println("просто напишите \"больше\", \"меньше\" или \"правильно\"");
        do {
            System.out.println("Наишите \"загадал\" если готовы начать");
            temp = UsersInput.Input(new Scanner(System.in).nextLine());
        }while (!temp.equals("загадал"));
        System.out.println("Отлично! Я просто уверен, что это число - " + set_and_get_Random_number());

    }
    private int set_and_get_Random_number(){
        return Random_number = min + rnd.nextInt(max - min + 1);
    }


    public boolean play(){

        String temp = new Scanner(System.in).nextLine();
        if (temp.equals("больше")){
            min = Random_number+1;
            set_and_get_Random_number();
            System.out.println("Хм! Может быть тогда - " + Random_number + "?");
            play();
            return false;
        }
        else if (temp.equals("меньше")){
            max = Random_number-1;
            set_and_get_Random_number();
            System.out.println("Хм! Может быть тогда - " + Random_number + "?");
            play();
            return false;
        }
        else if (temp.equals("правильно")){
            System.out.println("Ура! Я угадал!");
            return true;
        }

        else{
            System.out.println("просто напишите \"больше\", \"меньше\" или \"правильно\"");
            System.out.println("Это число - " + Random_number + "?");
            play();
            return false;
        }

    }
    
}
