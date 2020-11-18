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
public class Ford  extends Automovil {
    int anio;
    int descuentoFabricante;
    
    

    public Ford() {
        
    }

    public double getPrecioVenta() {
        
        return precioRegular-(precioRegular*descuentoFabricante)/100;
        
    }
    
    
    
}
