public class Ejercicio4 {

    public static boolean esPar(int num){

        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){

        int num = 8;

        boolean resultado = esPar(num);

        System.out.println("El resultado es par?" + resultado);
    }
}
