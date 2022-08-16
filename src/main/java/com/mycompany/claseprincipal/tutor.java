/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseprincipal;

public class tutor extends persona{
    protected String alumnoTutor;

    public String getAlumnoTutor() {
        return alumnoTutor;
    }

    public tutor(String alumnoTutor, int id, String nombre, String apellido, String electronico) {
        super(id, nombre, apellido, electronico);
        this.alumnoTutor = alumnoTutor;
    }

    @Override
    public String toString() {
        return "tutor{" +"id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", electronico=" + electronico + '}';
    }
    
    
    
}
