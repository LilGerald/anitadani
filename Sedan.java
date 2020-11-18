/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyectotallerautomoviles;

/**
 *
 * @author pc reclutamiento
 */
public class Sedan extends Automovil {
    int longitud;

    public Sedan() {
        
    }

    public double getPrecioVenta() {
        if(longitud>20){
            return precioRegular-(precioRegular*0.05);
        }else {
            return precioRegular-(precioRegular*0.10);
        }
       
    }
    
    
}
