package boletin29;

public abstract class Embarcaciones {
    int eslora;
    String matricula;
    public Embarcaciones() {
    }

    public Embarcaciones(int eslora, String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "eslora=" + eslora + ", matricula="+matricula;
    }
    
    public abstract double calcularmodulo(int dias);
}
