-- Pesquisa a tabela estados inteira
SELECT * FROM estados;

-- Pesquisa nome e sigla dos estados da região sul
SELECT nome, sigla FROM estados WHERE regial = 'Sul';

-- Pesquisa nome e região onde a população é mais de 10kk
SELECT nome, regial FROM estados
WHERE populacao >= 10
ORDER BY populacao desc; -- Faz trazer em ordem decrescente