package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.expulsion.ExpulsionDao;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.expulsion.ExpulsionDto;
import site.metacoding.red.web.dto.player.PlayerDto;
import site.metacoding.red.web.dto.player.PlayerSaveDto;
import site.metacoding.red.web.dto.position.PositionDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerDao;
	private final TeamDao teamDao;
	

	
	public List<PlayerDto> 선수목록보기(){
		return playerDao.findJoin();
	}
	
	public List<Team> 선수등록후팀목록보기() {
		return teamDao.findAll();
	}
	
	public void 선수추가(PlayerSaveDto playerSaveDto) {
		Player player = playerSaveDto.toEntity(playerSaveDto.getTeamId(), playerSaveDto.getPlayerName(), playerSaveDto.getPosition());
		playerDao.insert(player);
	}
	

	
	
	public void 선수제명(Integer id) {
		playerDao.deleteById(id);
	}
	
	public List<PositionDto> 포지션별선수보기() {
		return playerDao.findByPosition();
	}
	

	
}
