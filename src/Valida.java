/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Valida {

    public static boolean validarRango (int kilometraje){
        if (kilometraje<=500000 && kilometraje>0) {
            return true;
        } else {
            return false;//System.out.println("Error al guardar. El kilometraje debe estar entre 0 a 500000 km.");
        }
    }
    
    public static boolean validarPatente (String patente){
    
        if (patente.length() == 6) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean estaVacio(String nombre){
        if (nombre.isEmpty()) {
            return true;
        } else {
            return false;
            
        }
    }
    
    public static boolean validarLargo8 (int telefono){
        Integer.toString(telefono, telefono);
        return true;
    }
    
    
}
