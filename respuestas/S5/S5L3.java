public class S5L3 {
    public static void main(String[] args) {
        // TODO 7: Crear reservaAna (2 horas, 15000 pesos/hora) y reservaLuis (1, 20000).
        ReservaSala reservaAna = new ReservaSala("Ana", 2, 15000);
        ReservaSala reservaLuis = new ReservaSala("Luis", 1, 20000);

        // TODO 8: Mostrar los resultados de extender la reserva de Ana en 1, 6 y 0 horas.
        System.out.println("--- INTENTOS DE EXTENSIÓN PARA ANA ---");
        System.out.println("Extender 1 hora: " + reservaAna.extenderReserva(1));
        System.out.println("Extender 6 horas: " + reservaAna.extenderReserva(6));
        System.out.println("Extender 0 horas: " + reservaAna.extenderReserva(0));

        // TODO 9: Mostrar cliente, horas y costo final de ambas reservas.
        System.out.println("\n--- DETALLE DE RESERVA: ANA ---");
        System.out.println("Cliente: " + reservaAna.getCliente());
        System.out.println("Horas: " + reservaAna.getHoras());
        System.out.println("Costo final: $" + reservaAna.calcularCostoTotal());

        System.out.println("\n--- DETALLE DE RESERVA: LUIS ---");
        System.out.println("Cliente: " + reservaLuis.getCliente());
        System.out.println("Horas: " + reservaLuis.getHoras());
        System.out.println("Costo final: $" + reservaLuis.calcularCostoTotal());
    }
}