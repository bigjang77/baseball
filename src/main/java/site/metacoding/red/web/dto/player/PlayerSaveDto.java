package site.metacoding.red.web.dto.player;

import site.metacoding.red.domain.player.Player;

public class PlayerSaveDto {
	private Integer teamId;
	private String playerName;
	
	public Player toEntity() {
		Player player = new Player(this.playerName, this.teamId);
		return player;
	}
}
