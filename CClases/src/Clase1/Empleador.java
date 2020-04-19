/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1;

import Clase2.Trabajador;

/**
 *
 * @author Herberth
 */
public class Empleador {
    
    
     public String Nombre;
  public String PagoEmpleado(Trabajador trabajador ){
      
      double Pago= AplicarDescuentosAntesDePago(trabajador);
      return "Empleado"+ trabajador+" pago:"+Pago;

    private double AplicarDescuentosAntesDePago(Trabajador trabajador) {
       float salario = trabajador.Salario;
        //salario - renta 10% - afp - isss
        return salario - salario * 0.1 - salario*0.075 - salario*0.105; 
    }
      
      
      
          
      
}
