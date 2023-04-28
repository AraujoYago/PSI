package psip7;

import java.util.ArrayList;

public class Actividad {

    private int idActividad;
    private double duracion;
    private ArrayList<Integer> pred;
    private ArrayList<Integer> ant;

    public Actividad(int idActividad, double duracion, ArrayList<Integer> pred) {
        this.idActividad = idActividad;
        this.duracion = duracion;
        this.pred = pred;
        this.ant = null;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Integer> getPred() {
        return pred;
    }

    public void setPred(ArrayList<Integer> pred) {
        this.pred = pred;
    }

    public ArrayList<Integer> getAnt() {
        return ant;
    }

    public void setAnt(ArrayList<Integer> ant) {
        this.ant = ant;
    }
}
