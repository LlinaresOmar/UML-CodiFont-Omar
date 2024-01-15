public class Linea {

    private int id;
    private Punto pl1;
    private Punto pl2;

    public Linea(int id, Punto p1, Punto p2) {
        this.id = id;
        this.pl1 = p1;
        this.pl2 = p2;
    }

    public Linea(int id, Punto[] puntos){
        this.id = id;
        this.pl1 = puntos[0];
        this.pl2 = puntos[1];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Punto getPl1() {
        return pl1;
    }

    public void setPl1(Punto pl1) {
        this.pl1 = pl1;
    }

    public Punto getPl2() {
        return pl2;
    }

    public void setPl2(Punto pl2) {
        this.pl2 = pl2;
    }
}
