package site.metacoding.red.web.dto.stadium;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StadiumDto {
	private	Integer id;
	private	String stadiumName;
	private	Timestamp createDate;
	private int no;
}
