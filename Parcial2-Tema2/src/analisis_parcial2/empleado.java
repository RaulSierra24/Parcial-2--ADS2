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
public class empleado extends persona{
    public String nombre;
    public String apellido;
    public int edad;
    public int salario;
    public int meses_trabajo;
    public empleado(){
        
    }
    public empleado (String nombre,String apellido,int edad,int salario,int meses){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario=salario;
        this.meses_trabajo= meses;
    }
    

    
    @Override
    public String nombreCompleto(){
        return nombre +" "+apellido;
    }
}
