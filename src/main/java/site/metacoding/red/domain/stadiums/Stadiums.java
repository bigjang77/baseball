package site.metacoding.red.domain.stadiums;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Stadiums {

	private Integer id;
	private String stadiumName;
	private String location;
	private Timestamp createDate;
	
}
