package site.metacoding.red.domain.expulsion;

import java.util.List;

import site.metacoding.red.web.dto.expulsion.ExpulsionDto;

public interface ExpulsionDao {
	public void insert(Expulsion explusion);
	public List<Expulsion> findAll();
	public List<ExpulsionDto> findJoin();
	public Expulsion findById(Integer id);
	public void update(Expulsion explusion);
	public void deleteById(Integer id);
}
