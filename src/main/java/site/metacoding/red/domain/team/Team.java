package site.metacoding.red.domain.team;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Team {
	private Integer id;
	private String teamName;
	private Integer stadiumId;
	private Timestamp createDate;
	private String stadiumName;
	
	public Team(String teamName, Integer stadiumId) {
		this.teamName = teamName;
		this.stadiumId = stadiumId;
	}
}
