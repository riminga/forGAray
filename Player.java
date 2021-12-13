package game;

public class Player {
   private int number;
   private boolean guessed = false;



   public int option(){
       number = (int) (Math.random()* 10);
       return number;
   }

    public int getNumber() {
        return number;
    }

    public boolean isGuessed() {
        return guessed;
    }

    public void setGuessed(boolean guessed) {
        this.guessed = guessed;
    }
}
