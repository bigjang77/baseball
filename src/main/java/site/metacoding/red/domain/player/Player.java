package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Player {
	private Integer id;
	private String playerName;
	private Integer teamId;
	private String position;
	private Integer old;
	private Timestamp createDate;
	private String teamName;
}
