package site.metacoding.red.web.dto.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.player.Player;

@Setter
@Getter
public class PlayerSaveDto {
	private Integer teamId;
	private String playerName;
	private String position;
	
	public Player toEntity(Integer teamId, String playerName, String position) {
		Player player = new Player(this.playerName, this.teamId,  this.position);
		return player;
	}
}
