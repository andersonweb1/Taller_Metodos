public class Ejercicio5 {

    public static double calcularPromedio(double n1, double n2){
        return (n1 + n2) / 2;
    }

    public static double calcularPromedio(double[] notas){
        double suma = 0;

        for (int i = 0; i < notas.length; i++){
            suma = suma + notas[i];
        }

        return suma / notas.length;
    }

    public static void main(String[] args){

        double promedio = calcularPromedio(4.0 , 5.0);

        double[] notas = {3.5, 4.0, 4.5, 5.0};
        double promedio2 = calcularPromedio(notas);

        System.out.println("Promedio de dos notas: " + promedio);
        System.out.println("Promedio del arreglo: " + promedio2);
    }
}