-- Exemplos válidos, é permitido cidade_id ser null
INSERT INTO prefeitos
    (nome, cidade_id)
VALUES
    ('João das Neves', 2),
    ('Raquel Lyra', 4),
    ('Zenaldo Coutinho', null);

SELECT * FROM prefeitos;

-- Exemplo é permitido repetir prefeito com cidade null
INSERT INTO
    prefeitos(nome, cidade_id)
VALUES
    ('Rafael Greca', null);

-- Exemplo não é permitido repetir cidade_id por ser UNIQUE
INSERT INTO
    prefeitos(nome, cidade_id)
VALUES
    ('Rodrigo Pinheiro', 4);
