package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.buttons.Button;

/**
 * Clase factoria. En realidad el nombre de la clase puede ser cualquiera
 * y puede contener tambi�n parte del n�cleo de la l�gica de negocio
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... otro c�digo de la clase ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Las subclases sobrescribir�n este m�todo para poder crear
     * los tipos de objetos m�s concretos. 
     */
    public abstract Button createButton();
}