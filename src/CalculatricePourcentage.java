public class CalculatricePourcentage {

    public double pourcentage(double valeur, double taux) {
        return valeur * taux / 100;
    }

    public double appliquerRemise(double prix, double taux) {
        return prix - pourcentage(prix, taux);
    }
}