package org.example;

import java.util.StringJoiner;

public class FormularioNotas {

    private String nombre;
    private String apellido;
    private int edad;

    private float promedio_edades, promedioNotas;

    private String materia1,materia2,materia3;
    private float nota1,nota2,nota3;

    FormularioNotas(){


    }

    FormularioNotas(String nombre, String apellido, int edad, String materia1, String materia2, String materia3, float nota1,float nota2,float nota3){

        this.nombre=nombre;
        this.apellido= apellido;
        this.edad = edad;
        this.materia1=materia1;
        this.materia2=materia2;
        this.materia3=materia3;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    String getNombre(){

        return nombre;
    }


    String getApellido(){

        return apellido;
    }

    int getEdad(){

        return edad;

    }

    String getMateria1(){

        return materia1;
    }
    String getMateria2(){

        return materia2;
    }
    String getMateria3(){

        return materia3;
    }

    float getNota1(){

        return nota1;
    }

    float getNota2(){

        return nota2;
    }


    float getNota3(){

        return nota3;
    }




    void setNombre(String nombre){

        this.nombre= nombre;
    }

    void setApellido(String apellido1){

        this.apellido= apellido;
    }

    void  setEdad(int edad){

        this.edad = edad;
    }

    void setMateria1(String materia1){
        this.materia1 = materia1;
    }
    void setMateria2(String materia2){
        this.materia2= materia2;
    }
    void setMateria3(String materia3){
        this.materia3 = materia3;
    }

    void setNota1(float nota1){

        this.nota1=nota1;
    }

    void setNota2(float nota2){

        this.nota2=nota2;
    }

    void setNota3(float nota3){

        this.nota3=nota3;
    }

    void imprimirEstudiante(){

        System.out.println("nombre" + nombre);
        System.out.println("apellido" +apellido);
        System.out.println("edad" + edad);
        System.out.println("materias" +materia1+" "+materia2+" "+materia3);
        System.out.println("notas"+nota1+" "+nota2+" "+nota3);

    }


    void promedioEdades(FormularioNotas estudiante1, FormularioNotas estudiante2, FormularioNotas estudiante3){

        promedio_edades =  (estudiante1.getEdad()+estudiante2.getEdad()+estudiante3.getEdad()/3);

        System.out.println("el promedio de edades es " + promedio_edades);


    }

    void promedioNotas(){

        promedioNotas = (nota1 +nota2 +nota3)/3;

                System.out.println("el promedio de notas es "+ promedioNotas+ " del estudiante " +nombre);


    }



}
