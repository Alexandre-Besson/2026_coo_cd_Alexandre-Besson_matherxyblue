package donnees;

public class ComparateurPiste implements ComparateurCd {

    public boolean etreAvant(CD CD1,CD CD2) {
        if (CD1.getNbPistes()<(CD2.getNbPistes())){
            return true;

        }   else{
            return false;
        }
    }
}
