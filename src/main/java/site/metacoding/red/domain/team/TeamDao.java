package site.metacoding.red.domain.team;

import java.util.List;

import site.metacoding.red.web.dto.team.TeamDto;

public interface TeamDao {
	public void insert(Team teams);
	public List<Team> findAll();
	public List<TeamDto> findJoin();
	public Team findById(Integer id);
	public void update(Team teams);
	public void deleteById(Integer id);
}
