package site.metacoding.red.web.dto.expulsion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpulsionDto {
	private Integer rownum;
	private String teamName;
	private String position;
	private String playerName;
	private String reason;
	private Timestamp createDate;
}
