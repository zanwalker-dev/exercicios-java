SELECT * from estados;

INSERT INTO
    cidades (nome, estado_id, area)
VALUES ('Campinas', 25, 795);

INSERT INTO
    cidades (nome, estado_id, area)
VALUES ('Niterói', 19, 133.9);

INSERT INTO
    cidades (nome, estado_id, area)
VALUES (
        'Caruaru',
        (SELECT id from estados where sigla = 'PE'),
        920.6);

INSERT INTO
    cidades (nome, estado_id, area)
VALUES (
           'Juazeiro do Norte',
           (SELECT id from estados where sigla = 'CE'),
           248.2);

SELECT * from cidades;