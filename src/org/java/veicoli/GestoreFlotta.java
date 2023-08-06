package org.java.veicoli;


import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

    List<Veicolo> veicoliLista;

    public GestoreFlotta() {

        veicoliLista = new ArrayList<>();

    }


    public List<Veicolo> getVeicoliLista() {
        return veicoliLista;
    }


    public void aggiungiVeicolo(Veicolo v) throws RuntimeException

    {
          String targa = v.getNumTarga();

          if(trovaVeicoloTramiteTarga(targa) != null)
          {
              throw new RuntimeException("Veicolo già presente");
          }

            veicoliLista.add(v);

    }


    public int contaVeicoliPerTipo(String tipoVeicolo) throws IllegalArgumentException
    {
        int contatore = 0;

        if(!tipoVeicolo.equalsIgnoreCase("automobile") && !tipoVeicolo.equalsIgnoreCase("motocicletta"))
        {
            throw new IllegalArgumentException("Tipo di veicolo non presente");

        }

        for(Veicolo v : veicoliLista){
        switch (tipoVeicolo)
        {
            case "automobile":
                if(v instanceof Automobile)
                    contatore++;
                break;
            case "motocicletta":
                if(v instanceof Motocicletta)
                    contatore++;
                break;
            default:
                break;
        }
        }

        return contatore++;
    }


   public Veicolo trovaVeicoloTramiteTarga(String numTargaUtente)
   {

       Veicolo veicoloCercato = null;
       boolean trovato = false;
       int contatore = 0;

       while(!trovato && contatore < veicoliLista.size())
       {
           if(numTargaUtente.equals(veicoliLista.get(contatore).getNumTarga()))
           {
               veicoloCercato = veicoliLista.get(contatore);

           }


           contatore++;
       }
       return veicoloCercato;

   }





}

