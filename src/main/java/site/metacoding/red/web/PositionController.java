package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.position.PositionDao;
import site.metacoding.red.web.dto.response.PositionDto;

@RequiredArgsConstructor
@Controller
public class PositionController {

	private final PositionDao positionDao;
	
	@GetMapping("/position/positionList")
	public String position(Model model) {
		List<PositionDto> positionDto = positionDao.findAll();
		model.addAttribute("position", positionDto);
		return "position/positionList";
	}
};
