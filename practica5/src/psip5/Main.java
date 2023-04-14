package psip5;

public class Main {

    public static void main(String[] args) {
        Ejercicios ej = new Ejercicios();
        ej.ejercicio1(5);
        System.out.println("----- Ejercicio 1 -----");
        System.out.println("Media = " + ej.getMedia1());
        System.out.println("Varianza = " + ej.getVar1());
        System.out.println(" ");
        ej.ejercicio2();
        System.out.println("----- Ejercicio 2 -----");
        System.out.println("Media = " + ej.getMedia2());
        System.out.println("Varianza = " + ej.getVar2());
        System.out.println(" ");
        System.out.println("----- Ejercicio 3 -----");
        System.out.println(" Tiempo medio que pasa haciendo cola un cliente = " + ej.ejercicio3());
    }
}
