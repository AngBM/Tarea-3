import java.util.Arrays;
public class Geometrias {
    public static void main(String args[]) {

        Rectangulo[] rects = new Rectangulo[4];

        rects[0] = new Rectangulo(4.0, 2.5);
        rects[1] = new Rectangulo(1.0, 2.7);
        rects[2] = new Rectangulo(3.8, 2.4);
        rects[3] = new Rectangulo(3.5, 1.7);
        Arrays.sort(rects);

        Circulo[] circs = new Circulo[4];

        circs[0] = new Circulo(2);
        circs[1] = new Circulo(4);
        circs[2] = new Circulo(6);
        circs[3] = new Circulo(8);
        Arrays.sort(circs);

        Triangulo[] trias = new Triangulo[4];

        trias[0] = new Triangulo(3.5, 4.0);
        trias[1] = new Triangulo(2.7, 3.6);
        trias[2] = new Triangulo(3.8, 4.5);
        trias[3] = new Triangulo(5.5, 3.2);
        Arrays.sort(trias);

        //Prueba
        System.out.println("Area del Rectangulo: " + rects[0].calcularArea());
        System.out.println("Area del Triangulo: " + trias[3].calcularArea());
        System.out.println("Comparacion: " + rects[0].compareTo(trias[3]));

        System.out.println("Area del Circulo: " + circs[1].calcularArea());
        System.out.println("Area del Rectangulo: " + rects[1].calcularArea());
        System.out.println("Comparacion: " + circs[1].compareTo(rects[1]));

        System.out.println("Area del Triangulo: " + trias[3].calcularArea());
        System.out.println("Area del Circulo: " + circs[2].calcularArea());
        System.out.println("Comparacion: " + trias[3].compareTo(circs[2]));
    }
}