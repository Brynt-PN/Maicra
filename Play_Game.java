import Personajes.Zombie;

public class Play_Game {
    public static void main(String[] args) {
        Zombie z_1 = new Zombie("Arturo");
        Zombie z_2 = new Zombie("Juan");

        do{
            z_1.Valores();
            System.out.println("/----------------------");
            z_2.Valores();
            System.out.println("/----------------------");
            z_1.Atack(z_2);
            z_2.Atack(z_1);
        }
        while(z_1.Is_a_life() == true || z_2.Is_a_life() == true );
    }
}
