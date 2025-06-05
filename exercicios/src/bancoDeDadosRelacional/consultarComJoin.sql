-- Primeira forma de fazer a consulta com junção
SELECT e.nome, c.nome, e.regial FROM estados e, cidades c
WHERE e.id = c.estado_id;

-- Segunda forma de fazer a consulta com junção
SELECT
    c.nome as Cidade,
    e.nome as Estado,
    regial as Região
FROM estados e
INNER JOIN cidades c on e.id = c.estado_id;