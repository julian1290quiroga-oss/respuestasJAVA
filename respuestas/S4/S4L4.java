public class S4L4 {
    public static void main(String[] args) {
        int cantidad = 10;
        double medicion = 7.9;
        String cantidadTexto = "42";

        // TODO 1: Ampliar cantidad a double sin cast implícito/explícito y mostrarla.
        double cantidadDouble = cantidad; 
        System.out.println("Cantidad como double (ampliación): " + cantidadDouble);

        // TODO 2: Truncar medicion a int (casting explícito) y mostrarla.
        int medicionInt = (int) medicion;
        System.out.println("Medición truncada (7.9 a int): " + medicionInt);

        // TODO 3: Truncar -7.9 a int y mostrarlo.
        double medicionNegativa = -7.9;
        int medicionNegativaInt = (int) medicionNegativa;
        System.out.println("Medición negativa truncada (-7.9 a int): " + medicionNegativaInt);

        // TODO 4: Obtener un int con parseInt y un Integer con valueOf.
        int valorPrimitivo = Integer.parseInt(cantidadTexto);
        Integer valorWrapper = Integer.valueOf(cantidadTexto);

        // TODO 5: Realizar unboxing y mostrar los tres valores.
        int valorDesempaquetado = valorWrapper; // Unboxing automático
        System.out.println("int con parseInt: " + valorPrimitivo);
        System.out.println("Integer con valueOf: " + valorWrapper);
        System.out.println("int tras unboxing: " + valorDesempaquetado);

        // TODO 6: Convertir el primitivo a String con String.valueOf y mostrarlo entre corchetes.
        String primitivoATexto = String.valueOf(cantidad);
        System.out.println("Primitivo a String: [" + primitivoATexto + "]");
    }
}