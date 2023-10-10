package org.example;

public class Main {
    public static void main(String[] args) {

        FormularioNotas estudiante1 = new FormularioNotas("JOHANN","CRUZ",39,"matematicas","fisica","ingles",3.4f,4.0f,5.0f);
        FormularioNotas estudiante2 = new FormularioNotas("andrea ","ca",29,"matematicas","fisica","ingles",2.4f,3.0f,5.0f);
        FormularioNotas estudiante3 = new FormularioNotas("juan","h",29,"matematicas","fisica","ingles",5.4f,3.0f,5.0f);
        FormularioNotas estuadiante = new FormularioNotas();

        estudiante1.imprimirEstudiante();
        estudiante2.imprimirEstudiante();
        estudiante3.imprimirEstudiante();

        estudiante1.promedioNotas();
        estudiante2.promedioNotas();
        estudiante3.promedioNotas();

        estuadiante.promedioEdades(estudiante1,estudiante2,estudiante3);











    }
}