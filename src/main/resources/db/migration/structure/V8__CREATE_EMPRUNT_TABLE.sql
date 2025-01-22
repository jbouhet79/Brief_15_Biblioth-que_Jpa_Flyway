CREATE TABLE IF NOT EXISTS emprunt (
    id SERIAL PRIMARY KEY,
    emprunteur_id INT,
    livre_id INT,
    FOREIGN KEY (emprunteur_id) REFERENCES emprunteur(id),
    FOREIGN KEY (livre_id) REFERENCES livre(id)
);
