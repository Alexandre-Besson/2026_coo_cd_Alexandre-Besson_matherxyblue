package donnees;

public class ComparateurAlbum implements ComparateurCd{

    @Override
    public boolean etreAvant(CD CD1, CD CD2) {
        return CD1.getNomCD().compareTo(CD2.getNomCD())<0;
    }
}
