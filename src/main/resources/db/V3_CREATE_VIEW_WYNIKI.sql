CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `WYNIKI_HOME` AS
    SELECT 
        `me`.`MATCH_ID` AS `MATCH_ID`,
        COUNT(`me`.`EVENT_MINUTE`) AS `SCORE_HOME`,
        `t`.`NAME` AS `NAME`
    FROM
        ((`MATCH_EVENT` `me`
        JOIN `MATCH` `m` ON ((`m`.`ID` = `me`.`MATCH_ID`)))
        JOIN `TEAM` `t` ON ((`me`.`TEAM_ID` = `t`.`ID`)))
    WHERE
        ((`me`.`EVENT_TYPE_ID` = 1)
            AND (`me`.`TEAM_ID` = `m`.`TEAM_HOME_ID`))
    GROUP BY `me`.`MATCH_ID` , `t`.`NAME`
	
	
	CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `WYNIKI_AWAY` AS
    SELECT 
        `me`.`MATCH_ID` AS `MATCH_ID`,
        COUNT(`me`.`EVENT_MINUTE`) AS `SCORE_AWAY`,
        `t`.`NAME` AS `NAME`
    FROM
        ((`MATCH_EVENT` `me`
        JOIN `MATCH` `m` ON ((`m`.`ID` = `me`.`MATCH_ID`)))
        JOIN `TEAM` `t` ON ((`me`.`TEAM_ID` = `t`.`ID`)))
    WHERE
        ((`me`.`EVENT_TYPE_ID` = 1)
            AND (`me`.`TEAM_ID` = `m`.`TEAM_AWAY_ID`))
    GROUP BY `me`.`MATCH_ID` , `t`.`NAME`
	
	
CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `watking_prime`@`%` 
    SQL SECURITY DEFINER
VIEW `WYNIKI` AS
    SELECT 
        `tab1`.`MATCH_ID` AS `MATCH_ID`,
        `tab1`.`NAME` AS `TEAM_HOME`,
        `tab1`.`SCORE_HOME` AS `SCORE_HOME`,
        `tab2`.`NAME` AS `TEAM_AWAY`,
        `tab2`.`SCORE_AWAY` AS `SCORE_AWAY`
    FROM
        (`WYNIKI_HOME` `tab1`
        JOIN `WYNIKI_AWAY` `tab2` ON ((`tab1`.`MATCH_ID` = `tab2`.`MATCH_ID`)))