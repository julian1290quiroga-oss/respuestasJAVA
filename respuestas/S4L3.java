public class S43 {
    public static void main(String[] args) {
        String edadTexto = " 20 ";
        String estaturaTexto = "1.72";
        String estudianteTexto = "true";

        // TODO 1: Limpiar edadTexto antes de convertirlo (eliminar espacios en blanco).
        String edadLimpia = edadTexto.trim();

        // TODO 2: Convertir edad a int y estatura a double.
        int edad = Integer.parseInt(edadLimpia);
        double estatura = Double.parseDouble(estaturaTexto);

        // TODO 3: Convertir estudianteTexto a boolean.
        boolean esEstudiante = Boolean.parseBoolean(estudianteTexto);

        // TODO 4: Mostrar Edad, Edad siguiente, Estatura (m) y Estudiante.
        int edadSiguiente = edad + 1;

        System.out.println("Edad: " + edad);
        System.out.println("Edad siguiente: " + edadSiguiente);
        System.out.println("Estatura (m): " + estatura);
        System.out.println("Estudiante: " + esEstudiante);
    }
}