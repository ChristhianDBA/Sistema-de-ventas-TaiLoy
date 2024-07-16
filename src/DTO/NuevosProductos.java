
package DTO;

public class NuevosProductos {
    public int ID;
    public String NombreProducto;
    public double PrecioUnit;
    public String TipoProducto;
    public String Proveedor;
    public String Stock;

    public NuevosProductos(int ID, String Nombre, double PrecioUnit, String TipoProducto, String Proveedor, String Stock) {
        this.ID = ID;
        this.NombreProducto = Nombre;
        this.PrecioUnit = PrecioUnit;
        this.TipoProducto = TipoProducto;
        this.Proveedor = Proveedor;
        this.Stock = Stock;
    }
    public NuevosProductos() {
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreProdcuto() {
        return NombreProducto;
    }

    public void setNombreProducto(String Nombre) {
        this.NombreProducto = Nombre;
    }

    public double getPrecioUnit() {
        return PrecioUnit;
    }

    public void setPrecioUnit(double PrecioUnit) {
        this.PrecioUnit = PrecioUnit;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }
    
}
