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
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamDao teamDao;
	private final StadiumDao stadiumsDao;
	
	
	@DeleteMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> deleteteam(@PathVariable Integer id){
		teamDao.deleteById(id);
		return new CMRespDto<>(1, "팀삭제성공",null);
	}
	
	
	
	@PutMapping("/team/{id}/teamList")
	public @ResponseBody CMRespDto<?> updateteam(@PathVariable Integer id, Team team){
		teamDao.update(team);
		return new CMRespDto<>(1, "팀수정성공",null);
	}
	
	@GetMapping("/team/{id}/teamList")
	public String updateFormteam(@PathVariable Integer id, Model model) {
		Team team = teamDao.findById(id);
		model.addAttribute("team", team);
		return "/team/teamList";
	}
	
	@PostMapping("/team")
	public @ResponseBody CMRespDto<?> saveteam(@RequestBody Team team){
		teamDao.insert(team);
		return new CMRespDto<>(1, "팀생성성공", null);
	}
	
	
	@GetMapping("/team/teamList")
	public String getteamList(Model model) {
		model.addAttribute("team", teamDao.findAll());
		return "/team/teamList";
	}
	
	@GetMapping("/team/teamSaveForm")
	public String teamaveForm(Model model) {
		model.addAttribute("stadiums", stadiumsDao.findAll());
		return "/team/teamSaveForm";
	}
}