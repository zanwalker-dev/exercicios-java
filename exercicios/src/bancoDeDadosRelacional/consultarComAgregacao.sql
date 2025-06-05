-- Soma da população por região
SELECT
    regial as 'Região',
    SUM(populacao) as Total
FROM estados
GROUP BY regial
ORDER BY Total DESC;

-- Soma da população Nacional
SELECT
    SUM(populacao) as Total
FROM estados;

-- Média da população Nacional
SELECT
    AVG(populacao) as Total
FROM estados
