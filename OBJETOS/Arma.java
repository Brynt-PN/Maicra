package OBJETOS;

public class Arma {
    
    private String material;
    private String tipo_arma;
    private double atak_point_arm = 0;

    public Arma(String mat, String arm){
        this.material = mat;
        this.tipo_arma = arm;
    }

    public double atack_points_define(){
        switch (material) {
            case "madera":
                atak_point_arm += 6.5;
                break;
        
            case "piedra":
                atak_point_arm += 7.0;
                break;

            case "hierro":
                atak_point_arm += 7.5;
                break;
        }
        switch (tipo_arma) {
            case "espada":
                atak_point_arm += 3;
                break;
        
            case "lanza":
                atak_point_arm += 3.5;
                break;

            case "arco":
                atak_point_arm += 2.5;
                break;
        }
        return this.atak_point_arm;
    }

    public void detail(){
        System.out.println("Arma: "+this.tipo_arma);
        System.out.println("Material: "+this.material);
    }
} 