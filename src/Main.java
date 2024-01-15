public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(1, 2, 3);
        Punto p2 = new Punto(2, 4, 5);
        Punto p3 = new Punto(3, 5, 8);

        Linea l1 = new Linea(1, p1, p2);

        Area a1 = new Area(1, p1, p2, p3);

    }
}
