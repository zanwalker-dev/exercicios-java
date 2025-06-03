INSERT INTO estados(id, nome, sigla, regial, populacao)
VALUES (1000, 'Novo', 'NV', 'Sul', 2.54);

-- Ao usar de novo o ID com alto incremento ele vai seguir a partir do 1000
INSERT INTO estados(nome, sigla, regial, populacao)
VALUES ('Mais Novo', 'MN', 'Norte', 2.54)