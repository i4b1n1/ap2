package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository extends CrudRepository<News, Long> {

	@Query(value="SELECT * FROM news order by date LIMIT :number", nativeQuery = true)
	List<News> getNumberOfNewses(@Param("number")int number);

}
