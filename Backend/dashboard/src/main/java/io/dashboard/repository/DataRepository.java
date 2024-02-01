package io.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.dashboard.model.Data;

public interface DataRepository extends JpaRepository<Data, String>{
	
	// custom finder methods
	public List<Data> findByStartYear(String startYear);
	public List<Data> findByEndYear(String endYear);
	public List<Data> findByTopic(String topic);
	public List<Data> findBySector(String sector);
	public List<Data> findByRegion(String region);
	public List<Data> findBySwot(String swot);
	public List<Data> findByPestle(String pestle);
	public List<Data> findBySource(String source);
	public List<Data> findByCity(String city);
	public List<Data> findByCountry(String country);
}
