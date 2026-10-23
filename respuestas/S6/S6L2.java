public class S6L2 {
    public static void main(String[] args) {
        // TODO 5: Crear un termostato y mostrar su temperatura inicial.
        S06Termostato termostato = new S06Termostato();
        System.out.println("Temperatura inicial: " + termostato.getTemperatura() + " °C");

        // TODO 6: Solicitar 24, 31 y 16; mostrar cada resultado y la temperatura posterior.
        System.out.println("\n--- SOLICITUDES DE CAMBIO DE TEMPERATURA ---");

        // Intentar establecer a 24 °C
        boolean exito24 = termostato.setTemperatura(24);
        System.out.println("Solicitud 24 °C -> Aceptada: " + exito24 + " | Temperatura actual: " + termostato.getTemperatura() + " °C");

        // Intentar establecer a 31 °C
        boolean exito31 = termostato.setTemperatura(31);
        System.out.println("Solicitud 31 °C -> Aceptada: " + exito31 + " | Temperatura actual: " + termostato.getTemperatura() + " °C");

        // Intentar establecer a 16 °C
        boolean exito16 = termostato.setTemperatura(16);
        System.out.println("Solicitud 16 °C -> Aceptada: " + exito16 + " | Temperatura actual: " + termostato.getTemperatura() + " °C");
    }
}