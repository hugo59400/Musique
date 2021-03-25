# Lecteur de formes

Projet support SLAM5.

## Travail à faire

1. Complétez l'implémentation du constructeur de la classe `LecteurDeDessin`. FAIT
2. Complétez l'implémentation de la méthode `selectionnerEtJouerLesFormes` de la classe `LecteurDeDessin`. FAIT
3. Ajoutez la surcharge constructeur manquante dans la classe `Forme`. FAIT
4. Complétez l'implémentation des trois méthodes `contientX`, `contientY` et `contient` de la classe `Forme`.  FAIT
5. Complétez l'implémentation des trois méthodes `contientLaForme`, `ajouterForme` et `supprimerForme` de la classe `Dessin`.  FAIT
6. Complétez l'implémentation des deux méthodes `getPremiereFormeEn` et `formesSurLaColonne` de la classe `Dessin`.  FAIT
7. Compléter l'implémentation de la méthode `pressDansZoneDessin` de la classe `OutilDeplacer`.  FAIT
8. Compléter l'implémentation des deux méthodes `ajouterAuDessin` et `supprimerDuDessin` de la classe `EditeurDeFormes`.   FAIT
9. Ajoutez tous les getters et setters nécessaires à la compilation et au bon fonctionnement de l'application.  FAIT

l'outil JOUER tout le dessin  fonctionne 

J'ai amelioré en mettant la classe forme en abstrait puis en creeant 2 nouvelles classes Rectangle et Ovale 

Ajouter un bouton « Forme ovale » en examinant le traitement actuel des boutons et en dupliquant/adaptant ces fonctionnalités FAIT 

Ajouter une classe qui implémente la nouvelle forme en regardant comment la classe Forme fonctionne  FAIT 

Concevez la classe abstraite Forme dont vont dériver deux classes concrètes Rectangle et Ovale ; factorisez le code commun dans la classe abstraite FAIT 
