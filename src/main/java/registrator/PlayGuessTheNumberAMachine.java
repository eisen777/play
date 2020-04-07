package registrator;

public class PlayGuessTheNumberAMachine {
    private int number;
    PlayGuessTheNumberAMachine(boolean choice){
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
