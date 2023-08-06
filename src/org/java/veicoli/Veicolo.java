package org.java.veicoli;


import java.time.LocalDate;

public abstract class Veicolo {

private String numTarga;
private int annoImmatricolazione;


    public Veicolo(String numTarga, int annoImmatricolazione)
    throws NullPointerException, IllegalArgumentException
    {

        if(numTarga == null || numTarga.isBlank())
        {throw new NullPointerException("Inserisci la targa.");}
        if(annoImmatricolazione < 1897 || annoImmatricolazione > LocalDate.now().getYear())
        {throw new IllegalArgumentException("Inserisci una data tra il 1897 e oggi.");}

        this.numTarga = numTarga;
        this.annoImmatricolazione = annoImmatricolazione;

    }


    public String getNumTarga()
    {
        return numTarga;
    }

    public int getAnnoImmatricolazione()
    {
        return annoImmatricolazione;
    }


    public String toString()
    {
        return " numero di targa= "+numTarga+
                " ,anno di immatricolazione= "+annoImmatricolazione;

    }



}
