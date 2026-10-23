public class S4L2 {
    public static void main(String[] args) {
        String codigo = "USR-1048-CO";

        // TODO 1 y TODO 2: Validar longitud (11), prefijo ("USR-") y separador '-' en índice 8.
        if (codigo != null 
                && codigo.length() == 11 
                && codigo.startsWith("USR-") 
                && codigo.charAt(8) == '-') {

            // TODO 3: Extraer tipo, numeroTexto, pais e inicial.
            String tipo = codigo.substring(0, 3);          // "USR"
            String numeroTexto = codigo.substring(4, 8);   // "1048"
            String pais = codigo.substring(9, 11);         // "CO"
            char inicial = codigo.charAt(0);               // 'U'

            // TODO 4: Mostrar los cuatro datos si es válido.
            System.out.println("--- CÓDIGO VÁLIDO ---");
            System.out.println("Tipo: " + tipo);
            System.out.println("Número: " + numeroTexto);
            System.out.println("País: " + pais);
            System.out.println("Inicial: " + inicial);

        } else {
            // TODO 4: Mostrar únicamente mensaje si el código es inválido.
            System.out.println("Código inválido");
        }
    }
}