/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.factura;

/**
 *
 * @author Yeyson
 */
public class Pedido  {
    String Articulo,cantidad,precio,Cliente,Pago;
    int  aux,total,ISV;

    public Pedido(String Articulo, String cantidad, String precio, String Cliente, String Pago) {
        this.Articulo = Articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.Cliente = Cliente;
        this.Pago = Pago;
    }
          
  
    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
