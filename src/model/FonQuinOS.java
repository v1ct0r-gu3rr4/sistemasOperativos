package model;

import controller.Controller;

/**
 *
 * @author Edgar Telles
 */
public class FonQuinOS {

    public FonQuinOS() {
        Controller controlador = new Controller();
        controlador.initSO();
    }
    
    public static void main(String[] args) {
        FonQuinOS SO = new FonQuinOS();
        
    }
    
}
