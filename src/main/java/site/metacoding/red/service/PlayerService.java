package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.player.PlayerSaveDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerDao;
	
	public List<Player> 선수목록보기(){
		return playerDao.findJoin();
	}
	
	public void 선수추가(PlayerSaveDto playerSaveDto) {
		Player player = playerSaveDto.toEntity();
		playerDao.insert(player);
	}
	
	public void 선수삭제(Integer id) {
		playerDao.deleteById(id);
	}
}
