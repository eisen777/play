package registrator;

import java.util.Random;
import java.util.Scanner;

public class PlayGuessTheNumberAMachine {
    Random rnd = new Random(System.currentTimeMillis());
    private int max;
    private int min;
    private int Random_number;
   /* public PlayGuessTheNumberAMachine() {
        min = 0;
        max = 100;
        System.out.println("Загадайте пожалуйста число от 1 до 100, а я попробую отгадать");
        System.out.println("если у меня не получится с первого раза, то скажите больше или меньше");
        System.out.println("просто напишите \"больше\", \"меньше\" или \"правильно\"");
        System.out.println("Наишите \"загадал\" если готовы начать");
        play();


    }*/
    public void start_play(){
        min = 0;
        max = 100;
        System.out.println("Загадайте пожалуйста число от 1 до 100, а я попробую отгадать");
        System.out.println("если у меня не получится с первого раза, то скажите больше или меньше");
        System.out.println("просто напишите \"больше\", \"меньше\" или \"правильно\"");
        System.out.println("Наишите \"загадал\" если готовы начать");
        String temp = new Scanner(System.in).nextLine();
        if (temp.equals("загадал")){
            System.out.println("Отлично! Я просто уверен, что это число - " + Random_number);
            play();
        }
        else {
            System.out.println("Просто наишите \"загадал\"");
            start_play();
        }
    }

    public boolean play(){

        String temp = new Scanner(System.in).nextLine();
        if (temp.equals("больше")){
            min = Random_number+1;
            Random_number = min + rnd.nextInt(max - min + 1);
            System.out.println("Хм! Может быть тогда - " + Random_number);
            play();
            return false;
        }
        else if (temp.equals("меньше")){
            max = Random_number-1;
            Random_number = min + rnd.nextInt(max - min + 1);
            System.out.println("Хм! Может быть тогда - " + Random_number);
            play();
            return false;
        }
        else if (temp.equals("правильно")){
            System.out.println("Ура! Я угадал!");
            return true;
        }

        System.out.println("просто напишите \"больше\", \"меньше\" или \"правильно\"");

        return false;
    }
    
}
