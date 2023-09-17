class Producto{
    protected String Producto;
    
    public Producto(String _producto){
        this.Producto = _producto;
    }

    public String getProducto(){
        return Producto;
    }
}

public class ModConstructor {
    public static void main(String[]args){
        
        Producto producto = new Producto("Computadora Lenovo");

        System.out.println(producto.getProducto());
    }
}
