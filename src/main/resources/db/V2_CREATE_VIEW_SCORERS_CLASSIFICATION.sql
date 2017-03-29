USE `watking_test1`;
CREATE  OR REPLACE VIEW `scorers_cassification` AS
    SELECT 
    	p.ID as PLAYER_ID,
        `p`.`NAME` AS `zawodnik`,
        `t`.`NAME` AS `druzyna`,
        COUNT(`me`.`ID`) AS `bramki`,
        `t`.`LEAGUE_ID` AS `league_id`
    FROM
        ((`match_event` `me`
        JOIN `player` `p` ON ((`me`.`PLAYER_ID` = `p`.`ID`)))
        JOIN `team` `t` ON ((`p`.`TEAM_ID` = `t`.`ID`)))
    WHERE
        (`me`.`EVENT_TYPE_ID` = 1)
    GROUP BY 1 , 2
    ORDER BY `Bramki` DESC;
    
    