package modelo;

public class Tienda {
    private String nombreTienda;
    private String direccionTienda;
    //lista de productos
    private Producto[] productos;

    public Tienda(String nombreTienda, String direccionTienda, Producto[] productos) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.productos = productos;
    }

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

    public void mostrarProductos() {
        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }

    public void buscarProducto(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equals(nombreProducto)) {
                producto.mostrarProducto();
            }
        }
    }

    public void agregarProducto(Producto producto) {
        Producto[] productosNuevos = new Producto[productos.length + 1];
        for (int i = 0; i < productos.length; i++) {
            productosNuevos[i] = productos[i];
        }
        productosNuevos[productos.length] = producto;
        productos = productosNuevos;
    }

    public void modificarProducto(String nombreProducto, String descripcionProducto, double precioProducto, int stockProducto, String categoriaProducto) {
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equals(nombreProducto)) {
                producto.setDescripcionProducto(descripcionProducto);
                producto.setPrecioProducto(precioProducto);
                producto.setStockProducto(stockProducto);
                producto.setCategoriaProducto(categoriaProducto);
            }
        }
    }

    public void eliminarProducto(String nombreProducto) {
        Producto[] productosNuevos = new Producto[productos.length - 1];
        int j = 0;
        for (int i = 0; i < productos.length; i++) {
            if (!productos[i].getNombreProducto().equals(nombreProducto)) {
                productosNuevos[j] = productos[i];
                j++;
            }
        }
        productos = productosNuevos;
    }

    public void realizarCompra(String nombreProducto, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equals(nombreProducto)) {
                producto.setStockProducto(producto.getStockProducto() - cantidad);
            }
        }
    }
}
