package org.java.veicoli;

public class Automobile extends Veicoli {

    //CAMPI
    private int porte;

    //COSTRUTTORE
    public Automobile(String targa, int annoImmatricolazione, int porte) {
        super(targa, annoImmatricolazione);
        this.porte = porte;
    }


    //METODI


    public int getPorte() {
        return porte;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                " targa=" + getTarga()+
                " anno di immatricolazione=" +getAnnoImmatricolazione()+
                " porte=" + porte +
                '}';
    }
}
