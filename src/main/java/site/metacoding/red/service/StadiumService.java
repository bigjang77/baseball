package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.stadium.StadiumSaveDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	private final StadiumDao stadiumDao;
	
	public List<Stadium> 야구장목록보기(){
		return stadiumDao.findAll();
	}
	
	public void 야구장추가(StadiumSaveDto stadiumSaveDto) {
		Stadium stadium = stadiumSaveDto.toEntity();
		stadiumDao.insert(stadium);
	}
	
	public void 야구장삭제(Integer id) {
		stadiumDao.deleteById(id);
	}
}
