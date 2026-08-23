public class Ejercicio7 {

    public static double calcularPromedioClase(double[] calificaciones) {

        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    public static void main(String[] args) {

        double[] calificaciones = {4.0, 3.5, 4.5, 5.0, 4.0};

        double promedio = calcularPromedioClase(calificaciones);

        System.out.println("El promedio de la clase es: " + promedio);
    }
}