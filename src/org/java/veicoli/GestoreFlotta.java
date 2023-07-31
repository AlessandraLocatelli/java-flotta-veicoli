package org.java.veicoli;

import java.util.ArrayList;

public class GestoreFlotta {

    private ArrayList<Veicoli> veicoli = new ArrayList<>();
    private int contatoreAutomobile;
    private int contatoreMotocicletta;


    //METODI


    public ArrayList<Veicoli> getVeicolo() {
        return veicoli;
    }

    public int getContatoreAutomobile() {
        return contatoreAutomobile;
    }

    public int getContatoreMotocicletta() {
        return contatoreMotocicletta;
    }

    public void contaQuantiVeicoliStessaTipologia()
    {

        contatoreAutomobile = 0;
        contatoreMotocicletta = 0;

        for (Veicoli veicolo : veicoli)
        {
            System.out.println(veicolo);
            if(veicolo instanceof Automobile)
                contatoreAutomobile ++;
            if(veicolo instanceof Motocicletta)
                contatoreMotocicletta++;

        }


    }

    public boolean trovaVeicoloTramiteNumeroTarga(String numeroTarga)
    {

        boolean trovato = false;

        for (Veicoli veicolo : veicoli)
        {
            if(veicolo.getTarga().equals(numeroTarga))
                System.out.println(veicolo);
                trovato = true;
                break;

        }

        if(trovato)
            System.out.println("Veicolo trovato!");
        else if(!trovato)
            System.out.println("Veicolo non trovato.");


        return  trovato;


    }

    //BONUS
    public void controlloNumeriDiTarga() throws Exception
    {

       for (int i = 1; i < veicoli.size(); i++)
       {
           if(veicoli.get(i).getTarga().equals(veicoli.get(i-1).getTarga())){
               veicoli.remove(veicoli.get(i));
           throw new Exception("I veicoli non possono avere lo stesso numero di targa!" +
                   " Rimuovo il veicolo dalla lista.");
           }
       }

    }




   }
