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
import site.metacoding.red.domain.players.PlayersDao;
import site.metacoding.red.domain.players.Players;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class PlayersController {
	
	private final PlayersDao playersDao;
	
	
	@DeleteMapping("/players/{id}")
	public @ResponseBody CMRespDto<?> deleteplayers(@PathVariable Integer id){
		playersDao.deleteById(id);
		return new CMRespDto<>(1, "팀삭제성공",null);
	}
	
	
	
	@PutMapping("/players/{id}/playerList")
	public @ResponseBody CMRespDto<?> updateplayers(@PathVariable Integer id, Players players){
		playersDao.update(players);
		return new CMRespDto<>(1, "팀수정성공",null);
	}
	
	@GetMapping("/players/{id}/playersList")
	public String updateFormplayers(@PathVariable Integer id, Model model) {
		Players players = playersDao.findById(id);
		model.addAttribute("players", players);
		return "/players/playersList";
	}
	
	@PostMapping("/players")
	public @ResponseBody CMRespDto<?> saveplayers(@RequestBody Players players){
		playersDao.insert(players);
		return new CMRespDto<>(1, "팀생성성공", null);
	}
	
	
	@GetMapping("/players/playersList")
	public String getplayersList(Model model) {
		model.addAttribute("players", playersDao.findAll());
		return "/players/playersList";
	}
	
	@GetMapping("/players/playersSaveForm")
	public String playerSaveForm() {
		return "/players/playersSaveForm";
	}
}
