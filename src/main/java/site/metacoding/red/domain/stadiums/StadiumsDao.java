package site.metacoding.red.domain.stadiums;

import java.util.List;

public interface StadiumsDao {
	public void insert(Stadiums stardiums);
	public List<Stadiums> findAll();
	public Stadiums findById(Integer id);
	public void update(Stadiums stardiums);
	public void deleteById(Integer id);
}
