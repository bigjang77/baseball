package site.metacoding.red.web.dto.request.stadiums;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ListDto {
	private Integer id;
	private String stadiumName;
	private String location;
	private Timestamp createDate;
}
