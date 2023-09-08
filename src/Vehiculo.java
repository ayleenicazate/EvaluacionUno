/*
 *
 * @author Ayleen Guajardo Icazate
 * @version 07-09-2023
 */
public class Vehiculo {
    
    String marca;
    String modelo;
    String patente;
    String color;
    int kilometraje;
    int cantidadPuertas;
    int precioServicios;
    Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String patente, String color, int kilometraje, int cantidadPuertas, int precioServicios, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
        this.kilometraje = kilometraje;
        this.cantidadPuertas = cantidadPuertas;
        this.precioServicios = precioServicios;
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getPrecioServicios() {
        return precioServicios;
    }

    public void setPrecioServicios(int precioServicios) {
        this.precioServicios = precioServicios;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
//    public  String mostrarDatosVehiculo (){
//        System.out.println("Datos del vehiculo: ");
//        System.out.println("Marca: " + this.marca);
//        System.out.println("Modelo: " + this.modelo);
//        System.out.println("Patente: " + this.patente);
//        System.out.println("Color: " + this.color);
//        System.out.println("Kilometraje: " + this.kilometraje);
//        System.out.println("Cantidad de puertas: " + this.cantidadPuertas);
//    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", color=" + color + ", kilometraje=" + kilometraje + ", cantidadPuertas=" + cantidadPuertas + ", precioServicios=" + precioServicios + ", cliente=" + cliente + '}';
    }
    
    
    //Calcular descuento
    public int calcularDescuento (int descuento){
        int precioTotal;
        int totalDescuento;
        totalDescuento = precioServicios / descuento * 100;
        precioTotal= totalDescuento + precioServicios;
        
        return precioTotal;
    }
           


}
