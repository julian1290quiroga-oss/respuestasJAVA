public class S6L6 {
    // TODO 1: Declarar temperaturaObjetivo como campo privado int.
    private int temperaturaObjetivo;

    public S6L6() {
        // TODO 2: Inicializar la temperatura objetivo en 20.
        this.temperaturaObjetivo = 20;
    }

    public int getTemperaturaObjetivo() {
        // TODO 3: Devolver la temperatura objetivo actual.
        return this.temperaturaObjetivo;
    }

    public boolean ajustarTemperatura(int nuevaTemperatura) {
        // TODO 4: Aceptar solo de 16 a 30 inclusive; cambiar si acepta y devolver el resultado.
        if (nuevaTemperatura >= 16 && nuevaTemperatura <= 30) {
            this.temperaturaObjetivo = nuevaTemperatura;
            return true;
        }
        return false;
    }
}