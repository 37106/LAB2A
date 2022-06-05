package pl.lublin.wsei.cwiczenia.test;

import pl.lublin.wsei.cwiczenia.GusInfoGraphicList;
import pl.lublin.wsei.cwiczenia.Infografika;

public class TestGusInfoGraphicList {

    public static void main(String[] args) {

        GusInfoGraphicList list = new GusInfoGraphicList("gusInfoGraphic.xml");

        for(Infografika ig : list.infografiki) ig.print();

    }

}
