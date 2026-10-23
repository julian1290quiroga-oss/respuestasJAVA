public class S6L1 {
    // TODO 1: Declarar existencias como int privado y capacidad como final int privado igual a 100.
    private int existencias;
    private final int capacidad = 100;

    public S6L1() {
        // TODO 2: Inicializar las existencias en cero.
        this.existencias = 0;
    }

    public int getExistencias() {
        // TODO 3: Devolver las existencias actuales.
        return this.existencias;
    }

    public boolean ingresar(int cantidad) {
        // TODO 4: Validar cantidad positiva y espacio disponible antes de sumar.
        if (cantidad > 0 && (this.existencias + cantidad) <= this.capacidad) {
            this.existencias += cantidad;
            return true;
        }
        return false;
    }

    public boolean retirar(int cantidad) {
        // TODO 5: Validar cantidad positiva y existencias suficientes antes de restar.
        if (cantidad > 0 && cantidad <= this.existencias) {
            this.existencias -= cantidad;
            return true;
        }
        return false;
    }
}