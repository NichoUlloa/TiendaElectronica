package principal;
import modelo.Producto;
import modelo.Tienda;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
                new Producto("Camiseta", "Camiseta de algodón", 15.99, 50, "Ropa"),
                new Producto("Pantalón", "Pantalón vaquero", 29.99, 30, "Ropa"),
                new Producto("Zapatillas", "Zapatillas deportivas", 49.99, 20, "Calzado")
        };

        Tienda tienda = new Tienda("Mi Tienda", "Calle Principal 123", productos);

        System.out.println("Todos los productos disponibles:");
        tienda.mostrarProductos();

        System.out.println("\nBuscar producto por nombre 'Pantalón':");
        tienda.buscarProducto("Pantalón");

        System.out.println("\nBuscar producto por categoría 'Ropa':");
        tienda.buscarProducto("Ropa");

        Producto nuevoProducto = new Producto("Gorra", "Gorra de béisbol", 9.99, 100, "Accesorios");
        tienda.agregarProducto(nuevoProducto);
        System.out.println("\nProducto 'Gorra' agregado. Todos los productos:");
        tienda.mostrarProductos();

        System.out.println("\nModificar producto 'Pantalón':");
        tienda.modificarProducto("Pantalón", "Pantalón vaquero azul", 34.99, 25, "Ropa");
        tienda.mostrarProductos();

        System.out.println("\nEliminar producto 'Zapatillas':");
        tienda.eliminarProducto("Zapatillas");
        tienda.mostrarProductos();

        System.out.println("\nRealizar compra de 3 unidades de 'Camiseta':");
        tienda.realizarCompra("Camiseta", 3);
        tienda.mostrarProductos();

        //validar si se desconto el stock de las camisetas, si se compraron 3 unidades, el stock nuevo debe ser 47
        tienda.buscarProducto("Camiseta");
    }
}
