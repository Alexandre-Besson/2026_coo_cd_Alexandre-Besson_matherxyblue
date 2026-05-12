package donnees;

public class ComprateurArtiste implements ComparateurCd {


    public boolean etreAvant(CD CD1,CD CD2) {
        if (CD1.getNomArtiste().compareTo(CD2.getNomArtiste()) < 0) {
            return true;

        }
        else{
            return false;
        }
    }
}
