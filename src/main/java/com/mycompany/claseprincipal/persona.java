package com.mycompany.claseprincipal;

public class persona {

    
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String electronico;

    public persona(int id, String nombre, String apellido, String electronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.electronico = electronico;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getElectronico() {
        return electronico;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", electronico=" + electronico + '}';
    }
  
   
}

