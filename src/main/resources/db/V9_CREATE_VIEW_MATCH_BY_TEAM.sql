USE `watking_test1`;
CREATE  OR REPLACE VIEW `match_by_team` AS
select m.ID, t1.ID as TEAM_ID, m.MATCH_DATE, m.ROUND_NUMBER, t2.NAME as RIVAL
 from matches m
 join team t1 on m.TEAM_AWAY_ID = t1.ID
 join team t2 on m.TEAM_HOME_ID = t2.ID
union all
select m.ID, t1.ID as TEAM_ID, m.MATCH_DATE, m.ROUND_NUMBER, t2.NAME as RIVAL
 from matches m
 join team t1 on m.TEAM_HOME_ID = t1.ID
 join team t2 on m.TEAM_AWAY_ID = t2.ID;