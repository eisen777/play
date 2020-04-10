package registrator;

import java.util.Scanner;
import java.lang.*;

import static java.lang.Math.*;

public class PlayGuessTheNumberAHuman {
    public void setRandom_number() {
        Random_number = (int) random();
    }

    public int getRandom_number() {
        return Random_number;
    }

    private int Random_number = 0;

    private int User_number = 0;

    public void setUser_number() {
        System.out.println("Введите число:");
        User_number = new Scanner(System.in).nextInt();
    }

    public int getUser_number() {
        if (User_number < 0 | User_number > 100){
            System.out.println("попробуйте еще раз");
            this.setUser_number();
        }
        return User_number;
    }

    public void Show_random(){

        System.out.println(Random_number);
    }
    public boolean compare(){
        if (Random_number ==  User_number){
            System.out.println("Ура, Вы угадали");
            return true;
        }
        else{
            System.out.println("попробуйте еще!");//TODO сделать больше/меньше
            return false;
        }
    }

}
