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
public class Partie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       prorduit p1 =new prorduit(1021,"lait","delice");
       prorduit p2 =new prorduit(1021,"yagourt","vitalait");
       prorduit p3 =new prorduit(1021,"tomato","sicam", (float) 1.200);
       p1.afficher();
       p2.afficher();
       p3.afficher();
       p1.setUnprix((float) 0.700);
       p2.setUnprix((float) 0.500);
       p1.afficher();
       p2.afficher();
       String resultat=p1.toString();
        System.out.println(""+resultat);
    }
    
}
