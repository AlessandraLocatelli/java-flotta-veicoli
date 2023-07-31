package org.java.veicoli;

public class Motocicletta extends Veicoli {

    //CAMPI
    private boolean ConIlCavalletto;

     //COSTRUTTORE
    public Motocicletta(String targa, int annoImmatricolazione, boolean ConIlCavalletto) {
        super(targa, annoImmatricolazione);
        this.ConIlCavalletto = ConIlCavalletto;
    }

   //METODI


    public boolean isConIlCavalletto() {
        return ConIlCavalletto;
    }

    private String isConIlCavallettoStringa()
    {
        return  isConIlCavalletto()? "con cavalletto" : "senza cavalletto";
    }


    @Override
    public String toString() {
        return "Motocicletta{" +
                " targa=" + getTarga()+
                " anno di immatricolazione=" +getAnnoImmatricolazione()+ " Cavalletto: "+
                isConIlCavallettoStringa()+
                '}';
    }
}
