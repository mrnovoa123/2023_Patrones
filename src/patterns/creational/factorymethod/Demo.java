package patterns.creational.factorymethod;

import patterns.creational.factorymethod.factory.Dialog;
import patterns.creational.factorymethod.factory.HtmlDialog;
import patterns.creational.factorymethod.factory.WindowDialog;

/**
 * Clase Demo. Esta clase cliente usa la factoria para 
 * producir diferentes tipos de botones
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * La factoria especializada (HtmlButton o WindowButton)
     * se escoge seg�n la configuraci�n de las opciones de entorno
     * que se configuran en la clase cliente de la factoria.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("ssdfgsdfg2")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Todo el c�digo del cliente funcionar� con las factorias y los 
     * productos a trav�s de las interfaces abstractas. De esta forma,
     * No es necesario conocer a priori qu� factor�a se usar� y qu�
     * tipo de producto se retornar� como resultado.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}