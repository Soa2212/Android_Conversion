package com.example.android_conversion.models;

public class Farenheit extends Grados{
    public Farenheit(Double valor) {
        this.setValor(valor);
        this.setUnidad("F");
    }

    public Farenheit parse(Celsius C){
        Double valor = (C.getValor() + 32) ;
        return new Farenheit(valor);
    }
    public Farenheit parse(Kelvin K){
        Double valor = (K.getValor() - 273.15) * 9/5 + 32 ;
        return new Farenheit(valor);
    }
}
