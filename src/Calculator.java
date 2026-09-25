import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double a = sc.nextDouble();

        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        String op = sc.next();

        System.out.print("Entrez le deuxième nombre : ");
        double b = sc.nextDouble();

        double result;

        switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if (b == 0) {
                    System.out.println("Erreur : division par zéro");
                    sc.close();
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Opérateur non supporté : " + op);
                sc.close();
                return;
        }

        System.out.println("Résultat : " + a + " " + op + " " + b + " = " + result);
        sc.close();
    }
}