package boletin29;

public class Yates extends Embarcaciones{
 
    private float cv;
    private int camarotes;

    public Yates() {
    }

    public Yates(float cv, int camarotes) {
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public Yates(float cv, int camarotes, int eslora, String matricula) {
        super(eslora, matricula);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public float getCv() {
        return cv;
    }

    public void setCv(float cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yates{" + "cv=" + cv + ", camarotes=" + camarotes + '}';
    }

    @Override
    public double calcularmodulo(int dias) {
        return (10*eslora+cv+camarotes);
    }
    
    
}
