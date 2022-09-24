package site.metacoding.red.web.dto.team;

import site.metacoding.red.domain.team.Team;

public class TeamSaveDto {
	private Integer stadiumId;
	private String teamName;
	
	public Team toEntity() {
		Team team = new Team(this.teamName, this.stadiumId);
		return team;
	}
}
