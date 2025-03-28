package Apuesta;

public class Main {

    public static void main(String[] args) {
        Apuesta LaApuesta;
        int mi_dinero;

        LaApuesta = new Apuesta(1000, 4, 2);
        mi_dinero = operativa_Apuesta(LaApuesta, 10000);
        System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
    }
//Comentario para GitHub
    public static int operativa_Apuesta(Apuesta LaApuesta, int dinero) {
        int mi_dinero;
        try {
            System.out.println("Apostando...");
            LaApuesta.apostar(25);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }
        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            LaApuesta.cobrar_apuesta(2, 3);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
        mi_dinero = LaApuesta.getDinero_disp();
        return mi_dinero;
    }
}
