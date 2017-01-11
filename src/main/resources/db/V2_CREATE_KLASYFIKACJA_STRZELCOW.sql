USE `watking_test1`;
CREATE  OR REPLACE VIEW `KLASYFIKACJA_STRZELCOW` AS
select p.NAME Zawodnik, t.NAME Druzyna, count(me.ID) as Bramki
from watking_test1.MATCH_EVENT me
join PLAYER p 
on me.PLAYER_ID = p.ID
join TEAM t
on p.TEAM_ID = t.ID
where EVENT_TYPE_ID = 1
group by 1, 2
order by Bramki desc ;