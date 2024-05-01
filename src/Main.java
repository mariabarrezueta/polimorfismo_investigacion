// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Cuadrado(4);

        System.out.println("Área del círculo: " + figura1.calcularArea());
        System.out.println("Área del cuadrado: " + figura2.calcularArea());
    }
}