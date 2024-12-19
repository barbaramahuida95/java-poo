package com.aluracursos.screenmatch.modelos;
// clase modelo

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getDuracionEnMinutos() {
        return super.getDuracionEnMinutos(); // Accede al getter heredado de Titulo
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }
}
