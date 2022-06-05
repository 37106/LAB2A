package pl.lublin.wsei.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {

    String tytul;
    String adresStrony;
    String adresGrafiki;
    String adresMiniaturki;
    int wysokosc;
    int szerokosc;

    public Infografika(String tekst) {

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");

        Matcher m = pat.matcher(tekst);
        if(m.find())
            tytul = m.group(1);
        else
            tytul = "";

        // Adres strony
        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        if(m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "";

        // Adres grafiki
        pat = Pattern.compile("<media:content url=\"(.*)\" type");
        m = pat.matcher(tekst);
        if(m.find())
            adresGrafiki = m.group(1);
        else
            adresGrafiki = "";

        // Adres miniaturki
        pat = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        m = pat.matcher(tekst);
        if(m.find())
            adresMiniaturki = m.group(1);
        else
            adresMiniaturki = "";

        // Szerokosc
        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher(tekst);
        if(m.find())
            szerokosc = Integer.parseInt(m.group(1));
        else
            szerokosc = 0;

        // Wysokosc
        pat = Pattern.compile("height=\"(.*)\">");
        m = pat.matcher(tekst);
        if(m.find())
            wysokosc = Integer.parseInt(m.group(1));
        else
            wysokosc = 0;

        System.out.println("Tytul: " + tytul);
        System.out.println("Adres strony: " + adresStrony);
        System.out.println("Adres grafiki: " + adresGrafiki);
        System.out.println("Adres miniaturki: " + adresMiniaturki);
        System.out.println("Rozmiary: " + wysokosc + "x" + szerokosc);

    }

    public void print() {

        System.out.println("Tytul: " + tytul);
        System.out.println("Adres strony: " + adresStrony);
        System.out.println("Adres grafiki: " + adresGrafiki);
        System.out.println("Adres miniaturki: " + adresMiniaturki);
        System.out.println("Rozmiary: " + wysokosc + "x" + szerokosc);

    }

}
