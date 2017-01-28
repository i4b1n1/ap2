CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `SCORERS_CLASSIFICATION` AS
    SELECT 
        `p`.`NAME` AS `Zawodnik`,
        `t`.`NAME` AS `Druzyna`,
        COUNT(`me`.`ID`) AS `Bramki`
    FROM
        ((`MATCH_EVENT` `me`
        JOIN `PLAYER` `p` ON ((`me`.`PLAYER_ID` = `p`.`ID`)))
        JOIN `TEAM` `t` ON ((`p`.`TEAM_ID` = `t`.`ID`)))
    WHERE
        (`me`.`EVENT_TYPE_ID` = 1)
    GROUP BY 1 , 2
    ORDER BY `Bramki` DESC;