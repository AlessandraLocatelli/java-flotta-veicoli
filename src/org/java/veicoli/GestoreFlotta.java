package org.java.veicoli;

import java.util.ArrayList;

public class GestoreFlotta {

    private ArrayList<Veicoli> veicolo = new ArrayList<>();
    private int contatoreAutomobile;
    private int contatoreMotocicletta;


    //METODI


    public ArrayList<Veicoli> getVeicolo() {
        return veicolo;
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

        for (Veicoli veicolo : veicolo )
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

        for (Veicoli veicolo : veicolo )
        {
            if(veicolo.getTarga().equals(numeroTarga))
                trovato = true;
                break;

        }

        if(trovato)
            System.out.println("Veicolo trovato: "+veicolo);
        else if(!trovato)
            System.out.println("Veicolo non trovato.");


        return  trovato;


    }

}
