package site.metacoding.red.domain.position;

import java.util.List;

import site.metacoding.red.web.dto.response.PositionDto;

public interface PositionDao {
	
	public List<PositionDto> findAll();
}
