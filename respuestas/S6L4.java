public class S6L4 {
    public static void main(String[] args) {
        // TODO 6: Crear primerPedido y segundoPedido; mostrar el estado inicial de ambos.
        S06Pedido primerPedido = new S06Pedido();
        S06Pedido segundoPedido = new S06Pedido();

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Primer pedido estado: " + primerPedido.getEstado());
        System.out.println("Segundo pedido estado: " + segundoPedido.getEstado());

        // TODO 7: Enviar primerPedido y luego intentar cancelarlo; consultar tras cada accion.
        System.out.println("\n--- PRIMER PEDIDO ---");
        boolean exitoEnviar1 = primerPedido.enviar();
        System.out.println("Resultado enviar: " + exitoEnviar1 + " | Estado actual: " + primerPedido.getEstado());

        boolean exitoCancelar1 = primerPedido.cancelar();
        System.out.println("Resultado cancelar: " + exitoCancelar1 + " | Estado actual: " + primerPedido.getEstado());

        // TODO 8: Cancelar segundoPedido y luego intentar enviarlo; consultar tras cada accion.
        System.out.println("\n--- SEGUNDO PEDIDO ---");
        boolean exitoCancelar2 = segundoPedido.cancelar();
        System.out.println("Resultado cancelar: " + exitoCancelar2 + " | Estado actual: " + segundoPedido.getEstado());

        boolean exitoEnviar2 = segundoPedido.enviar();
        System.out.println("Resultado enviar: " + exitoEnviar2 + " | Estado actual: " + segundoPedido.getEstado());
    }
}