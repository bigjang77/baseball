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
import site.metacoding.red.web.dto.team.TeamDto;
import site.metacoding.red.web.dto.team.TeamSaveDto;


@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	
	@DeleteMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> deleteTeam(@PathVariable Integer id){
		teamService.팀삭제(id);
		return new CMRespDto<>(1, "팀삭제성공",null);
	}

	
	@PostMapping("/team/save")
	public @ResponseBody CMRespDto<?> saveTeam(@RequestBody TeamSaveDto teamSaveDto){
		teamService.팀추가(teamSaveDto);
		return new CMRespDto<>(1, "팀생성성공", null);
	}
		
	
	@GetMapping("/team/teamList")
	public String teamList(Model model) {
		List<TeamDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "/team/teamList";
	}
	

	@GetMapping("/team/teamSaveForm")
	public String teamSaveForm(Model model) {
		List<Stadium> stadiumList = teamService.팀등록후구장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "/team/teamSaveForm";
	}
}