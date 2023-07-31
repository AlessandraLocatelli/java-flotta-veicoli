package org.java.veicoli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       GestoreFlotta gestoreFlotta = new GestoreFlotta();
       boolean esci = false;

       while (!esci) {
           System.out.println("Vuoi aggiungere un nuovo veicolo alla tua flotta? (s/n)");
           String sceltaUtente = sc.nextLine();

           switch (sceltaUtente)
           {
               case "s":
                   System.out.println("Quale veicolo vuoi aggiungere? 1.automobile 2.motocicletta");
                   String sceltaVeicolo = sc.nextLine();

                   System.out.println("Inserisci targa: ");
                   String targaInput = sc.nextLine();
                   System.out.println("Inserisci anno di immatricolazione: ");
                   int annoImmatricolazioneInput = Integer.parseInt(sc.nextLine());


                   if(sceltaVeicolo.equals("1"))
                   {
                       System.out.println("Inserisci numero porte: ");
                       int numeroPorteInput = Integer.parseInt(sc.nextLine());
                       Automobile automobile = new Automobile(targaInput,annoImmatricolazioneInput,numeroPorteInput);
                       try {
                           gestoreFlotta.aggiungiVeicolo(automobile);
                       }
                       catch(Exception e)
                       {
                           System.out.println(e.getMessage());


                       }
                   }
                   else if (sceltaVeicolo.equals("2"))
                   {
                       System.out.println("Ha il cavalletto? (s/n)");
                       String haIlCavallettoStringa = sc.nextLine();
                       boolean haIlCavallettoInput = haIlCavallettoStringa.equalsIgnoreCase("s");
                       Motocicletta motocicletta = new Motocicletta(targaInput,annoImmatricolazioneInput,haIlCavallettoInput);
                       try {
                           gestoreFlotta.aggiungiVeicolo(motocicletta);
                       }
                       catch(Exception e)
                       {
                           System.out.println(e.getMessage());

                       }

                   }
                   else
                   {
                       System.out.println("Scelta non valida.");
                   }
                   break;

               case "n":
                   esci = true;
                   break;

               default:
                   System.out.println("Scelta non valida.");
                   break;

           }
       }


       System.out.println("Stampo la tua flotta");
       gestoreFlotta.contaQuantiVeicoliStessaTipologia();
        System.out.println("Numero automobili: "+gestoreFlotta.getContatoreAutomobile());
        System.out.println("Numero motociclette: "+gestoreFlotta.getContatoreMotocicletta());

        System.out.println("Cerchi un veicolo? Inserisci il numero della sua targa:");
        String numeroTargaInput = sc.nextLine();
        gestoreFlotta.trovaVeicoloTramiteNumeroTarga(numeroTargaInput);


       sc.close();
    }

}
