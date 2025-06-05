-- Exemplo de INNER, só tras cidades q tem prefeitos
-- e prefeitos que tem cidade.
SELECT *
FROM
    cidades c
INNER JOIN
    prefeitos p ON c.id = p.cidade_id;

-- Exemplo de LEFT, trás todas as cidades da primeira tabela
-- e da segunda tabela(prefeitos) apenas os que tem conexão
-- com a primeira tabela(cidades)
SELECT *
FROM
    cidades c
        LEFT JOIN
    prefeitos p ON c.id = p.cidade_id;

-- Exemplo de RIGHT, trás todas as cidades da segunda tabela
-- e da primeira tabela(cidades) apenas os que tem conexão
-- com a segunda tabela(prefeitos)
SELECT *
FROM
    cidades c
        RIGHT JOIN
    prefeitos p ON c.id = p.cidade_id;


-- Uma forma de fazer FULLJOIN no mySQL, trazendo assim
-- todas informações inclusive as NULL
SELECT *
FROM
    cidades c
        LEFT JOIN
    prefeitos p ON c.id = p.cidade_id
UNION
SELECT *
FROM
    cidades c
        RIGHT JOIN
    prefeitos p ON c.id = p.cidade_id;
