CREATE TABLE IF NOT EXISTS Contato (
    id BIGINT NOT NULL AUTO_INCREMENT,
    cliente BIGINT NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    contato VARCHAR(100) NOT NULL,
    PRIMARY KEY(ID)
);

ALTER TABLE Contato
ADD CONSTRAINT FK_Contato_Cliente
FOREIGN KEY(cliente)
REFERENCES Cliente(id);

INSERT INTO Contato(cliente, descricao, contato)
VALUES  (1, "Encanador", "+(55) 14 99610-2925"),
        (2, "Jogador de Basquete", "+(55) 14 99723-3221"),
        (3, "Jogador de Baseball", "+(55) 14 99326-1728");
