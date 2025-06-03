-- Atualiza um registro, IMPORTANTE sempre usar o WHERE
-- caso contrario vai atualizar TODOS os registros do banco
UPDATE estados
SET nome = 'Maranhão'
WHERE sigla = 'MA';

UPDATE estados
SET nome = 'Paraná',
    populacao = 11.32
WHERE sigla = 'PR';