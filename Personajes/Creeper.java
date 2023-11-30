package Personajes;

import java.util.Random;

public class Creeper extends Criatura_Humanoide{

    Random rand = new Random();

    public Creeper(){
        this.name_G       = "Creeper";
        this.life_points  = 70;
        this.is_Equip     = false;
        this.especialidad = "Explosión";
        this.Lv           = rand.nextInt(99) + 1;
        if (Lv > 0 && Lv < 35) {
            this.atack_points = 50;
        }
        else if (Lv > 34 && Lv < 90) {
            this.atack_points = 70;
        }
        else {
            this.atack_points = 100;
        }
    }

    @Override
    public void Atack(Object objetivo) {
        ((Criatura_Humanoide) objetivo).Danger(this.atack_points);
        this.life_points = 0;
        this.Is_a_life();
        
    }
}