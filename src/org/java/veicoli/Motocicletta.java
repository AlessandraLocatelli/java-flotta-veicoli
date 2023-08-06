package org.java.veicoli;

public class Motocicletta extends Veicolo {

   private boolean conCavalletto;


    public Motocicletta(String numTarga, int annoImmatricolazione, boolean conCavalletto) {
        super(numTarga, annoImmatricolazione);
        this.conCavalletto = conCavalletto;
    }


    public boolean isConCavalletto() {
        return conCavalletto;
    }


    private String isConCavallettoStringa()
    {
        return isConCavalletto()? "con cavalletto" : "senza cavalletto";

    }




    @Override
    public String toString() {

        return super.toString()+" ,cavalletto= "+isConCavallettoStringa();



    }



}

