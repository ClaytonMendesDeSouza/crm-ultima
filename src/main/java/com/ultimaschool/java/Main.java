package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        //Objeto
        Cliente clienteF = new Cliente(" 124.455.100.25 "," claytonmendeshotmail.com ",
                " Ton medeiros or ",  'F');
        System.out.println(clienteF.toString());

        Cliente clienteH = new Cliente(" 124.455.100.25 "," claytonmendeshotmail.com ",
                " Ton medeiros or ",  'M');
        System.out.println(clienteH.toString());
    }
}