package io.dashboard.service;

import java.util.List;
import java.util.Map;

import io.dashboard.model.Data;

public interface DataService {
	
	public Data findById(String entryId);
	public List<Data> findAll();
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
	
	// APIs for filtering
	public List<String> findAllStartYear();
	public List<String> findAllEndYear();
	public List<String> findAllTopic();
	public List<String> findAllSector();
	public List<String> findAllRegion();
	public List<String> findAllSwot();
	public List<String> findAllPestle();
	public List<String> findAllSource();
	public List<String> findAllCity();
	public List<String> findAllCountry();
	public List<String> findAllFilter();
	
	// APIs for charts
	public Map<String, Integer> findStartYearFrequency();
	public Map<String, Integer> findEndYearFrequency();
	public Map<String, Integer> findTopicFrequency();
	public Map<String, Integer> findSectorFrequency();
	public Map<String, Integer> findRegionFrequency();
	public Map<String, Integer> findSwotFrequency();
	public Map<String, Integer> findPestleFrequency();
	public Map<String, Integer> findSourceFrequency();
	public Map<String, Integer> findCityFrequency();
	public Map<String, Integer> findCountryFrequency();
	
}
