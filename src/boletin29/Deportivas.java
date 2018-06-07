package boletin29;

public class Deportivas extends Embarcaciones {
 
    private float cv;

    public Deportivas() {
    }

    public Deportivas(float cv) {
        this.cv = cv;
    }

    public Deportivas(float cv, int eslora, String matricula) {
        super(eslora, matricula);
        this.cv = cv;
    }

    public float getCv() {
        return cv;
    }

    public void setCv(float cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Deportivas{" + "cv=" + cv + '}';
    }

    @Override
    public double calcularmodulo(int dias) {
        return (10*eslora*dias+cv);
    }

    
    
}
