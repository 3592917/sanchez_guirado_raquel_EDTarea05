/**
 * Clase principal que ejecuta el programa para procesar los pedidos
 *
 * @author Raquel Sánchez Guirado
 */
public class Main {
    public static void main(String[] args) {
        // Crea un pedido para un cliente normal
        Pedido pedido1 = new Pedido(new Cliente(false, "Juan", 1));
        pedido1.procesarPedido(101);

        // Crea un pedido para un cliente VIP
        Pedido pedido2 = new Pedido(new Cliente(true, "Juan de todos los santos", 2));
        pedido2.procesarPedido(101);

        // Convierte al cliente 1 en VIP y procesa un nuevo pedido de 1000 €
        pedido1.cliente.setEsVip(true);
        pedido1.procesarPedido(1000);

    }
}
