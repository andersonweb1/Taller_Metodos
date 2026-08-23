public class Ejercicio9 {

    public static String clasificarNota(double nota) {

        if (nota < 3.0) {
            return "Reprobado";
        } else if (nota < 4.5) {
            return "Aprobado";
        } else {
            return "Excelente";
        }
    }

    public static void main(String[] args) {

        double nota = 4.7;

        String resultado = clasificarNota(nota);

        System.out.println("La nota es: " + nota);
        System.out.println("Clasificación: " + resultado);
    }
}