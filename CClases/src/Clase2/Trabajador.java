/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import Clase1.Empleador;

/**
 *
 * @author Herberth
 */
public class Trabajador {
 
   
    public int Id;
    public String Nombre;
    public float Salario;
    public  Empleador Empleador;
    
    public Trabajador(String nombre,float salario, Empleador empleador){
        Nombre = nombre;
        Salario = salario;
        Empleador = empleador;
    }
    
    public String ObservarPaga(){
        return Empleador.PagoEmpleado(this);      
    }
}
