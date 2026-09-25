public class CalculatriceAvancee {

    public double puissance(double a, double b) {
        return Math.pow(a, b);
    }

    public double racine(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Nombre negatif");
        }
        return Math.sqrt(a);
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zero");
        }
        return a % b;
    }
}