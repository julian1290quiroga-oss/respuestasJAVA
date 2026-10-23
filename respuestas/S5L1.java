public class S5L1 {
    public static void main(String[] args) {
        // TODO 7: Crear primerLibro con El principito y segundoLibro con Matilda.
        Libro primerLibro = new Libro("El principito");
        Libro segundoLibro = new Libro("Matilda");

        // TODO 8: Mostrar titulo, dos intentos de prestamo y estado del primer libro.
        System.out.println("--- PRÉSTAMO DEL PRIMER LIBRO ---");
        System.out.println("Título: " + primerLibro.getTitulo());

        // Primer intento de préstamo
        primerLibro.prestar();

        // Segundo intento de préstamo (debería indicar que ya está prestado)
        primerLibro.prestar();

        // Estado del primer libro
        primerLibro.mostrarEstado();

        // TODO 9: Devolver el primer libro y mostrar el estado de ambos libros.
        System.out.println("\n--- DEVOLUCIÓN Y ESTADO FINAL ---");
        primerLibro.devolver();

        System.out.println("\nEstado actual de los libros:");
        primerLibro.mostrarEstado();
        segundoLibro.mostrarEstado();
    }
}