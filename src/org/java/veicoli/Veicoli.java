package org.java.veicoli;

public abstract class Veicoli {

   //ATTRIBUTI
    private String targa;
    private int annoImmatricolazione;


    //COSTRUTTORE
    public Veicoli(String targa, int annoImmatricolazione)
    {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }


    //METODI

    public String getTarga()
    {
        return targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }
}
