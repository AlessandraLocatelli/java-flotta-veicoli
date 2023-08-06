package org.java.veicoli;

public class Automobile extends Veicolo {

   private int numeroPorte;

    public Automobile(String numTarga, int annoImmatricolazione, int numeroPorte)
    {
        super(numTarga, annoImmatricolazione);

        if(numeroPorte < 1 || numeroPorte > 6)
        {throw new IllegalArgumentException("Inserisci numero di porte tra 1-6.");}
        this.numeroPorte = numeroPorte;

    }


    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public String toString() {
        return  super.toString()+
                " ,numeroPorte=" + numeroPorte;
    }
}
