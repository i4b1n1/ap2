package Team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.Player;
import com.domain.PlayerRepository;
import com.domain.TeamRepository;

@Component
public class TeamService {
	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	PlayerRepository platerRepository;

	public List<Player> getPlayersList(int teamId) {
		return platerRepository.getTeamPlayers(teamId);
	}
	
	

}
