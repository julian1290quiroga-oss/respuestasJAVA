public class S6L3 {
    public static void main(String[] args) {
        // TODO 6: Crear un inventario y mostrar sus existencias iniciales.
        S06Inventario inventario = new S06Inventario();
        System.out.println("Existencias iniciales: " + inventario.getExistencias());

        // TODO 7: Ingresar 10, retirar 11 y retirar 10; mostrar resultado y existencias tras cada accion.
        System.out.println("\n--- OPERACIONES DE INGRESO Y RETIRO ---");

        // Ingresar 10
        boolean exitoIngresar10 = inventario.ingresar(10);
        System.out.println("Ingresar 10 -> Resultado: " + exitoIngresar10 + " | Existencias: " + inventario.getExistencias());

        // Intentar retirar 11 (debería fallar por no haber existencias suficientes)
        boolean exitoRetirar11 = inventario.retirar(11);
        System.out.println("Retirar 11  -> Resultado: " + exitoRetirar11 + " | Existencias: " + inventario.getExistencias());

        // Retirar 10 (debería ser exitoso)
        boolean exitoRetirar10 = inventario.retirar(10);
        System.out.println("Retirar 10  -> Resultado: " + exitoRetirar10 + " | Existencias: " + inventario.getExistencias());

        // TODO 8: Intentar ingresar 0 y 101; mostrar resultado y existencias tras cada accion.
        System.out.println("\n--- PRUEBA DE LÍMITES Y VALIDACIONES ---");

        // Intentar ingresar 0 (debería fallar por no ser una cantidad positiva)
        boolean exitoIngresar0 = inventario.ingresar(0);
        System.out.println("Ingresar 0   -> Resultado: " + exitoIngresar0 + " | Existencias: " + inventario.getExistencias());

        // Intentar ingresar 101 (debería fallar por superar la capacidad máxima de 100)
        boolean exitoIngresar101 = inventario.ingresar(101);
        System.out.println("Ingresar 101 -> Resultado: " + exitoIngresar101 + " | Existencias: " + inventario.getExistencias());
    }
}