/*
 *
 * @author Ayleen Guajardo Icazate
 * @version 07-09-2023
 */
public class Cliente {
    String nombre;
    int edad;
    char sexo; //F: femenino o M:masculino
    String estadoCivil;
    boolean clienteNuevo=false;
    int telefono;

    //Constructores
    public Cliente() {
    }

    public Cliente(String nombre, int edad, char sexo, String estadoCivil, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isClienteNuevo() {
        return clienteNuevo;
    }

    public void setClienteNuevo(boolean clienteNuevo) {
        this.clienteNuevo = clienteNuevo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", clienteNuevo=" + clienteNuevo + ", telefono=" + telefono + '}';
    }

    
 
}
