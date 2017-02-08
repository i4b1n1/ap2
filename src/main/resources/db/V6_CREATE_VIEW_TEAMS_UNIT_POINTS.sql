USE `watking_test1`;
CREATE  OR REPLACE VIEW `teams_unit_points` AS
    SELECT 
        `results`.`LEAGUE_ID` AS `LEAGUE_ID`,
        `results`.`TEAM_HOME_ID` AS `TEAM_ID`,
        `results`.`GOALS_HOME` AS `GOALS_SCORED`,
        `results`.`GOALS_AWAY` AS `GOALS_LOST`,
        (CASE
            WHEN (`results`.`GOALS_HOME` > `results`.`GOALS_AWAY`) THEN 3
            WHEN (`results`.`GOALS_HOME` < `results`.`GOALS_AWAY`) THEN 0
            ELSE 1
        END) AS `POINTS`
    FROM
        `results` 
    UNION ALL SELECT 
        `results`.`LEAGUE_ID` AS `LEAGUE_ID`,
        `results`.`TEAM_AWAY_ID` AS `TEAM_ID`,
        `results`.`GOALS_AWAY` AS `GOALS_SCORED`,
        `results`.`GOALS_HOME` AS `GOALS_LOST`,
        (CASE
            WHEN (`results`.`GOALS_AWAY` > `results`.`GOALS_HOME`) THEN 3
            WHEN (`results`.`GOALS_AWAY` < `results`.`GOALS_HOME`) THEN 0
            ELSE 1
        END) AS `POINTS`
    FROM
        `results`;