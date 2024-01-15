public class Area {

        private int id;
        private Punto pa1;
        private Punto pa2;
        private Punto pa3;

        public Area(int id, Punto p1, Punto p2, Punto p3) {
            this.id = id;
            this.pa1 = p1;
            this.pa2 = p2;
            this.pa3 = p3;
        }

        public Area(int id, Linea l1, Punto p1){
            this.id = id;
            this.pa1 = l1.getPl1();
            this.pa2 = l1.getPl2();
            this.pa3 = pa1;
        }

        public Area(int id, Linea l1, Linea l2){
            this.id = id;
            this.pa1 = l1.getPl1();
            this.pa2 = l1.getPl2();
            this.pa3 = l2.getPl1();
        }

}
