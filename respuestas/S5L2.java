public class S5L2 {
    public static void main(String[] args) {
        // TODO 6: Crear primeraFigura de 5 por 3 y segundaFigura de 4 por 4.
        Rectangulo primeraFigura = new Rectangulo(5, 3);
        Rectangulo segundaFigura = new Rectangulo(4, 4);

        // TODO 7: Mostrar area, perimetro y esCuadrado de cada figura.
        System.out.println("--- PRIMERA FIGURA (5x3) ---");
        System.out.println("Área: " + primeraFigura.calcularArea());
        System.out.println("Perímetro: " + primeraFigura.calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + primeraFigura.esCuadrado());

        System.out.println("\n--- SEGUNDA FIGURA (4x4) ---");
        System.out.println("Área: " + segundaFigura.calcularArea());
        System.out.println("Perímetro: " + segundaFigura.calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + segundaFigura.esCuadrado());
    }
}