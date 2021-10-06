package com.company;

public class Cercle {
    private double rayon = 0;

    public Cercle() {}
    public Cercle(double rayon) {
        this.setRayon(rayon);
    }

    public double calculSurface() {
        return Math.pow(this.getRayon(), 2)*Math.PI;
    }

    public double calculCircumference() {
        return this.getRayon()*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Rayon : "+this.getRayon()+
                ".\nSurface : "+this.calculSurface()+" mètres carrés."+
                "\nPérimètre : "+this.calculCircumference()+" mètres.";
    }

    public double getRayon() {
        return rayon;
    }

    public double setRayon(double rayon) {
        this.rayon = rayon;
        return rayon;
    }
}
