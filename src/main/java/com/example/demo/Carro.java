package com.example.demo;

public class Carro {
    private String modelo;
    private String marca;
    private double valor;
    private double ano;
    public Carro() {
    }

    public Carro(String modelo, double valor, String marca, double ano) {
        this.modelo = modelo;
        this.valor = valor;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    } 
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }



}
