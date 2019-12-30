/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5edma.partie.pkg1;

/**
 *
 * @author pc
 */
public class prorduit {
  private int identifiant;
   private String libelle;
   private String marque;
   private float unprix;

    public prorduit() {
    }

    public prorduit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }

    public prorduit(int identifiant, String libelle, String marque, float unprix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.unprix = unprix;
    }

    @Override
    public String toString() {
        return "prorduit{" + "identifiant=" + identifiant + ", libelle=" + libelle + ", marque=" + marque + ", unprix=" + unprix + '}';
    }
   public void afficher()
   {
       System.out.println("identifiant=" + identifiant + ", libelle=" + libelle + ", marque=" + marque + ", unprix=" + unprix);
   }  

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getUnprix() {
        return unprix;
    }

    public void setUnprix(float unprix) {
        this.unprix = unprix;
    }
   
}
