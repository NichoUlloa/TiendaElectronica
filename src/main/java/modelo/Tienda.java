package modelo;

public class Tienda {
    //atributos
    private String nombreTienda;
    private String direccionTienda;
    //lista de productos
    private Producto[] productos;

    //constructor
    public Tienda(String nombreTienda, String direccionTienda, Producto[] productos) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.productos = productos;
    }

    //getters y setters
    public String getNombreTienda() {
        return nombreTienda;
    }
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }
    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public Producto[] getProductos() {
        return productos;
    }
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    //métodos
    //metodo Mostrar todos los productos disponibles, con su información completa.
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }


}
