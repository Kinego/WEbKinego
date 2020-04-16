package Modelo;
import java.util.Date;
public class trabajador {

    int id_trabajador;
    String nombre;
    String apellidos;
    String Dni;
    Date fecha_nac;
    String direccion;
    String Telefono;
    String cargo;
    Date fecha_inicio;
    String Estado;
    String Estado_civil;

    public trabajador() {
    }

    public trabajador(int id_trabajador, String nombre, String apellidos, String Dni, Date fecha_nac, String direccion, String Telefono, String cargo, Date fecha_inicio, String Estado, String Estado_civil) {
        this.id_trabajador = id_trabajador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Dni = Dni;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.cargo = cargo;
        this.fecha_inicio = fecha_inicio;
        this.Estado = Estado;
        this.Estado_civil = Estado_civil;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }

}
