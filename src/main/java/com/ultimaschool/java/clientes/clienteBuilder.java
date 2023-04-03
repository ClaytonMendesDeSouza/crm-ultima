package com.ultimaschool.java.clientes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
public class clienteBuilder {

    //atributos

    private String primeiroNome;
    private String nomeDoMeio;
    private String sobrenome;
    private String nomeCompleto;
    private String cpf;
    private String dataDeNacimento;
    private int idadeAtual;
    private char genero;
    private String email;
    private String endereco;
    private String telefone;

    // contrutor


    public clienteBuilder comIdentificacao(String primeiroNome, String nomeDoMeio, String sobrenome, String cpf,
                                           String dataDeNacimento, char genero ){
        this.primeiroNome = primeiroNome;
        this.nomeDoMeio = nomeDoMeio;
        this.sobrenome = sobrenome;
        this.nomeCompleto = primeiroNome + "" + nomeDoMeio + "" + sobrenome;
        this.cpf = cpf;
        this.dataDeNacimento = dataDeNacimento;
        this.idadeAtual = definirIdadeAtual();
        this.genero = genero;

        return this;
    }

    //segundo construtor


    public clienteBuilder comContatos(String email, String endereco, String telefone) {
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        return this;
    }

    // metodo
    private int definirIdadeAtual()
    {
        int anoAtual = recuperarAnoAtual();
        int anoNacimento = recuperarAnoNacimento();
        return anoAtual - anoNacimento ;
    }

    // metodo

    private int recuperarAnoNacimento()
    {
        Calendar calendario = Calendar.getInstance();
        Date dataDeNacimentoCliente;

        try {
            dataDeNacimentoCliente = definirFormatoData("").parse(dataDeNacimento);
        }catch (ParseException e)
        {
            throw new RuntimeException(e);
        }

        calendario.setTime(dataDeNacimentoCliente);
        return calendario.get(Calendar.YEAR);
    }

    //  metodo

    private int recuperarAnoAtual()
    {
        Calendar calendario = Calendar.getInstance();
        Date diaAtual = new Date();
        calendario.setTime(diaAtual);
        return calendario.get(Calendar.YEAR);
    }

    //metodo

    private SimpleDateFormat definirFormatoData(String formatoData)
    {
        if (formatoData == "")
        {
            return new SimpleDateFormat("dd/mm/yyyy");
        }else
        {
            return new SimpleDateFormat(formatoData);
        }
    }

    // Geter == guardar e seters == alterar

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }// ele ñ retorna nada

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNacimento() {
        return dataDeNacimento;
    }

    public void setDataDeNacimento(String dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }

    public int getIdadeAtual() {
        return idadeAtual;
    }

    public void setIdadeAtual(int idadeAtual) {
        this.idadeAtual = idadeAtual;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    // metodo

    private String tratamentoGenero(){

        if (getGenero() == 'F')
        {
            return "Sra. ";
        } else if (getGenero() == 'M')
        {
            return "Sr. ";
        }
        else
        {
            return "";
        }
    }



    public String toString() {
        return tratamentoGenero() + "" +
                "primeiroNome = '"  + primeiroNome + '\'' +
                ", nomeDoMeio = '" + nomeDoMeio + '\'' +
                ", sobrenome = '" + sobrenome + '\'' +
                ", nomeCompleto = '" + nomeCompleto + '\'' +
                ", cpf ='" + cpf + '\'' +
                ", dataDeNacimento = '" + dataDeNacimento + '\'' +
                ", idadeAtual = " + idadeAtual +
                ", genero = " + genero +
                '}';
    }


    public String toStringComIdentificacao() {
        return "Os dados de  identificação são: {" +
                "primeiroNome =  '" + primeiroNome + '\'' +
                ", nomeDoMeio =  '" + nomeDoMeio + '\'' +
                ", sobrenome =  '" + sobrenome + '\'' +
                ", nomeCompleto =  '" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNacimento = '" + dataDeNacimento + '\'' +
                ", idadeAtual = " + idadeAtual +
                ", genero = " + genero +
                '}';
    }

    public String toStringContatos() {
        return "Os dados de contatos são: {" +
                "email = '" + email + '\'' +
                ", endereco = '" + endereco + '\'' +
                ", telefone = '" + telefone + '\'' +
                '}';
    }
}
