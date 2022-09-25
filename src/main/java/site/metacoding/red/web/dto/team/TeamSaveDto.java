package site.metacoding.red.web.dto.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.team.Team;

@Getter
@Setter
public class TeamSaveDto {
	private Integer stadiumId;
	private String teamName;
	
	public Team toEntity(Integer stadiumId, String name) {
		Team team = new Team(this.stadiumId, this.teamName);
		return team;
	}
}
