package Exceptions;

public class Resolution {
    //Le probleme est que l'erreur est dans tous les cas catch par le catch RuntimeException. La solution est de sois mettre le catch RuntimeException en dernier, sois de ne pas l'utiliser.
    public class Resol {
        public static void main(String[] args) {
            int k;

            try {
                k = 1 / Integer.parseInt(args[0]);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Index " + e);
            } catch (ArithmeticException e) {
                System.err.println("Arithmetic " + e);
            } catch (RuntimeException e) {
                System.err.println("Runtime " + e);
            }
        }
    }
}
