import java.util.ArrayList;

public class Ejercicio10 {

    public static void agregarProducto(ArrayList<Producto> productos, String nombre, double precio, int cantidad) {

        Producto producto = new Producto(nombre, precio, cantidad);

        productos.add(producto);
    }

    public static double calcularValorTotalInventario(ArrayList<Producto> productos) {

        double total = 0;

        for (int i = 0; i < productos.size(); i++) {

            total = total + (productos.get(i).precio * productos.get(i).cantidad);
        }

        return total;
    }

    public static void mostrarInventario(ArrayList<Producto> productos) {

        System.out.println("----- INVENTARIO -----");

        for (int i = 0; i < productos.size(); i++) {

            Producto producto = productos.get(i);

            System.out.println("Producto: " + producto.nombre);
            System.out.println("Precio: $" + producto.precio);
            System.out.println("Cantidad: " + producto.cantidad);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        agregarProducto(productos, "Teclado", 50000, 2);
        agregarProducto(productos, "Mouse", 30000, 3);
        agregarProducto(productos, "Monitor", 500000, 1);

        mostrarInventario(productos);

        double total = calcularValorTotalInventario(productos);

        System.out.println("Valor total del inventario: $" + total);
    }
}

class Producto {

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}