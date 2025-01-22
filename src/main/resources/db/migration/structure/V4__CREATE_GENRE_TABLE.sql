CREATE TABLE IF NOT EXISTS genre (
    id SERIAL PRIMARY KEY,
    genre VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS livre_genre (
    livre_id INT,
    genre_id INT,
    PRIMARY KEY (livre_id, genre_id),
    FOREIGN KEY (livre_id) REFERENCES livre(id),
    FOREIGN KEY (genre_id) REFERENCES genre(id)
);