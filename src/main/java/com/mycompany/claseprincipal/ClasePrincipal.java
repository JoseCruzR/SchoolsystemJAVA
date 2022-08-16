
package com.mycompany.claseprincipal;
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
   
        escuela escuelaFunciones = new escuela("Escuela Rio Grande");
        
        //                                          calif id  nombre    apellido Correo
        escuelaFunciones.agregarAlumno(new estudiante(9, 1, "Jose", "Rodriguez", "jcr@gmail.com"));
        escuelaFunciones.agregarAlumno(new estudiante(8, 2, "Raul", "Ventura", "raul@gmail.com"));
        escuelaFunciones.agregarAlumno(new estudiante(10, 3, "Pedro", "Perez", "pp10@gmail.com"));
        
        
        //---------AGREGANDO MAESTROS--------------
        
        escuelaFunciones.agregarMaestro(new maestro( 1, "Claudia", "Rojano", "clrojano@uveg.edu.mx"));
        escuelaFunciones.agregarMaestro(new maestro( 2, "Carlos", "Perez", "perezc@uveg.edu.mx"));
        
        //--------AGREGANDO TUTORES----------------
        escuelaFunciones.agregarTutor(new tutor( "Jose",1, "Hildeliza", "Rodriguez", "hrodriguez@gmail.com"));
        escuelaFunciones.agregarTutor(new tutor( "Pedro",2, "Paola", "Montes", "montes@gmail.com"));
        
        System.out.println(escuelaFunciones.cantidadAlumnos());

        estudiante estudianteAuxiliar = escuelaFunciones.buscarAlumno(1);
            if (estudianteAuxiliar == null) {
                System.out.println("no se encontro");
            } else {
                System.out.println("Se encontro" + estudianteAuxiliar);
            }

        escuelaFunciones.mostrarAlumnos(); 
        System.out.println("AHORA VIENEN LOS MAESTROS \n\n\n");
        
        escuelaFunciones.mostrarMaestros();
        escuelaFunciones.mostrarTutores();
        
        
        //-----------------MENU---------------------
        
        Scanner leer= new Scanner(System.in);
        
        int auxSwitch;

        
        do {    
            System.out.println("Bienvenido a la escuela Rio Grande");
        System.out.println("Selecciona con que tipo de usuario quieres trabajar");
        System.out.println("1.-Maestros \n"
                         + "2.-Alumnos \n"
                         + "3.-Tutores ");
            auxSwitch=leer.nextInt();
                    switch (auxSwitch) {
                case 1:
                    
//-----------------------------------MENU MAESTROS------------------------
                    System.out.println("ESTAS TRABAJANDO CON MAESTROS");
                    int auxSwitch1;
                    
                    do {              
                        System.out.println("1.-Mostrar Maestros \n"
                                         + "2.-Agregar nuevo Maestro \n"
                                         + "3.-Buscar maestro \n"
                                         + "5.-Para salir");
                        
                        auxSwitch1=leer.nextInt();
                        
                        switch (auxSwitch1) {
                                case 1:
//-----------------------------------MOSTRAR MAESTROS------------------------
                                escuelaFunciones.mostrarMaestros();
                                break;
                                
                                case 2:
//-----------------------------------AGREGAR MAESTRO------------------------
                                    int newId;
                                    String newNombre,newApellido,newCorreo;
                                    newId=escuelaFunciones.tamListaMaestros()+1;
                                    
                                    System.out.println("Escribe la siguiente información para agregar al nuevo maestro");
                                    
                                    System.out.println("nombre");
                                    newNombre=leer.nextLine();
                                    newNombre=leer.nextLine();
                                    System.out.println("apellido");
                                    newApellido=leer.nextLine();
                                    System.out.println("correo");
                                    
                                    newCorreo=leer.nextLine();
                                    
                                    escuelaFunciones.agregarMaestro(new maestro( newId,newNombre, newApellido, newApellido));
                                    maestro maestroAuxiliar2 = escuelaFunciones.buscarMaestros(newId);
                                    
                                    
                                    if (maestroAuxiliar2 == null) {
                                        System.out.println("Algo salio mal :(");
                                    } else {
                                        System.out.println("El nuevo maestro" + maestroAuxiliar2+" Ha sido agregado");
                                    }                        
                                break;
                                
                                case 3:
//-----------------------------------BUSCAR MAESTROS------------------------
                                     int idAuxBusq;
                                    
                                    System.out.println("BUSCAR MAESTRO");
                                    System.out.println("Dame el ID del Maestro");
                                    idAuxBusq=leer.nextInt();
                                    
                                    maestro maestroAuxiliar3 = escuelaFunciones.buscarMaestros(idAuxBusq);
                                    
                                    
                                    if (maestroAuxiliar3 == null) {
                                        System.out.println("Maestro no encontrado");
                                    } else {
                                        System.out.println("Maestro encontrado! : " + maestroAuxiliar3);
                                    }
                                break;
                                
                              
                            }
                        } while (auxSwitch1<4);
                            break;
                
                
                case 2:
//-----------------------------------MENU ALUMNOS------------------------
                    System.out.println("Estas trabajando con Alumnos");
                    int auxSwitch2;
                    
                    do {              
                        System.out.println("1.-Mostrar Alumnos \n"
                                         + "2.-Modificar Calificacion \n"
                                         + "3.-Agregar Alumno \n"
                                         + "4.-Buscar Alumno \n"
                                         + "5.-salir" );
                        
                        auxSwitch2=leer.nextInt();
                        
                        switch (auxSwitch2) {
                                case 1:
//-----------------------------------MOSTRAR ALUMNOS------------------------
                                escuelaFunciones.mostrarAlumnos();
                                break;
                                
                                case 2:
//-----------------------------------MODIFICAR CALIFICACIÓN------------------------
                                    int idMod;
                                    float nuevaCal1;
                                    System.out.println("MODIFICAR CALIFICACIÓN");
                                    System.out.println("Cual es el id del alumno a modificar");
                                    idMod=leer.nextInt();
                                    System.out.println("Dame la nueva calificación");
                                    nuevaCal1=leer.nextFloat();
                                    estudiante estudianteAuxiliar1 = escuelaFunciones.buscarAlumno(idMod);
                                    
                                    if (estudianteAuxiliar == null) {
                                        System.out.println("no se encontro");
                                    } else {
                                        System.out.println("Se encontro" + estudianteAuxiliar1);
                                        estudianteAuxiliar1.setCalificacion(nuevaCal1);
                                        System.out.println("Nueva calificación" + estudianteAuxiliar1+"nueva CAl"+estudianteAuxiliar1.getCalificacion());
                                    }
                                break;
                                
                                case 3:
//-----------------------------------AGREGAR ALUMNO------------------------
                                    float newCal;
                                    int newId;
                                    String newNombre,newApellido,newCorreo;
                                    newId=escuelaFunciones.tamListaAlumnos()+1;
                                    
                                    System.out.println("Escribe la siguiente información para agregar al nuevo alumno");
                                    System.out.println("Calificación ");
                                    newCal=leer.nextFloat();
                                    System.out.println("nombre");
                                    newNombre=leer.nextLine();
                                    newNombre=leer.nextLine();
                                    System.out.println("apellido");
                                    newApellido=leer.nextLine();
                                    System.out.println("correo");
                                    
                                    newCorreo=leer.nextLine();
                                    
                                    escuelaFunciones.agregarAlumno(new estudiante(newCal, newId,newNombre, newApellido, newApellido));
                                    estudiante estudianteAuxiliar2 = escuelaFunciones.buscarAlumno(newId);
                                    
                                    
                                    if (estudianteAuxiliar2 == null) {
                                        System.out.println("Algo salio mal :(");
                                    } else {
                                        System.out.println("El nuevo estudiante" + estudianteAuxiliar2+" Ha sido agregado");

                                    }
        
                                break;
                                
                                case 4:
//-----------------------------------BUSCAR ALUMNO------------------------
                                    int idAuxBusq;
                                    
                                    System.out.println("BUSCAR ALUMNO");
                                    System.out.println("Dame el ID del alumno");
                                    idAuxBusq=leer.nextInt();
                                    
                                    estudiante estudianteAuxiliar3 = escuelaFunciones.buscarAlumno(idAuxBusq);
                                    
                                    
                                    if (estudianteAuxiliar3 == null) {
                                        System.out.println("Estudiante no encontrado");
                                    } else {
                                        System.out.println("Estudiante encontrado! : " + estudianteAuxiliar3);

                                    }
                                break;
                                
                            }
                        }  while (auxSwitch2<4);
                            break;
                                
                
                case 3:
//-----------------------------------MENU TUTORES----------------------------
                    System.out.println("EStas trabajando con Tutores");
                     int auxSwitch3;
                    
                    do {              
                        System.out.println("1.-Mostrar Tutores \n"
                                         + "2.-Agregar nuevo Tuto \n"
                                         + "3.-Buscar Tutor \n"
                                         + "5.-Para salir");
                        
                        auxSwitch3=leer.nextInt();
                        
                        switch (auxSwitch3) {
                                case 1:
//-----------------------------------MOSTRAR TUTORES------------------------
                                escuelaFunciones.mostrarTutores();
                                break;
                                
                                case 2:
//-----------------------------------AGREGAR TUTOR------------------------
                                    int newId;
                                    String newNombre,newApellido,newCorreo,newTutorado;
                                    newId=escuelaFunciones.tamListaTutores()+1;
                                    
                                    System.out.println("Escribe la siguiente información para agregar al nuevo Tutor");
                                    
                                    System.out.println("nombre");
                                    newNombre=leer.nextLine();
                                    newNombre=leer.nextLine();
                                    System.out.println("apellido");
                                    newApellido=leer.nextLine();
                                    System.out.println("correo");
                                    newCorreo=leer.nextLine();
                                    System.out.println("Asigna el nombre del alumno a este tutor");
                                    newTutorado=leer.nextLine();
                                    
                                    escuelaFunciones.agregarTutor(new tutor( newTutorado,newId,newNombre, newApellido, newCorreo));
                                    tutor tutorAuxiliar2 = escuelaFunciones.buscarTutor(newId);
                                    
                                    
                                    if (tutorAuxiliar2 == null) {
                                        System.out.println("Algo salio mal :(");
                                        } 
                                    else{
                                        System.out.println("El nuevo tutor" + tutorAuxiliar2+" Ha sido agregado");
                                        }                        
                                break;
                                
                                case 3:
//-----------------------------------BUSCAR TUTOR------------------------
                                     int idAuxBusq;
                                    
                                    System.out.println("BUSCAR Tutor");
                                    System.out.println("Dame el ID del Maestro");
                                    idAuxBusq=leer.nextInt();
                                    
                                    tutor tutorAuxiliar3 = escuelaFunciones.buscarTutor(idAuxBusq);
                                    
                                    
                                    if (tutorAuxiliar3 == null) {
                                        System.out.println("Maestro no encontrado");
                                    } else {
                                        System.out.println("Maestro encontrado! : " + tutorAuxiliar3);
                                    }
                                break;
                                
                              
                            }
                        } while (auxSwitch3<4);
                   
                break;
                
            
        }
            
        } while (auxSwitch<4);
        
        
        
        
        
        
    }
}
