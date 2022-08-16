package com.mycompany.claseprincipal;
import java.util.ArrayList;


public class escuela {

    private String nombre;
    
    
    private ArrayList<estudiante> alumnos;
    private ArrayList<maestro> maestros;
    private ArrayList<tutor> tutores;
    
    
    public escuela(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.maestros = new ArrayList<>();
        this.tutores = new ArrayList<>();
    }
    
//-------------------ALUMNOS------------------
    
    //Inicializando arraylist para todos
    
    

    public void agregarAlumno(estudiante a) {
        this.alumnos.add(a);
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }

    public estudiante buscarAlumno(int codigo) {
        estudiante estudianteEncontrado = null;

        for (estudiante elemento : alumnos) {
            if (elemento.getId() == codigo) {
                estudianteEncontrado = elemento;
            }
        }
        return estudianteEncontrado;
    }

    public void mostrarAlumnos() {
        for (estudiante element : alumnos) {
            System.out.println(element);
        }
    }
    public int tamListaAlumnos(){
        int tam;
        return tam=alumnos.size();
    }
    
    public int tamListaMaestros(){
        int tam;
        return tam=maestros.size();
    }
    
    public int tamListaTutores(){
        int tam;
        return tam=tutores.size();
    }
    
    
    // --------------------MAESTROS------------------
    

    public void agregarMaestro(maestro a) {
        this.maestros.add(a);
    }

    public int cantidadMaestros() {
        return maestros.size();
    }

    public maestro buscarMaestros(int codigo) {
        maestro maestroEncontrado = null;

        for (maestro elemento : maestros) {
            if (elemento.getId() == codigo) {
                maestroEncontrado = elemento;
            }
        }
        return maestroEncontrado;
    }

    public void mostrarMaestros() {
        for (maestro element : maestros) {
            System.out.println(element);
        }
    }
    
    //------------------TUTORES-----------------
    
     public void agregarTutor(tutor a) {
        this.tutores.add(a);
    }

    public int cantidadTutor() {
        return tutores.size();
    }

    public tutor buscarTutor(int codigo) {
        tutor tutorEncontrado = null;

        for (tutor elemento : tutores) {
            if (elemento.getId() == codigo) {
                tutorEncontrado = elemento;
            }
        }
        return tutorEncontrado;
    }

    public void mostrarTutores() {
        for (tutor element : tutores) {
            System.out.println(element);
        }
    }
}
