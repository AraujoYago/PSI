package psip6;

public class Main {

    public static double[] distribucionTriangular(double o, double m, double p) {
        int i;
        double[] X = new double[1000];

        for (i = 0; i < 1000; i++) {
            while (true) {
                double U = Math.random();
                double V = Math.random();
                X[i] = o + (p - o) * V;
                double function;
                if (X[i] <= o || X[i] >= p) {
                    function = 0;
                } else if (X[i] >= o && X[i] <= m) {
                    function = 2 * (X[i] - o) / ((m - o) * (p - o));
                } else {
                    function = 2 * (p - X[i]) / ((p - m) * (p - o));
                }

                if (2 * U / (p - o) <= function) {
                    break;
                }
            }
        }
        return X;
    }

    public static double[] distribucionNormal(int u, int s) {
        double[] X = new double[1000];
        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < 12; i++) {
                X[j] += Math.random();
            }
            X[j] += -6;
        }
        for (int j = 0; j < 1000; j++) {
            X[j] = X[j] * s + u;
        }
        return X;

    }

    public static void main(String[] args) {
        double[] resTri = distribucionTriangular(2, 4, 18);
        double mediaTri = 0;
        double varianzaTri = 0;

        for (int i = 0; i < 1000; i++) {
            mediaTri += resTri[i];
        }
        mediaTri = mediaTri / 1000;

        for (int i = 0; i < 1000; i++) {
            varianzaTri += Math.pow(resTri[i], 2) - Math.pow(mediaTri, 2);
        }
        varianzaTri = varianzaTri / 1000;

        System.out.println("Media de la dstribución triangular: " + mediaTri);
        System.out.println("Varianza de la distribución triangular: " + varianzaTri);
        System.out.println();

        //Distribucion normal
        double[] resNormal = distribucionNormal(4, 3);
        double mediaNormal = 0, varianzaNormal = 0;

        for (int k = 0; k < 1000; k++) {
            mediaNormal += resNormal[k];
        }
        mediaNormal = mediaNormal / 1000;

        for (int l = 0; l < 1000; l++) {
            varianzaNormal += Math.pow(resNormal[l], 2) - Math.pow(mediaNormal, 2);
        }
        varianzaNormal = varianzaNormal / 1000;

        System.out.println("Media de la distribución normal: " + mediaNormal);
        System.out.println("Varianza de la distribución normal: " + varianzaNormal);

    }
}
