USE `watking_test1`;
CREATE  OR REPLACE VIEW `results` AS
    SELECT 
        `me`.`MATCH_ID` AS `MATCH_ID`,
        `m`.`LEAGUE_ID` AS `LEAGUE_ID`,
        `m`.`ROUND_NUMBER` AS `MATCHWEEK_NUMBER`,
        `m`.`TEAM_HOME_ID` AS `TEAM_HOME_ID`,
        SUM((CASE
            WHEN (`me`.`TEAM_ID` = `m`.`TEAM_HOME_ID`) THEN 1
            ELSE 0
        END)) AS `GOALS_HOME`,
        `m`.`TEAM_AWAY_ID` AS `TEAM_AWAY_ID`,
        SUM((CASE
            WHEN (`me`.`TEAM_ID` = `m`.`TEAM_AWAY_ID`) THEN 1
            ELSE 0
        END)) AS `GOALS_AWAY`,
        th.NAME as TEAM_HOME_NAME,
        ta.NAME as TEAM_AWAY_NAME
    FROM
        (`match_event` `me`
        LEFT JOIN `matches` `m` ON ((`me`.`MATCH_ID` = `m`.`ID`)))
        join team th on th.ID = TEAM_HOME_ID
        join team ta on ta.ID = TEAM_AWAY_ID
    WHERE
        (`me`.`EVENT_TYPE_ID` = 1)
    GROUP BY `me`.`MATCH_ID`;;
