package site.metacoding.red.domain.teams;

import java.util.List;

public interface TeamsDao {
	public void insert(Teams teams);
	public List<Teams> findAll();
	public Teams findById(Integer id);
	public void update(Teams teams);
	public void deleteById(Integer id);
}
