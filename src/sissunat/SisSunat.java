package sissunat;
import javax.swing.JOptionPane;
public class SisSunat {
    public static void main(String[] args) {
        final double UIT = 4300;
        double remuneracionMensual, otrosIngresos, rBrutoAnual, rNetaAnual, impAnual,impMensual,pagoMensual;
        int numeroMes;
        remuneracionMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su remuneracion mensual: "));
        numeroMes = Integer.parseInt(JOptionPane.showInputDialog("N° de Mes de ingreso"));
        otrosIngresos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese total de otros ingresos"));
        //Cálculo de la remuneración bruta anual
        rBrutoAnual = (remuneracionMensual*(13-numeroMes))+otrosIngresos;
        /*
        Cálculo de la remuneración neta anual
        */
        rNetaAnual = rBrutoAnual - (7*(UIT));
        /*
        Cálculo de el impuesto anual proyectado
        */
        if(rNetaAnual<=0){
            System.out.println("No pagas impuesto");
        }else{
            if(rNetaAnual<=(5*UIT)){
                impAnual = 0.08*rNetaAnual;
            }else if(rNetaAnual>(5*UIT) && rNetaAnual<=(20*UIT)){
                impAnual = 0.14 * rNetaAnual;
            }else if(rNetaAnual>(20*UIT) && rNetaAnual<=(35*UIT)){
                impAnual = 0.17*rNetaAnual;
            }else if(rNetaAnual>(35*UIT) && rNetaAnual<=(45*UIT)){
                impAnual = 0.2*rNetaAnual;
            }else{
                impAnual = 0.3*rNetaAnual;
            }
        impMensual = impAnual/(13-numeroMes);
            System.out.println("RETENCIÓN");
            System.out.println("----------------------------------------");
            System.out.println("Pago anual: "+rBrutoAnual);
            System.out.println("Impuesto anual: "+Math.round(impAnual));
        pagoMensual = (rBrutoAnual-impAnual)/(13-numeroMes);
        switch(numeroMes){
            case 1: System.out.println("Enero: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 2: System.out.println("Febrero: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 3: System.out.println("Marzo: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 4: System.out.println("Abril: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 5: System.out.println("Mayo: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 6: System.out.println("Junio: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 7: System.out.println("Julio: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 8: System.out.println("Agosto: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 9: System.out.println("Setiembre: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 10: System.out.println("Octubre: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 11: System.out.println("Noviembre: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
            case 12: System.out.println("Diciembre: "+Math.round(impMensual)+"  "+"Pago mensual: "+ Math.round(pagoMensual));
        }
        }
        
    }
    
}
