
package DTO;

public class Ventas {
    public String Nombre;
    public int Cedula;
    public double Pago;
    public double ValorTotal;
    
    public Ventas(String Nombre, int Cedula, double Pago,double ValorTotal) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Pago = Pago;
        this.ValorTotal = ValorTotal;
    }
    public Ventas() {
    }
    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
        
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double Pago) {
        this.Pago = Pago;
    }
    
}
