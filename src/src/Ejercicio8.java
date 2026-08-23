public class Ejercicio8 {

    public static int[] generarTablaMultiplicar(int numero) {

        int[] tabla = new int[10];

        for (int i = 0; i < 10; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    public static void main(String[] args) {

        int numero = 5;

        int[] tabla = generarTablaMultiplicar(numero);

        System.out.println("Tabla del " + numero);

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + tabla[i]);
        }
    }
}