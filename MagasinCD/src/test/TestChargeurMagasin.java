package test;

import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestChargeurMagasin {


    @Test
    public void test() throws FileNotFoundException {
        ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../MagasinCD/musicbrainzSimple/");
        Magasin magasin = chargeurMagasin.chargerMagasin();
        assertEquals(true,magasin.getNombreCds()>0);
    }

    @Test
    public void test1() {
        boolean bool=false;
        try{
            ChargeurMagasin chargeurMagasin = new ChargeurMagasin("../MagasinCD/musicbrainSimple/");
            Magasin magasin = chargeurMagasin.chargerMagasin();
        }catch(FileNotFoundException e){
            bool=true;
        }
        assertEquals(true,bool);
    }
}
