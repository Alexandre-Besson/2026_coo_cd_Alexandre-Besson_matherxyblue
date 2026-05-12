package test;

import XML.ChargeurMagasin;
import donnees.ComparateurAlbum;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriAlbum {


    @Test
    public void test() throws FileNotFoundException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../MagasinCD/musicbrainzSimple/");
        Magasin magasin = chargeurMagasin.chargerMagasin();
        magasin.trier(new ComparateurAlbum());
        assertEquals("Believe",magasin.getCd(0).getNomCD());
        assertEquals("Whitney Houston",magasin.getCd(11).getNomCD());
    }


}
