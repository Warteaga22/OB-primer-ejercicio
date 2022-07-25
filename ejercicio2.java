public class ejercicio2 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puerta);
    }

}

class Coche {
    public int puerta = 0;

    public void agregarPuertas() {

    }

    {
        this.puerta++;
    }
}


