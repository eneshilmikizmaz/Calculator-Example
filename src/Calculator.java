public class Calculator {
    public int plus(int n1, int n2) {
        return n1 + n2;
    }

    public int minus(int n1, int n2) {

        return n1 - n2;
    }

    public double dividedBy(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Sıfır'a bölünemez!");
            return 0;
        }
        double result = (double) n1 / n2;
        return result;
    }

    public int multipliedBy(int n1, int n2) {
        return n1 * n2;
    }

    public int calcExponents(int n1, int n2) {
        int result = 1;
        if (n2 == 0) {
            return 0;
        }
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        return result;
    }

    public int calcCombination(int n1, int n2) {
        System.out.println("C(" + n1 + "," + n2 + ") Hesaplama");
        int result = calcFactoriel(n1) / calcFactoriel(n1 - n2) * calcFactoriel(n2);
        return result;
    }

    public int calcMode(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Sıfıra göre mod alınamaz.");
            return 0;
        }
        return n1 % n2;
    }

    public void rectangleAreaPerimeter(int n1, int n2) {
        System.out.println("Dikdörtgenin alanı : " + n1 * n2);
        System.out.println("Dikdörtgenin çevresi : " + 2 * (n1 + n2));
    }

    private int calcFactoriel(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
