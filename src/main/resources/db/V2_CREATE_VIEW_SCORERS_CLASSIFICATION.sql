CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `scorers_cassification` AS
    SELECT 
        `p`.`NAME` AS `Zawodnik`,
        `t`.`NAME` AS `Druzyna`,
        COUNT(`me`.`ID`) AS `Bramki`,
        `t`.`LEAGUE_ID` AS `LEAGUE_ID`
    FROM
        ((`match_event` `me`
        JOIN `player` `p` ON ((`me`.`PLAYER_ID` = `p`.`ID`)))
        JOIN `team` `t` ON ((`p`.`TEAM_ID` = `t`.`ID`)))
    WHERE
        (`me`.`EVENT_TYPE_ID` = 1)
    GROUP BY 1 , 2
    ORDER BY `Bramki` DESC;
    
    