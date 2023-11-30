package Personajes;
import java.util.Random;

import OBJETOS.Arma;

public class Zombie extends Criatura_Humanoide{
    Random rand = new Random();
    Object obj_equip;
    int probability = rand.nextInt(3)+1;

    public Zombie(String name){
        this.name_G       = "ZOMBIE -> " + name;
        this.Lv           = rand.nextInt(99) + 1;
        this.is_Equip     = true;
        this.especialidad = null;
        if (Lv > 0 && Lv < 35) {
            this.life_points  = 40;
            this.atack_points = 10;
        }
        else if (Lv > 34 && Lv < 70) {
            this.life_points  = 65;
            this.atack_points = 15;
        }
        else {
            this.life_points  = 100;
            this.atack_points = 20;
        }
        
        
        switch (probability) {
            case 1:
                this.obj_equip = new Arma("madera", "lanza");
                break;
        
            case 2:
                this.obj_equip = new Arma("piedra", "espada");
                break;

            case 3:
                this.obj_equip = new Arma("hierro", "lanza");
                break;
        
        }
    }

    @Override
    public void Atack(Object objetivo) {
        
        ((Criatura_Humanoide) objetivo).Danger((this.atack_points + ((Arma) this.obj_equip).atack_points_define()));
        
    }

    public void Valores(){
        System.out.println("Nombre: "+this.name_G);
        System.out.println("Lv: "+this.Lv);
        System.out.println("Atake: "+this.atack_points);
        System.out.println("Esta vivo?: "+this.is_life);
        ((Arma) this.obj_equip).detail();
    }
}
