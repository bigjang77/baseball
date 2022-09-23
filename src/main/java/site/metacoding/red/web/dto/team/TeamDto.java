package site.metacoding.red.web.dto.team;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TeamDto {
	private	int id;
	private	String stadiumName;
	private String teamName;
	private	Timestamp createDate;
	private int no;
}
