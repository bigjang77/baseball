package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.stadium.StadiumSaveDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	
	@DeleteMapping("/stadium/")
	public @ResponseBody CMRespDto<?> deletestadium(@PathVariable Integer id){
		stadiumService.야구장삭제(id);
		return new CMRespDto<>(1, "경기장삭제성공",null);
	}

	
	@PostMapping("/stadium")
	public @ResponseBody CMRespDto<?> savestadium(@RequestBody StadiumSaveDto stadiumSaveDto){
		stadiumService.야구장추가(stadiumSaveDto);
		return new CMRespDto<>(1, "경기장생성성공", null);
	}
	
	
	@GetMapping("/stadium/stadiumList")
	public String stadiumList(Model model) {
		List<Stadium> stadiumList = stadiumService.야구장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "/stadium/stadiumList";
	}
	
	@GetMapping("/stadium/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "/stadium/stadiumSaveForm";
	}
}
