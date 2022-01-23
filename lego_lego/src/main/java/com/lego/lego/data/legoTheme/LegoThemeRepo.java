package com.lego.lego.data.legoTheme;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LegoThemeRepo extends CrudRepository<LegoTheme,Integer>{
	@Query(value = "SELECT * FROM lego_theme t WHERE (t.name LIKE :name%) OR (SELECT name FROM lego_theme pt WHERE pt.id=t.parent_id) LIKE :name%",
			nativeQuery = true)
	List<LegoTheme> search(@Param("name") String name);
}
