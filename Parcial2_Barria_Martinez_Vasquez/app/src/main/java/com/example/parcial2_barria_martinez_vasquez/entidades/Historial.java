package com.example.parcial2_barria_martinez_vasquez.entidades;

public class Historial {

    private int Foto;
    private String Materia;
    private String Semestre;
    private String Nota;
    private int FotoN;

    public Historial (int f, String m, String s, String n, int fn){

        Foto = f;
        Materia = m;
        Semestre = s;
        Nota = n;
        FotoN = fn;


    }

    public int getFoto() {
        return Foto;
    }

    public String getMateria() {
        return Materia;
    }

    public String getSemestre() {
        return Semestre;
    }

    public String getNota() {
        return Nota;
    }

    public int getFotoN() {
        return FotoN;
    }
}


