package psip5;

import java.util.ArrayList;

public class Ejercicios {

    double media1, media2, var1, var2;

    ArrayList<Double> lista = new ArrayList<>();

    public void ejercicio1(double lambda) {
        lista.clear();
        double aux = 0, aux2 = 0, U, L, X;
        int n = 1000;

        L = -1 / lambda;
        for (int i = 0; i < n; i++) {
            U = Math.random();
            X = L * Math.log(U);
            aux += X;
            lista.add(X);
        }
        media1 = aux / n;
        for (int i = 0; i < n; i++) {
            aux2 += Math.pow((lista.get(i) - media1), 2.0);
        }
        var1 = aux2 / n;
    }

    public void ejercicio2() {
        lista.clear();
        double aux = 0, aux2 = 0;
        double U1, U2, U3;
        double L1, L2, L3;
        double X1, X2, X3, X = 0;
        int n = 1000;
        double lambda1 = 1;
        double lambda2 = 0.5;
        double lambda3 = 0.33333333;

        L1 = -1 / lambda1;
        L2 = -1 / lambda2;
        L3 = -1 / lambda3;

        for (int i = 0; i < n; i++) {
            U1 = Math.random();
            U2 = Math.random();
            U3 = Math.random();

            X1 = L1 * Math.log(U1);
            X2 = L2 * Math.log(U2);
            X3 = L3 * Math.log(U3);

            X = Math.min(X3, Math.min(X1, X2));
            aux += X;
            lista.add(X);
        }

        media2 = aux / n;

        for (int i = 0; i < n; i++) {
            aux2 += Math.pow((lista.get(i) - media2), 2.0);
        }

        var2 = aux2 / n;
    }

    public double ejercicio3() {
        double tMedio, L1, L2, U1, U2, X1, X2;
        ArrayList<Double> cliente = new ArrayList<>();
        ArrayList<Double> atencion = new ArrayList<>();
        ArrayList<Double> clientei = new ArrayList<>();
        ArrayList<Double> tCola = new ArrayList<>();

        int n = 10000;
        L1 = -1 / 0.5;
        L2 = -1 / 0.75;

        for (int i = 0; i < n; i++) {
            U1 = Math.random();
            X1 = L1 * Math.log(U1);
            cliente.add(X1);
        }

        for (int i = 0; i < n; i++) {
            U2 = Math.random();
            X2 = L2 * Math.log(U2);
            atencion.add(X2);
        }

        clientei.add(cliente.get(0));

        for (int i = 1; i < n; i++) {
            double Ti, sum = 0;
            for (int j = 0; j < i; j++) {
                sum += cliente.get(j);
            }
            Ti = Math.max(sum, clientei.get(i - 1) + cliente.get(i - 1));
            clientei.add(Ti);
        }

        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < i; j++) {
                sum += cliente.get(j);
            }
            tCola.add(clientei.get(i) - sum);
        }

        double tClientes = 0;

        for (int i = 0; i < n; i++) {
            tClientes += tCola.get(i);
        }

        tMedio = tClientes / n;

        return tMedio;
    }

    public double getMedia1() {
        return media1;
    }

    public void setMedia1(double media1) {
        this.media1 = media1;
    }

    public double getMedia2() {
        return media2;
    }

    public void setMedia2(double media2) {
        this.media2 = media2;
    }

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }

    public ArrayList<Double> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Double> lista) {
        this.lista = lista;
    }

}
