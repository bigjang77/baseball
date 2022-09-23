package site.metacoding.red.domain.team;

import java.util.List;

public interface TeamDao {
	public void insert(Team teams);
	public List<Team> findAll();
	public List<Team> findJoin();
	public Team findById(Integer id);
	public void update(Team teams);
	public void deleteById(Integer id);
}
