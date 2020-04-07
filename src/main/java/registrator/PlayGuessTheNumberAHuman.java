package registrator;

import java.util.Scanner;

public class PlayGuessTheNumberAHuman {
    private int Random_number = 0;

    private int User_number = 0;
    public static int regNumber() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
    public void setRandom_Number(){
        this.Random_number = (int) Math.random();
    }
    public void Show_random(){
        System.out.println(this.Random_number);
    }
    public void setUser_number(int User_number){
        this.User_number = User_number;
    }
    public boolean compare(){
        if (this.Random_number ==  this.User_number){
            System.out.println("Ура, Вы угадали");
            return true;
        }
        else{
            System.out.println("попробуйте еще!");
            return false;
        }
    }

}
