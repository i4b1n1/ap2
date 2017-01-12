package Team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Player;


@RestController
@RequestMapping("/team")
public class TeamController {
	@Autowired
	TeamService service;
	

	@RequestMapping("/players/list/{id}")
	public List<Player> getTeamPlaters(int id) {
		List<Player> result = service.getPlayersList(id);
		return result;
	}

}
