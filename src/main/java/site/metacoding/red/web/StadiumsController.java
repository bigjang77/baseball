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
import site.metacoding.red.domain.stadiums.Stadiums;
import site.metacoding.red.domain.stadiums.StadiumsDao;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class StadiumsController {
	
	private final StadiumsDao stadiumsDao;
	
	
	@DeleteMapping("/stadiums/{id}")
	public @ResponseBody CMRespDto<?> deleteStadiums(@PathVariable Integer id){
		stadiumsDao.deleteById(id);
		return new CMRespDto<>(1, "경기장삭제성공",null);
	}
	
	
	
	@PutMapping("/stadiums/{id}/stadiumList")
	public @ResponseBody CMRespDto<?> updateStadiums(@PathVariable Integer id,@RequestBody Stadiums stadiums){
		stadiumsDao.update(stadiums);
		return new CMRespDto<>(1, "경기장수정성공",null);
	}
	
	@GetMapping("/stadiums/{id}/stadiumsList")
	public String updateFormStadiums(@PathVariable Integer id, Model model) {
		Stadiums stadiums = stadiumsDao.findById(id);
		model.addAttribute("stadiums", stadiums);
		return "/stadiums/stadiumsList";
	}
	
	@PostMapping("/stadiums")
	public @ResponseBody CMRespDto<?> saveStadiums(@RequestBody Stadiums stadiums){
		stadiumsDao.insert(stadiums);
		return new CMRespDto<>(1, "경기장생성성공", null);
	}
	
	
	@GetMapping("/stadiums/stadiumsList")
	public String getStadiumsList(Model model) {
		model.addAttribute("stadiums", stadiumsDao.findAll());
		return "/stadiums/stadiumsList";
	}
	
	@GetMapping("/stadiums/stadiumsSaveForm")
	public String stadiumSaveForm() {
		return "/stadiums/stadiumsSaveForm";
	}
}
