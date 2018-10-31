package fuerzaaa;

import javax.swing.JOptionPane;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        double l,c;
        JOptionPane.showMessageDialog(null, "Creado por Diana Aura Lohra Fuentes y Jorge Alberto García Grandini");
        
        JOptionPane.showMessageDialog(null, "Este programa te da el valor del campo eléctrico de cada una de las cargas de un cuadrado");
        
        
        //Que figura es max 8 lados
        //Cargas
        //Medida de Lados 
        
        
        String ladoss= JOptionPane.showInputDialog(null, "Ingresa el valor de los lados:");
        double ld = Double.parseDouble(ladoss);

        JOptionPane.showMessageDialog(null, "Ingresa valor de las otras cargas por orden.");
        
        double cargas [3]={;
        
        double ele[3];
        
        //crear for que se repita hasta que se cumplan el numero de cargas.
        
        for(int i=1;i<=3;i++){
            int x= i;
            String cargass= JOptionPane.showInputDialog(null, "Valor de la carga "+x+": ");
            c=Double.parseDouble(cargass);
            cargas [i]=c;
            
        }

        // for de operaciones
        for(int i=1;i<=3;i++){
            double y= cargas [i];
            double y1= Math.abs(y);
            double k = (9*Math.pow(10, 9));
            double ra = ld*ld;
            double rb= Math.sqrt((ld*ld)+(ld*ld));
            
            
            if(i==1||i==3){
                double q = (k*y1)/ra;       
                JOptionPane.showMessageDialog(null, "El campo electrico en la posicion "+i+"es "+q+".");
                
            }
            if (i==2){
                double q = (k*(y1*Math.pow(10, -6)))/rb;
                JOptionPane.showMessageDialog(null, "El campo electrico en la posicion "+i+"es "+q+".");
            }
            
            
            
            double e ;
        }
    }
}
