
package DTO;

public class Producto {
    public int ID;
    public String Nombre;
    public double PrecioUnitario;
    public int Cantidad;
    public String TipoProducto;
    public String Stock;
  
    public Producto(int ID, String Nombre, double PrecioUnitario, int Cantidad, String TipoProducto, String Stock, Integer setCantidad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.PrecioUnitario = PrecioUnitario;
        this.Cantidad = Cantidad;
        this.TipoProducto = TipoProducto;
        this.Stock = Stock;


    }

    public Producto() {
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }


    }
    


 