package psip7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Calculos calculos = new Calculos();
        int numSimulaciones = 10000;

        double duracion = 0;
        for (int i = 0; i < numSimulaciones; i++){
            ArrayList<Actividad> actividades = new ArrayList<>();

            // EJEMPLO 1
            actividades.add(new Actividad(1, calculos.triangular(8, 10, 12), new ArrayList<>()));
            actividades.add(new Actividad(2, calculos.triangular(22, 23, 26), new ArrayList<>() {
                {
                    add(1);
                }
            }));
            actividades.add(new Actividad(3, calculos.triangular(9, 12, 14), new ArrayList<>() {
                {
                    add(1);
                }
            }));
            actividades.add(new Actividad(4, calculos.triangular(5, 10, 12), new ArrayList<>() {
                {
                    add(2);
                }
            }));
            actividades.add(new Actividad(5, calculos.triangular(2, 3, 4), new ArrayList<>() {
                {
                    add(3);
                    add(4);
                }
            }));
            actividades.add(new Actividad(6, calculos.triangular(9, 11, 15), new ArrayList<>() {
                {
                    add(2);
                }
            }));
            actividades.add(new Actividad(7, calculos.triangular(3, 5, 7), new ArrayList<>() {
                {
                    add(2);
                }
            }));
            actividades.add(new Actividad(8, calculos.triangular(3, 4, 7), new ArrayList<>() {
                {
                    add(7);
                }
            }));
            actividades.add(new Actividad(9, calculos.triangular(8, 10, 16), new ArrayList<>() {
                {
                    add(5);
                    add(6);
                }
            }));

            calculos.setActivities(actividades);
            duracion = duracion + calculos.tiempoProyecto(actividades);

        }
        duracion = duracion / numSimulaciones;
        System.out.println("\nDuracion media del proyecto: " + duracion + "\n");
    }
}
