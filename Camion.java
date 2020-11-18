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
public class Camion extends Automovil {
    int peso;

    public Camion() {
        
    }

    public double getPrecioVenta() {
        if(peso>2000){
            return precioRegular-(precioRegular*0.10);
        }else{
            return precioRegular-(precioRegular*0.20);
        }
        
    }
    
    
    
}
