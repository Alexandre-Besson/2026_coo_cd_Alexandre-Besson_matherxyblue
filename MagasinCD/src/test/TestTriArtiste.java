package test;

import XML.ChargeurMagasin;
import donnees.ComprateurArtiste;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriArtiste {


    @org.junit.Test
    @Test
    public void test() throws FileNotFoundException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../MagasinCD/musicbrainzSimple/");
        Magasin magasin = chargeurMagasin.chargerMagasin();
        magasin.trier(new ComprateurArtiste());
        assertEquals("Bénabar",magasin.getCd(0).getNomArtiste());
        assertEquals("Zebda",magasin.getCd(11).getNomArtiste());
    }


}
