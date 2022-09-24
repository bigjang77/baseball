package site.metacoding.red.web.dto.stadium;

import site.metacoding.red.domain.stadium.Stadium;

public class StadiumSaveDto {
	public String stadiumName;

	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.stadiumName);
		return stadium;
	}
}
