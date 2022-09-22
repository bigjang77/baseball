package site.metacoding.red.web;

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
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumDao stadiumDao;
	
	
	@DeleteMapping("/stadium/{id}")
	public @ResponseBody CMRespDto<?> deletestadium(@PathVariable Integer id){
		stadiumDao.deleteById(id);
		return new CMRespDto<>(1, "경기장삭제성공",null);
	}
	
	
	
	@PutMapping("/stadium/{id}/stadiumList")
	public @ResponseBody CMRespDto<?> updatestadium(@PathVariable Integer id,@RequestBody Stadium stadium){
		stadiumDao.update(stadium);
		return new CMRespDto<>(1, "경기장수정성공",null);
	}
	
	@GetMapping("/stadium/{id}/stadiumList")
	public String updateFormstadium(@PathVariable Integer id, Model model) {
		Stadium stadium = stadiumDao.findById(id);
		model.addAttribute("stadium", stadium);
		return "/stadium/stadiumList";
	}
	
	@PostMapping("/stadium")
	public @ResponseBody CMRespDto<?> savestadium(@RequestBody Stadium stadium){
		stadiumDao.insert(stadium);
		return new CMRespDto<>(1, "경기장생성성공", null);
	}
	
	
	@GetMapping("/stadium/stadiumList")
	public String getstadiumList(Model model) {
		model.addAttribute("stadium", stadiumDao.findAll());
		return "/stadium/stadiumList";
	}
	
	@GetMapping("/stadium/stadiumSaveForm")
	public String stadiumaveForm() {
		return "/stadium/stadiumSaveForm";
	}
}
