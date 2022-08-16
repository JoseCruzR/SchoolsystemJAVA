package com.mycompany.claseprincipal;

public class estudiante extends persona {

  protected float calificacion;

    public float getCalificacion() {
        return calificacion;
    }

    public estudiante(float calificacion, int id, String nombre, String apellido, String electronico) {
        super(id, nombre, apellido, electronico);
        this.calificacion = calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "estudiante{"+"id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", electronico=" + electronico + '}';
    }
          
    


    
}

