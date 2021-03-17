/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis_parcial2;

/**
 *
 * @author crasip
 */
public class Analisis_parcial2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        persona[] empleados = {
            new empleado("allan","quezada",20,2000,10),
            new empleado("Francisco","Gonzalez",20,3052,20),
            new empleado("emanuel","amperez",20,3265,30),
            new empleado("logitech","error",20,4231,15),
            
        };
        nombre_Completo( empleados);
        
    }
    public static void nombre_Completo(persona[] empleado) {
        double area = 0;
        for (persona item : empleado) {
            System.out.println("El nombre es: "+item.nombreCompleto());
        }
    }
}
