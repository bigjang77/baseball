package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.stadium.StadiumSaveDto;
import site.metacoding.red.web.dto.team.TeamDto;
import site.metacoding.red.web.dto.team.TeamSaveDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamDao teamDao;
	private final StadiumDao stadiumDao;
	
	public List<TeamDto> 팀목록보기(){
		return teamDao.findJoin();
	}
	
	public void 팀추가(TeamSaveDto teamSaveDto) {
		Team team = teamSaveDto.toEntity(teamSaveDto.getStadiumId(), teamSaveDto.getTeamName());
		teamDao.insert(team);
	}
	
	public List<Stadium> 팀등록후구장목록보기() {
		return stadiumDao.findAll();
	}
	
	public void 팀삭제(Integer id) {
		teamDao.deleteById(id);
	}
}
