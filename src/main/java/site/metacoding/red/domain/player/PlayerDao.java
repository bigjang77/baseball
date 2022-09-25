package site.metacoding.red.domain.player;

import java.util.List;

import site.metacoding.red.web.dto.player.PlayerDto;
import site.metacoding.red.web.dto.position.PositionDto;

public interface PlayerDao {
	public void insert(Player players);
	public List<Player> findAll();
	public List<PlayerDto> findJoin();
	public Player findById(Integer id);
	public void update(Player players);
	public void deleteById(Integer id);
	public List<PositionDto> findByPosition();
}
