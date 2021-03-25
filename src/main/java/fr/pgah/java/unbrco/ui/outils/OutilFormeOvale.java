package fr.pgah.java.unbrco.ui.outils;

import javax.swing.JButton;
import javax.swing.JComponent;

import fr.pgah.java.unbrco.model.Ovale;
import fr.pgah.java.unbrco.ui.EditeurDeFormes;

public class OutilFormeOvale extends OutilForme {
    
    int instrument = 124;


    public OutilFormeOvale(EditeurDeFormes editeur, JComponent parent) {
        super(editeur, parent);
        
    }
    
    @Override
    protected void creerBouton(JComponent parent) {
      bouton = new JButton("Forme Ovale");
      bouton = customiserButton(bouton);
    }

    @Override
    public void pressDansZoneDessin(java.awt.event.MouseEvent e) {
        super.pressDansZoneDessin(e);
        
        forme = new Ovale(e.getPoint(), editeur.getMidiSynth(), instrument);
        forme.selectionnerEtJouer();
        forme.setLimites(e.getPoint());
        editeur.ajouterAuDessin(forme);
    }

}
