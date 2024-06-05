INSERT
INTO
    TIPO_DE_ANIMAL
    (tipo )
VALUES
    ('Cachorro');

INSERT
INTO
    TIPO_DE_ANIMAL
    (tipo )
VALUES
    ('Gato');

INSERT
INTO
    TIPO_DE_ANIMAL
    (tipo )
VALUES
    ('Tartaruga');

INSERT
INTO
    ANIMAL
    (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte, tipo_de_animal_id)
VALUES
    ('Cachorrinho  da Ebac',3,'SRD', current_date, 'bem pulguento','Cleber', 'Pequeno', 1);

INSERT
INTO
    ANIMAL
    (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte, tipo_de_animal_id)
VALUES
    ('Outor Cachorrinho  da Ebac',10,'Rottveiler', current_date, 'bem velhinho','Renato', 'Grande', 1);

INSERT
INTO
    ANIMAL
    (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte, data_adocao , tipo_de_animal_id )
VALUES
    ('Totó',2,'Pinscher', current_date, 'tremulo','Giovanna', 'pequeno', current_date, 1);

INSERT
INTO
    ANIMAL
    (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte, data_adocao , tipo_de_animal_id )
VALUES
    ('Mingau',3,'Siames', current_date, 'muito sujo','Giovanna', 'pequeno', current_date, 2);