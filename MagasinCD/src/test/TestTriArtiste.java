package test;

import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriArtiste {


    @Test
    public void test() throws FileNotFoundException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../MagasinCD/musicbrainzSimple/");
        Magasin magasin = chargeurMagasin.chargerMagasin();
        magasin.trierArtiste();
        assertEquals("Bénabar",magasin.getCd(0).getNomArtiste());
        assertEquals("Zebda",magasin.getCd(11).getNomArtiste());
    }


}
