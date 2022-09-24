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
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.player.PlayerSaveDto;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final TeamService teamService;
	
	
	@DeleteMapping("/player/{id}")
	public @ResponseBody CMRespDto<?> deletePlayer(@PathVariable Integer id){
		playerService.선수삭제(id);
		return new CMRespDto<>(1, "선수삭제성공",null);
	}
	

	/*
	 * @PutMapping("/player/{id}/playerList") public @ResponseBody CMRespDto<?>
	 * updatePlayer(@PathVariable Integer id, Player player){
	 * playerDao.update(player); return new CMRespDto<>(1, "선수정성공",null); }
	 * 
	 * @GetMapping("/player/{id}/playerList") public String
	 * updateFormPlayer(@PathVariable Integer id, Model model) { Player player =
	 * playerDao.findById(id); model.addAttribute("players", player); return
	 * "/player/playerList"; }
	 */
	
	@PostMapping("/player")
	public @ResponseBody CMRespDto<?> savePlayer(@RequestBody PlayerSaveDto playerSaveDto){
		playerService.선수추가(playerSaveDto);
		return new CMRespDto<>(1, "선수생성성공", null);
	}
	

	@GetMapping("/player/playerList")
	public String playerList(Model model) {
		List<Player> playerList = playerService.선수목록보기();
		model.addAttribute("playerList", playerList);
		return "/player/playerList";
	}
	
	@GetMapping("/player/playerSaveForm")
	public String playerSaveForm(Model model) {
		List<Team> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "/player/playerSaveForm";
	}
	
}
