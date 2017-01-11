CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `TABELA_LIGOWA_POMOCNICZA` AS
    SELECT 
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` > `WYNIKI`.`SCORE_AWAY`) THEN `WYNIKI`.`TEAM_HOME`
            ELSE `WYNIKI`.`TEAM_AWAY`
        END) AS `Name`,
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` > `WYNIKI`.`SCORE_AWAY`) THEN 3
            ELSE 3
        END) AS `Pkt`
    FROM
        `WYNIKI` 
    UNION ALL SELECT 
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` = `WYNIKI`.`SCORE_AWAY`) THEN `WYNIKI`.`TEAM_HOME`
        END) AS `Name`,
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` = `WYNIKI`.`SCORE_AWAY`) THEN 1
        END) AS `Pkt`
    FROM
        `WYNIKI` 
    UNION ALL SELECT 
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` = `WYNIKI`.`SCORE_AWAY`) THEN `WYNIKI`.`TEAM_AWAY`
        END) AS `Name`,
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` = `WYNIKI`.`SCORE_AWAY`) THEN 1
        END) AS `Pkt`
    FROM
        `WYNIKI` 
    UNION ALL SELECT 
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` < `WYNIKI`.`SCORE_AWAY`) THEN `WYNIKI`.`TEAM_HOME`
        END) AS `Name`,
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` < `WYNIKI`.`SCORE_AWAY`) THEN 0
        END) AS `Pkt`
    FROM
        `WYNIKI` 
    UNION ALL SELECT 
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` > `WYNIKI`.`SCORE_AWAY`) THEN `WYNIKI`.`TEAM_AWAY`
        END) AS `Name`,
        (CASE
            WHEN (`WYNIKI`.`SCORE_HOME` > `WYNIKI`.`SCORE_AWAY`) THEN 0
        END) AS `Pkt`
    FROM
        `WYNIKI`