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
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.team.TeamSaveDto;


@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	
	@DeleteMapping("/team/")
	public @ResponseBody CMRespDto<?> deleteTeam(@PathVariable Integer id){
		teamService.팀삭제(id);
		return new CMRespDto<>(1, "팀삭제성공",null);
	}
	
	
	/*
	 * @PutMapping("/team/{id}/teamList") public @ResponseBody CMRespDto<?>
	 * updateTeam(@PathVariable Integer id, Team team){ teamDao.update(team); return
	 * new CMRespDto<>(1, "팀수정성공",null); }
	 * 
	 * @GetMapping("/team/{id}/teamList") public String updateFormTeam(@PathVariable
	 * Integer id, Model model) { Team team = teamDao.findById(id);
	 * model.addAttribute("team", team); return "/team/teamList"; }
	 */
	
	@PostMapping("/team")
	public @ResponseBody CMRespDto<?> saveTeam(@RequestBody TeamSaveDto teamSaveDto){
		teamService.팀추가(teamSaveDto);
		return new CMRespDto<>(1, "팀생성성공", null);
	}
		
	
	@GetMapping("/team/teamList")
	public String teamList(Model model) {
		List<Team> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "/team/teamList";
	}
	

	@GetMapping("/team/teamSaveForm")
	public String teamSaveForm(Model model) {
		List<Stadium> stadiumList = stadiumService.야구장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "/team/teamSaveForm";
	}
}