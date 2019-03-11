/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatep;

import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Parser {
    

    private Vector<InfoRegione> regioni;

    public Parser() {
        regioni = new Vector();
    }

    public Vector<InfoRegione> parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;

        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();

        // generazione della lista degli elementi "libro"
        nodelist = root.getElementsByTagName("row");
        if (nodelist != null && nodelist.getLength() > 0) {
                      
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);

                InfoRegione InfoRegione = EsaminaElemento(element);
                if (InfoRegione != null) {
                    regioni.add(InfoRegione);
                }
            }
        }
        return regioni;
    }

    private InfoRegione EsaminaElemento(Element element) {
        Element elementTD;
        InfoRegione InfoRegione = new InfoRegione();

        NodeList nodelist = element.getElementsByTagName("row");     
        String anno =getTextValue(element, "anno");
        String codice =getTextValue(element, "codice");
        String regioni =getTextValue(element, "regioni");
        String olive_superficie__ha_ =getTextValue(element, "olive_superficie__ha_");
        String olive_superficie_in_produzione__ha_ =getTextValue(element, "olive_superficie_in_produzione__ha_");
        String olive_produzione__quintali_ =getTextValue(element, "olive_produzione__quintali_");
        String olive_da_tavola_produzione_raccolta__quintali_ =getTextValue(element, "olive_da_tavola_produzione_raccolta__quintali_");
        String olive_da_tavola_produzione__quintali_ =getTextValue(element, "olive_da_tavola_produzione__quintali_");
        String olive_da_olio_produzione__quintali_ =getTextValue(element, "olive_da_olio_produzione__quintali_");
        String olio_di_pressione_resa_di_produzione__quintali_ =getTextValue(element, "olio_di_pressione_resa_di_produzione__quintali_");
        String olio_di_pressione_produzione__quintali_ =getTextValue(element, "olio_di_pressione_produzione__quintali_");
        InfoRegione = new InfoRegione( anno, codice, regioni, olive_superficie__ha_, olive_superficie_in_produzione__ha_,
            olive_produzione__quintali_, olive_da_tavola_produzione_raccolta__quintali_, olive_da_tavola_produzione__quintali_, olive_da_olio_produzione__quintali_, olio_di_pressione_resa_di_produzione__quintali_, olio_di_pressione_produzione__quintali_);
        return InfoRegione;
    }

    // restituisce il valore testuale dell’elemento figlio specificato
    private String getTextValue(Element element, String tag) {
        String value = null;
        NodeList nodelist;
        nodelist = element.getElementsByTagName(tag);
        if (nodelist != null && nodelist.getLength() > 0) {
            value = nodelist.item(0).getFirstChild().getNodeValue();
        }
        return value;
    }

    // restituisce il valore intero dell’elemento figlio specificato
    private int getIntValue(Element element, String tag) {
        return Integer.parseInt(getTextValue(element, tag));
    }

    // restituisce il valore numerico dell’elemento figlio specificato
    private float getFloatValue(Element element, String tag) {
        return Float.parseFloat(getTextValue(element, tag));
    }

}
