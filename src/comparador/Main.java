package comparador;

/**
 * Clase principal
 * Encargada de ejecutar el programa
 * @author grifiun
 */
public class Main {
    public static void main(String[] args) {
        String resultado;
        Algoritmo alg = new Algoritmo("ATGTCTTCCTCGAVVVVVV", "VVVVVVTGCTTCCTATGAC");
        resultado = alg.devolverResultado();
        System.out.println(resultado);
    }
}
