/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatep;

/**
 *
 * @author Crippa_Andrea
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class VerificaTep {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
        Vector<InfoRegione> regioni = null;
        InfoRegione InfoRegione = new InfoRegione();
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        String fileXML = "xml\\100644_Olivoolive-da-tavolaolive-da-olioolio-di-pr.xml";
        Parser dom = new Parser();
        try {
            regioni = dom.parseDocument(fileXML);
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        System.out.println("Inserire il criterio con cui si vuole svolgere la ricerca (1-2-3-4) :");
        String scelta = input.readLine();
        if(scelta.equals("1")){
            System.out.println("Inserire l'anno della ricerca : ");
            String anno = input.readLine();
            anno='"'+anno+'"';
            System.out.println("Inserire la regione della ricerca : ");
            String regione = input.readLine();
            regione='"'+regione+'"';
            for (int i = 0; i < regioni.size(); i++) {
                InfoRegione = regioni.elementAt(i);
                if(anno.equals(InfoRegione.getanno()) && regione.equals(InfoRegione.getregioni()))
                    System.out.println(InfoRegione.toString());
                else ;
            }
        }
        else if(scelta.equals("2")){
            System.out.println("Inserire l'anno che si vuole visualizzare : ");
            String anno = input.readLine();
            anno='"'+anno+'"';
            int tot = 0;
            for (int i = 0; i < regioni.size(); i++) {
                InfoRegione = regioni.elementAt(i);
                if(anno.equals(InfoRegione.getanno()))
                    tot = tot + Integer.parseInt(InfoRegione.getolio_di_pressione_produzione__quintali_());
                else ;
            }
            System.out.println("L'olio di pressione prodotto in quest'anno in tutta italia è : " + tot + "quintali");
        }
        else if(scelta.equals("3")){
            int max = 0;
            String regione = "";
            String NONVABENE = '"'+"Italia"+'"';
            for (int i = 0; i < regioni.size(); i++) {
                InfoRegione = regioni.elementAt(i);
                if (InfoRegione.getregioni().equals(NONVABENE)) ;
                else {
                    if (max<Integer.parseInt(InfoRegione.getolive_da_tavola_produzione_raccolta__quintali_())) {
                        max= Integer.parseInt(InfoRegione.getolive_da_tavola_produzione_raccolta__quintali_());
                        regione=InfoRegione.getregioni();
                    }
                    else ;
                }
            }
            System.out.println("La regione che ha prodotto più olio da tavola in tutta italia è : " + regione + " che ha prodotto " +max+ " quintali di olio");
        }
        else if(scelta.equals("4")){
            int max = 0;
            String regione = "";
            String NONVABENE = '"'+"Italia"+'"';
            for (int i = 0; i < regioni.size(); i++) {
                InfoRegione = regioni.elementAt(i);
                if (InfoRegione.getregioni().equals(NONVABENE)) ;
                else {
                    if (max<Integer.parseInt(InfoRegione.getolive_superficie_in_produzione__ha_ ())) {
                        max= Integer.parseInt(InfoRegione.getolive_superficie_in_produzione__ha_ ());
                        regione=InfoRegione.getregioni();
                    }
                    else ;
                }
            }
            System.out.println("La regione che ha più olive superficie in produzione in tutta italia è : " + regione + " che ne ha " +max);
        }
    }
   
}