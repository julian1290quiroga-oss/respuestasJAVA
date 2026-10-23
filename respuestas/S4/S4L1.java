public class S4L1 {
    public static void main(String[] args) {
        String nombreEntrada = "  Ana  ";
        String opcionEntrada = " si ";

        // TODO 1: Guardar nombreEntrada.strip() en nombreLimpio conservando el original.
        String nombreLimpio = nombreEntrada.strip();

        // TODO 2: Mostrar Original, Limpio y Longitud limpia.
        System.out.println("--- DATOS DEL NOMBRE ---");
        System.out.println("Original:       [" + nombreEntrada + "]");
        System.out.println("Limpio:         [" + nombreLimpio + "]");
        System.out.println("Longitud limpia: " + nombreLimpio.length());

        // TODO 3: Limpiar opcionEntrada y comparar con SI usando equalsIgnoreCase.
        boolean confirmado = opcionEntrada.strip().equalsIgnoreCase("SI");

        // TODO 4: Mostrar Confirmado con el resultado booleano.
        System.out.println("\n--- COMPARACIÓN DE OPCIÓN ---");
        System.out.println("Confirmado: " + confirmado);

        // TODO 5: Probar los datos iniciales y explicar por qué el original no cambia.
        System.out.println("\n--- EXPLICACIÓN (TODO 5) ---");
        System.out.println("Valor de nombreEntrada tras el proceso: [" + nombreEntrada + "]");
    }
}