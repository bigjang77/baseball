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
import site.metacoding.red.domain.teams.TeamsDao;
import site.metacoding.red.domain.stadiums.StadiumsDao;
import site.metacoding.red.domain.teams.Teams;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class TeamsController {
	
	private final TeamsDao teamsDao;
	private final StadiumsDao stadiumsDao;
	
	
	@DeleteMapping("/teams/{id}")
	public @ResponseBody CMRespDto<?> deleteteams(@PathVariable Integer id){
		teamsDao.deleteById(id);
		return new CMRespDto<>(1, "팀삭제성공",null);
	}
	
	
	
	@PutMapping("/teams/{id}/teamList")
	public @ResponseBody CMRespDto<?> updateteams(@PathVariable Integer id, Teams teams){
		teamsDao.update(teams);
		return new CMRespDto<>(1, "팀수정성공",null);
	}
	
	@GetMapping("/teams/{id}/teamsList")
	public String updateFormteams(@PathVariable Integer id, Model model) {
		Teams teams = teamsDao.findById(id);
		model.addAttribute("teams", teams);
		return "/teams/teamsList";
	}
	
	@PostMapping("/teams")
	public @ResponseBody CMRespDto<?> saveteams(@RequestBody Teams teams){
		teamsDao.insert(teams);
		return new CMRespDto<>(1, "팀생성성공", null);
	}
	
	
	@GetMapping("/teams/teamsList")
	public String getteamsList(Model model) {
		model.addAttribute("teams", teamsDao.findAll());
		return "/teams/teamsList";
	}
	
	@GetMapping("/teams/teamsSaveForm")
	public String teamSaveForm(Model model) {
		model.addAttribute("stadiums", stadiumsDao.findAll());
		return "/teams/teamsSaveForm";
	}
}