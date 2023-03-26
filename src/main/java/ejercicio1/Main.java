package ejercicio1;

public class Main {
    public static void main(String[] args) {
        double min = 4;
        double max = 10;

        double root = bisect(min, max);
        System.out.println("La raíz es: " + root);
    }

    public static final double N = 2;
    public static final double PREC = 1e-6;

    public static double f(double x) {
        return x * x - N;
    }

    public static double bisect(double min, double max) {
        double med = (min + max) / 2;
        double diff = max - min;

        while (diff >= PREC) {
            if (f(min) * f(med) < 0) {
                max = med;
            } else {
                min = med;
            }
            med = (min + max) / 2;
            diff = max - min;
        }

        return med;
    }
    //En este ejemplo, el método bisect se utiliza para encontrar la raíz cuadrada del número N,
    // que se define como una constante en la clase.
}
