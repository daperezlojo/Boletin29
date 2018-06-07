package boletin29;

public class Menus {
    
     public void crearfactura(Embarcaciones b, int dias){
        double total=b.calcularmodulo(dias);
        System.out.println("Factura\n"
                + "Precio="+total+"\n"
                + "Matrícula="+b.getMatricula()+"\n"
                + "Eslora="+b.getEslora());
    }
}
