CREATE TABLE IF NOT EXISTS Cliente (
    id bigint NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO Cliente(nome)
VALUES  ("Pedro"),
        ("Carlão"),
        ("João");