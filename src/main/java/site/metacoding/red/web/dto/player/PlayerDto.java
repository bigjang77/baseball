package site.metacoding.red.web.dto.player;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PlayerDto {
	private Integer id;
	private String playerName;
	private String teamName;
	private String position;
	private Timestamp createDate;
	private int no;
}
