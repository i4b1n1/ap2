CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `BILANS_BRAMKOWY_POMOCNICZA` AS
    SELECT 
        `WYNIKI`.`TEAM_HOME` AS `Name`,
        `WYNIKI`.`SCORE_HOME` AS `Strzelone`,
        `WYNIKI`.`SCORE_AWAY` AS `Stracone`
    FROM
        `WYNIKI` 
    UNION ALL SELECT 
        `WYNIKI`.`TEAM_AWAY` AS `Name`,
        `WYNIKI`.`SCORE_AWAY` AS `Strzelone`,
        `WYNIKI`.`SCORE_HOME` AS `Stracone`
    FROM
        `WYNIKI`
        
        
CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `BILANS_BRAMKOWY` AS
    SELECT 
        `BILANS_BRAMKOWY_POMOCNICZA`.`Name` AS `Name`,
        SUM(`BILANS_BRAMKOWY_POMOCNICZA`.`Strzelone`) AS `Strzelone`,
        SUM(`BILANS_BRAMKOWY_POMOCNICZA`.`Stracone`) AS `Stracone`
    FROM
        `BILANS_BRAMKOWY_POMOCNICZA`
    GROUP BY `BILANS_BRAMKOWY_POMOCNICZA`.`Name`