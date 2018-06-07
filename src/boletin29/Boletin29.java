package boletin29;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Boletin29 {

    public static void main(String[] args) {
    
     Menus M = new Menus();
     List<Embarcaciones> flota = new ArrayList();
     
        Veleros Velero1 = new Veleros(3,54,"111");
        Veleros Velero2 = new Veleros(1,15,"222");
        Deportivas Deportiva1 = new Deportivas(40,5,"333");
        Deportivas Deportiva2 = new Deportivas(98,22,"444");
        Yates Yate1 = new Yates(120,4,35,"555");

    int dias = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias desea alquilarlo"));
    M.crearfactura(Velero1, dias);    
    }
}
