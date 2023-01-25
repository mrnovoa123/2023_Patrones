package patterns.creational.factorymethod.buttons;

/**
 * Producto concreto - Bot�n HTML
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Bot�n HTML</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("�Bot�n HTML pulsado!");
    }
}