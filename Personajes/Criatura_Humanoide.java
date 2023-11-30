package Personajes;

public abstract class Criatura_Humanoide {
    
    String name_G;
    double life_points;
    boolean is_Equip;
    double atack_points;
    String especialidad;
    int exp = 0;
    int Lv;
    boolean is_life = true;
    int exp_Drop;

    public abstract void Atack(Object objetivo);

    public int Dropeo(){
        exp_Drop = (this.Lv * 10)/2;
        return exp_Drop;
    }

    public int Danger(double atk_pnt){
        this.life_points = this.life_points - atk_pnt;
        this.Is_a_life();
        if(is_life == false){
            return this.Dropeo();
        }
        return 0;
    }

    public boolean Is_a_life(){
        if (this.life_points <= 0) {
            is_life = false;
            System.out.println(this.name_G + " is dead");
        }
        return is_life;
    }
}