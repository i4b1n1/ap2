CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `TABELA_LIGOWA` AS
    SELECT 
        `t`.`Name` AS `Name`,
        `t`.`Punkty` AS `Punkty`,
        `b`.`Strzelone` AS `Strzelone`,
        `b`.`Stracone` AS `Stracone`,
        (`b`.`Strzelone` - `b`.`Stracone`) AS `Bilans`
    FROM
        (`TABELA_PUNKTOWA` `t`
        JOIN `BILANS_BRAMKOWY` `b` ON ((`t`.`Name` = `b`.`Name`)))
    ORDER BY `t`.`Punkty` DESC