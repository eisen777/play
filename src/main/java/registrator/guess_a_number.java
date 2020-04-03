package registrator;

public class guess_a_number {
    private int number;
    guess_a_number (boolean choice){
        number = 50;
    }
    int DoGuess(boolean more){
      if(more){
        number = number + (100 - number)/2;
      }
      else {
          number = number - (100 - number)/2;
      }
        return number;
    }
    
}
