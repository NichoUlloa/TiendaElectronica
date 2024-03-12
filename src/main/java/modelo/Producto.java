package modelo;

public class Producto {
    //atributos
    private String nombreProducto;
    private String descripcionProducto;
    private double precioProducto;
    private int stockProducto;
    private String categoriaProducto;

    //constructor
    public Producto(String nombreProducto, String descripcionProducto, double precioProducto, int stockProducto, String categoriaProducto) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.categoriaProducto = categoriaProducto;
    }

    //getters y setters
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }
    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }
    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }



    //metodo Mostrar información completa del producto.
    public void mostrarProducto() {
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Descripción: " + descripcionProducto);
        System.out.println("Precio: " + precioProducto);
        System.out.println("Stock: " + stockProducto);
        System.out.println("Categoría: " + categoriaProducto);
    }

}
