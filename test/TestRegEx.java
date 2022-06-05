package pl.lublin.wsei.cwiczenia.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

    public static void main(String[] args) {

        String exItem = "<title><![CDATA[Infografika - wstępne wyniki Narodowego Spisu Powszechnego Ludności i Mieszkań 2021]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Thu, 27 Jan 2022 12:46:00 +0100]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-wstepne-wyniki-narodowego-spisu-powszechnego-ludnosci-i-mieszkan-2021,115,2.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-wstepne-wyniki-narodowego-spisu-powszechnego-ludnosci-i-mieszkan-2021,115,2.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/115/2/1/infografika_wstepne_wyniki_nsp_2021-pl_3.jpg\" type=\"image/jpeg\" width=\"2134\" height=\"4471\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/115/2/1/infografika_wstepne_wyniki_nsp_2021-pl_3,k1uUwl-caFOE6tCTiHtf.jpg\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/115/2/1/infografika_wstepne_wyniki_nsp_2021-pl_3,k1uUwl-caFOE6tCTiHtf.jpg\" alt=\"\" width=\"280\" height=\"212\"/></div>infografika - wstępne wyniki Narodowego Spisu Powszechnego Ludności i Mieszkań 2021]]></description>\n" +
                "\t\t</item>";

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(exItem);
        if(m.find())
            System.out.println("Znaleziono tytul: " + m.group(1));
        else
            System.out.println("Nie znaleziono tylulu ... ");

    }
}
