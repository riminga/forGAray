package game;

public class StartGame {

    public void start() {
        while (true){
         Player p1 = new Player();
         Player p2 = new Player();
         int number = (int) (Math.random() * 11);

         p1.option();
         p2.option();
         System.out.println("Число которое нужно угадать" +" "+ number);

         if (p1.getNumber() == number) {
            p1.setGuessed(true);
         }
         if (p2.getNumber() == number) {
            p2.setGuessed(true);
         }
         if (p1.isGuessed() == true || p2.isGuessed() == true){
             System.out.println("первый игрок думает что это число" + " " + p1.getNumber() +" "+ p1.isGuessed());
             System.out.println("Второй игрок думает что это число" + " " + p2.getNumber() +" "+ p2.isGuessed());
             break;
         }
         else {
             System.out.println("Никто не угадал");
         }

    }


}
}
