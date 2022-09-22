package site.metacoding.red.domain.players;

import java.util.List;

public interface PlayersDao {
	public void insert(Players players);
	public List<Players> findAll();
	public Players findById(Integer id);
	public void update(Players players);
	public void deleteById(Integer id);
}
