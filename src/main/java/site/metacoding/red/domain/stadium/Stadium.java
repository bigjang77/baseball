package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Stadium {

	private Integer id;
	private String stadiumName;
	private Timestamp createDate;
	
}
