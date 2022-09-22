package site.metacoding.red.web.dto.request.stadiums;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Setter
@Getter
public class SaveDto {
	private String stadiumName;
	private String location;
	
}
