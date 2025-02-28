public class Pedido {
    public Cliente cliente;
    private double descuento;
    private double precioFinal;

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total){
        if (total > 100) {
            descuento = total * (cliente.isEsVip() ? 0.15 : 0.10);
            precioFinal = total - descuento;
            System.out.println("Pedido " + (cliente.isEsVip() ? "VIP" : "") + " aprobado. Total: "
                    + precioFinal + " (descuento aplicado: " + descuento + ")");
        } else {
            System.out.println("Pedido " + (cliente.isEsVip() ? "VIP" : "") + " aprobado. Total: " + total);
        }
    }
}
