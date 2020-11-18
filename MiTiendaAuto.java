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
public class MiTiendaAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sedan sed = new Sedan();
        sed.velocidad = 100;
        sed.precioRegular = 5000.00;
        sed.color = "verde";
        sed.longitud = 30;
                
        Camion cam = new Camion();
        cam.velocidad = 100;
        cam.precioRegular = 5000.00;
        cam.color = "verde";
        cam.peso = 1000;
        
        Ford fo = new Ford();
        fo.velocidad = 100;
        fo.precioRegular = 5000.00;
        fo.color = "verde";
        fo.anio = 1999;
        fo.descuentoFabricante = 10;
        
        Automovil auto = new Automovil();
        auto.velocidad = 100;
        auto.precioRegular = 5000.00;
        auto.color = "verde";
        
        System.out.println("Precio sedan: "+sed.getPrecioVenta());
        System.out.println("Precio camion: "+cam.getPrecioVenta());
        System.out.println("Precio ford: "+fo.getPrecioVenta());
        System.out.println("Precio automovil: "+auto.getPrecioVenta());
        
        
        
        
        
    }
    
}
