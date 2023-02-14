package ejercico3_files;

import java.io.Serializable;

public class Empleado implements Serializable {
     private String nombre;
    private double salarios;
    private TelefonoMovil telefono;
    public Empleado(String nombre ,double salarios, TelefonoMovil telefono){
        this.nombre=nombre;
        this.salarios=salarios;
        this.telefono=telefono;
    }
    public String toString(){
        return nombre + " " + salarios + " \n" + telefono.toString();
    }
    public void trabajo(){
        setSalarios(this.salarios=getSalarios()+10);
        this.telefono.llamada(15);

    }
    public void trabajo (int g, int m){
        this.telefono.llamada(m);
        this.salarios=this.salarios+g;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSalarios(double salarios) {
        this.salarios = salarios;
    }

    public double getSalarios() {
        return salarios;
    }

    public void setTelefono(TelefonoMovil telefono) {
        this.telefono = telefono;
    }

    public TelefonoMovil getTelefono() {
        return telefono;
    }
}
