package fr.pgah.java.unbrco.ui.outils;

import javax.swing.JButton;
import javax.swing.JComponent;
import fr.pgah.java.unbrco.model.Rectangle;
import fr.pgah.java.unbrco.ui.EditeurDeFormes;

public class OutilFormeRectangle extends OutilForme{

    int instrument = 100;

    public OutilFormeRectangle(EditeurDeFormes editeur, JComponent parent) {
        super(editeur, parent);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    protected void creerBouton(JComponent parent) {
      bouton = new JButton("Forme Rectangle");
      bouton = customiserButton(bouton);
    }

    @Override
    public void pressDansZoneDessin(java.awt.event.MouseEvent e) {
        super.pressDansZoneDessin(e);
        
        forme = new Rectangle(e.getPoint(), editeur.getMidiSynth(), instrument);
        forme.selectionnerEtJouer();
        forme.setLimites(e.getPoint());
        editeur.ajouterAuDessin(forme);
    }

}
