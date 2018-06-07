package boletin29;

public class Veleros extends Embarcaciones {

     int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(int mastiles, int eslora, String matricula) {
        super(eslora,matricula);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Veleros{" + "mastiles=" + mastiles + '}';
    }

    @Override
    public double calcularmodulo(int dias) {
        return (10*eslora*dias+mastiles);
    }
    
    
}
