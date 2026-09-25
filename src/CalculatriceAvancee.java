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
}