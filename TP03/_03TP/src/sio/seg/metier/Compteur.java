package sio.seg.metier;

/**
 * Compteur
 *
 * 10/10/2022
 * */
public class Compteur {
    private int numero;
    private char typeCompteur;
    private int indexPrecedent;
    private int indexNouveau;

    /**
     * @param unNumero
     * @param unType
     * Constructeur
     */
    public Compteur(int unNumero, char unType){
        this.numero = unNumero;
        this.typeCompteur = unType;
        this.indexPrecedent = 0;
        this.indexNouveau = 0;
    }

    /**
     * @param indexReleve
     * Met à jour les index
     */
    public void releve(int indexReleve){
        this.indexPrecedent = this.indexNouveau;
        this.indexNouveau = indexReleve;
    }

    public int getNumero(){
        return this.numero;
    }

    public char getTypeCompteur(){
        return this.typeCompteur;
    }

    /**
     * @return conso
     * méthode qui retourne la consomation d'un compteur
     */
    public int conso(){
        return Math.round(this.indexNouveau - this.indexPrecedent);
    }

}
