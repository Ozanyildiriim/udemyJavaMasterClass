package Chapter8Polymorphism.Encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.fullName = "Ozan";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer ozan = new EnhancedPlayer("Ozan",200,"Sword");
        System.out.println("Inıtıal health is " + ozan.healthRemaining());
    }
}
