package com.brs.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.brs.entity.Bus;

@Repository
public interface IBusRepository extends JpaRepository<Bus, String>{
	@Modifying
	@Query("delete from Bus bus where bus.busid=:nn")
	public int deleteByUsername(@Param("nn") int busid);
	public Bus findById(int busId);
	public Object findOne(String busType);
	
}