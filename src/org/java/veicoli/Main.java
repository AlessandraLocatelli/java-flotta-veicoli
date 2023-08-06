package org.java.veicoli;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestoreFlotta gestoreFlotta = new GestoreFlotta();


        boolean running = true;

        while (running)
        {
            System.out.println("Vuoi aggiungere nuovi veicoli? (y/n)");
            String sceltaUtente = sc.nextLine();

            if(sceltaUtente.equalsIgnoreCase("y")) {

                System.out.println("Quale veicolo? 1. automobile, 2. motocicletta");
                String sceltaVeicolo = sc.nextLine();

                String numTargaInput = null;
                int annoImmatricolazioneInput = 0;

                if(sceltaVeicolo.equals("1") || sceltaVeicolo.equals("2")){
                try {
                    System.out.println("Numero targa: ");
                    numTargaInput = sc.nextLine();
                    System.out.println("Anno di immatricolazione: ");
                    annoImmatricolazioneInput = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Formato non valido per l'anno. Inserisci dei numeri!");
                }
                }

                switch (sceltaVeicolo)
                {
                    case "1":
                        int numeroPorteInput = 0;
                        Automobile automobile = null;

                        try{
                            System.out.println("Numero porte: ");
                            numeroPorteInput = Integer.parseInt(sc.nextLine());
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println("Parametri non validi per numero di porte. Inserisci dei numeri.");
                        }
                        catch (IllegalArgumentException e)
                        {
                            System.out.println("Parametri non validi per numero di porte.");
                        }

                        try{
                            automobile = new Automobile(numTargaInput,annoImmatricolazioneInput,numeroPorteInput);
                            gestoreFlotta.aggiungiVeicolo(automobile);

                        }
                        catch (NullPointerException e)
                        {
                            System.out.println(e.getMessage());

                        }
                        catch (IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());

                        }
                        catch (RuntimeException e)
                        {
                            System.out.println("Errore inserimento targa.");
                            System.out.println(e.getMessage());

                        }
                        break;

                    case "2":

                        System.out.println("Ha il cavalletto?(y/n)");
                        String conIlCavallettoStringa = sc.nextLine();
                        boolean conIlCavalletto = conIlCavallettoStringa.equalsIgnoreCase("y");

                        try{
                        Motocicletta motocicletta = new Motocicletta(numTargaInput,annoImmatricolazioneInput,conIlCavalletto);
                        gestoreFlotta.aggiungiVeicolo(motocicletta);
                        }
                        catch (NullPointerException e)
                        {
                            System.out.println("Parametri non validi per targa.");
                            System.out.println(e.getMessage());

                        }
                        catch (IllegalArgumentException e)
                        {
                            System.out.println("Parametri non validi per anno immatricolazione.");
                            System.out.println(e.getMessage());

                        }
                        catch (RuntimeException e)
                        {
                            System.out.println("Errore inserimento targa.");
                            System.out.println(e.getMessage());

                        }
                        break;

                    default:
                        System.out.println("Digita 1 0 2.");
                        break;
                }

            }
            else if(sceltaUtente.equalsIgnoreCase("n"))
            {
                break;

            }
            else
            {

                System.out.println("Scelta non valida.");
            }

        }

        System.out.println("I tuoi veicoli: "+gestoreFlotta.getVeicoliLista());



        System.out.println("---CONTA VEICOLI---");
        System.out.println("Scegli il tipo di veicolo che vuoi contare: ");
        String sceltaVeicolo = sc.nextLine();
        try{
        System.out.println(gestoreFlotta.contaVeicoliPerTipo(sceltaVeicolo));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("---CERCA VEICOLO TRAMITE TARGA---");
        System.out.println("Inserisci la targa: ");
        String sceltaTarga = sc.nextLine();
        System.out.println(gestoreFlotta.trovaVeicoloTramiteTarga(sceltaTarga));



        System.out.println("A PRESTO!");


        sc.close();


    }




}
