package site.metacoding.red.domain.explusion;

import java.util.List;

public interface ExplusionDao {
	public void insert(Explusion explusion);
	public List<Explusion> findAll();
	public Explusion findById(Integer id);
	public void update(Explusion explusion);
	public void deleteById(Integer id);
}
