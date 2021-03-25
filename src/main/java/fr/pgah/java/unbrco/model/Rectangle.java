package fr.pgah.java.unbrco.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import fr.pgah.java.son.MidiSynth;

public class Rectangle extends Forme{

   
    
    public Rectangle(Point hautGauche, MidiSynth midiSynth, int instrument) {
        super(hautGauche, midiSynth, instrument);
 
    }

    @Override
    public void dessiner(Graphics g) {
        Color saveCouleur = g.getColor();
        if (estSelectionnee) {
          g.setColor(COULEUR_LIGNE_JOUEE);
        } else {
          g.setColor(Color.white);
        }
        g.fillRect(x, y, longueur, hauteur);
        g.setColor(saveCouleur);
        g.drawRect(x, y, longueur, hauteur);
    
        if (colonneJouee > 0 && colonneJouee < longueur) {
          g.setColor(Color.red);
          g.drawLine(x + colonneJouee, y, x + colonneJouee, y + hauteur);
          g.setColor(saveCouleur);
        }
    }

}
