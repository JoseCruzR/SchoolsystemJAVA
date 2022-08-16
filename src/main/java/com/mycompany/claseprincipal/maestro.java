/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseprincipal;

public class maestro extends persona {

    public maestro(int id, String nombre, String apellido, String electronico) {
        super(id, nombre, apellido, electronico);
    }

    @Override
    public String toString() {
        return "maestro{"+"id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", electronico=" + electronico  + '}';
    }
    
    

}
