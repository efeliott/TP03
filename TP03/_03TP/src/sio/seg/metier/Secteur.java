package sio.seg.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Secteur
 *
 * 10/10/2022
 * */
public class Secteur {
    private int numSecteur;
    private String nomSecteur;
    private boolean espaceVert;
    private Commune laCommune;
    private List<Compteur> listCompt;

    /**
     * @param unNumero
     * @param unNom
     * @param unEspaceVert
     * @param uneCommune
     * Constructeur
     */
    public Secteur(int unNumero, String unNom, boolean unEspaceVert, Commune uneCommune){
        numSecteur = unNumero;
        nomSecteur = unNom;
        espaceVert = unEspaceVert;
        laCommune = uneCommune;
        listCompt = new ArrayList<Compteur>();
    }

    public int getNumSecteur(){
        return this.numSecteur;
    }

    public String getNomSecteur(){
        return this.nomSecteur;
    }

    /**
     * @return espace vert
     * Indique si il y a un espace vert à arroser
     */
    public boolean isEspaceVert(){
        if(this.espaceVert)
            return true;
        else
            return false;
    }

    public List getLesCompteurs(){
        return this.listCompt;
    }

    public void ajouteCompteur(Compteur c){
        this.listCompt.add(c);
    }
}
