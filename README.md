# Brief 15 - Création d'une application pour la gestion d'une bibliothèque
__________________________________________________________________________________  

## _Requêtes SQL:_

- Pour afficher tous les titres des livres regroupés par genre :
![img.png](img.png)
```
SELECT g.id AS genre_id, g.genre, l.id AS livre_id, l.titre  
FROM livre l  
JOIN livre_genre lg ON l.id = lg.livre_id  
JOIN genre g ON lg.genre_id = g.id  
ORDER BY g.genre, l.titre;
```

- Pour afficher les emprunts de l'emprunteur avec l'ID 1
  ![img_2.png](img_2.png)
```
  SELECT e.id AS emprunteur_id, e.nom AS emprunteur_nom, em.id AS emprunt_id
  FROM emprunteur e
  JOIN emprunt em ON e.id = em.emprunteur_id
  WHERE e.id = 1;
  ```
- Pour afficher les titres des livres empruntés par l'emprunteur avec l'ID 1
![img_1.png](img_1.png)
```
SELECT e.id AS emprunteur_id, e.nom AS emprunteur_nom, em.id AS emprunt_id, l.id AS livre_id, l.titre AS livre_titre
FROM emprunteur e
JOIN emprunt em ON e.id = em.emprunteur_id
JOIN livre l ON em.livre_id = l.id
WHERE e.id = 1;
```

## _Gestion de la bibliothèque:_
- Suppression de l'emprunt du livre avec l'id 1, pour l'emprunteur 1  
  ```
  DELETE FROM emprunt
  WHERE emprunteur_id = 1 AND livre_id = 1;
  ```  
  ![img_3.png](img_3.png)
  
- Ajout d'un emprunteur :
  ```
  INSERT INTO emprunteur (nom, prenom)
  VALUES ('DURAND', 'Georges');
  ```  
  ![img_4.png](img_4.png)
- Enregistrement des emprunts réalisé par l'emprunteur 5:
  ```
  INSERT INTO emprunt(EMPRUNTEUR_ID, LIVRE_ID)
  VALUES (5,1),
  (5,4);
  ```  
![img_5.png](img_5.png)

- Ajout des nouveaux genres de livre:
```
INSERT INTO genre (genre)
VALUES ('D'),
('E');
```
![img_6.png](img_6.png)