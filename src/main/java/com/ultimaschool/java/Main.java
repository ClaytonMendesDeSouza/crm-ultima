package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        //Objeto
        Cliente clienteM = new Cliente("Ton","Mendes","Or","333.222.333.22",
                "22/02/1998",'M', "claytonmendeshotmail.com","Av.Jequitiba",
                "3333 - 2222");
        System.out.println(clienteM.toString());

        Cliente clienteF = new Cliente("Arminia","Mary","Ar","222.333.444.55",
                "22/02/1989",'F', "Eclipsehotmail.com","Av.Orvalho",
                "4444 - 5555");
        System.out.println(clienteF.toString());


    }
}