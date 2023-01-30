package planetas;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Venus", 100, 1000, 1000, 5, 6, TipoPlaneta.GASEOSO, false);
        System.out.println("Nombre del planeta: " + p1.getNombre());
        System.out.println("Número de satelites: " + p1.getNumeroSatelites());
        System.out.println("Masa: " + p1.getMasaEnKg() + " kg");
        System.out.println("Volumen: " + p1.getVolumenEnKm3() + " km3");
        System.out.println("Diametro: " + p1.getDiametroEnKm() + " km");
        System.out.println("Distancia al sol: " + p1.getDistanciaAlSol() + " km");
        System.out.println("Tipo de planeta: " + p1.tipoPlaneta);

        System.out.println("¿Es observable? " + p1.esObservable());



    }

}
