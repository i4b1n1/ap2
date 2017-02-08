USE `watking_test1`;
CREATE  OR REPLACE VIEW `league_table` AS
    SELECT 
        `teams_unit_points`.LEAGUE_ID as LEAGUE_ID,
        `teams_unit_points`.`TEAM_ID` AS `TEAM_ID`,
        SUM(`teams_unit_points`.`GOALS_SCORED`) AS `GOALS_SCORED`,
        SUM(`teams_unit_points`.`GOALS_LOST`) AS `GOALS_LOST`,
        SUM(`teams_unit_points`.`POINTS`) AS `POINTS`,
        t.NAME
    FROM
        `teams_unit_points`
        join team t on t.ID = teams_unit_points.TEAM_ID
    GROUP BY `teams_unit_points`.`TEAM_ID`
    ORDER BY `POINTS` DESC;