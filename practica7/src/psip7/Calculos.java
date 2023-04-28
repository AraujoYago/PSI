package psip7;

import java.util.ArrayList;

public class Calculos {

    private ArrayList<Actividad> actividades;

    public void setActivities(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    public void deleteActivities(ArrayList<Actividad> activities) {
        this.actividades = null;
    }

    public double tiempoProyecto(ArrayList<Actividad> actividades) {
        double tiempo = 0;
        for (Actividad a : actividades) {
            double tEarly = early(a);
            if (tEarly + a.getDuracion() >= tiempo) {
                tiempo = tEarly + a.getDuracion();
            }
        }
        return tiempo;
    }

    public double early(Actividad actividad) {
        double maximo = 0;

        if (actividad.getPred() == null) {
            return maximo;
        }
        for (Integer i : actividad.getPred()) {
            double tiempo = early(this.actividades.get(i - 1)) + this.actividades.get(i - 1).getDuracion();
            if (tiempo >= maximo) {
                maximo = tiempo;
            }
        }
        return maximo;
    }

    public double triangular(double o, double m, double p){
        double u, v, x, f;
        do {
            u = Math.random();
            v = Math.random();
            x = o + v * (p - o);
            if (x >= o && x <= m){
                f = (2 * (x - o)) / ((m - o) * (p - o));
            }else{
                if (x >= m && x <= p){
                    f = (2 * (p - x)) / ((p - m) * (p - o));
                }else{
                    f = 0;
                }
            }
        } while ((u * 2 / (p - o)) > f);
        return x;
    }
    public double normal(double mu, double sigma){
        double sum = 0;
        for (int i = 0; i < 12; i++){
            sum += Math.random();
        }
        double z = sum - 6;
        return sigma * z + mu;
    }
    public double exponencial(double lambda){
        double u, x, l = -1 / lambda;
        u = Math.random();
        x = l * Math.log(u);
        return x;
    }
}
