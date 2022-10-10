package sio.seg.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Commune
 *
 * 10/10/2022
 * */
public class Commune {
    private int numCom;
    private String nomCom;
    private List<Secteur> listSect;

    /**
     * @param unNumero
     * @param unNom
     * Constructeur
     */
    public Commune(int unNumero, String unNom){
        numCom = unNumero;
        nomCom = unNom;
        listSect = new ArrayList<Secteur>();
    }

    /**
     * @param unNumSect
     * @param unNomSect
     * @param unEspaceVert
     * ajoute un nouveau secteur
     */
    public void ajouteSecteur(int unNumSect, String unNomSect, boolean unEspaceVert){
        Secteur s = new Secteur(unNumSect, unNomSect, unEspaceVert, this);
        listSect.add(s);
    }

    /**
     * @param unNumeroSecteur
     * @return unNumeroSecteur ou null
     * retourne l'objet secteur dont le numero est passé en paramètre ou null si aucun ne correspond
     */
    public Secteur getSecteurByNumero(int unNumeroSecteur){
        for (Secteur s : this.listSect){
            if (s.getNumSecteur() == unNumeroSecteur)
                return s;
        }
        return null;
    }

    /**
     * @return listSectVert
     * retourne les secteurs  possedant un espace vert
     */
    public List secteurEstVerts(){
        List<Secteur> listSectVert = new ArrayList<Secteur>();
        for (Secteur s : this.listSect){
            if(s.isEspaceVert()){
                listSectVert.add(s);
            }
        }
        return listSectVert;
    }

    public int volumeDistribue(char unTypeCompteur){
        if(unTypeCompteur == 'A'){
            return volumeDistribue(C);
        }
        else
            return volumeDistribue(C);
    }

    public int perte(){

    }

    public int anomalie(){

    }

}
