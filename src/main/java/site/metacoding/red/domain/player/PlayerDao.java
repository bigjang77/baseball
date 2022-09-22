package site.metacoding.red.domain.player;

import java.util.List;

public interface PlayerDao {
	public void insert(Player players);
	public List<Player> findAll();
	public Player findById(Integer id);
	public void update(Player players);
	public void deleteById(Integer id);
}
