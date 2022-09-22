package site.metacoding.red.domain.explusion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Explusion {
	private Integer id;
	private int playerId;
	private String reason;
	private Timestamp createdDate;
}
