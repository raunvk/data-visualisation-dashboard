package io.dashboard.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.dashboard.exception.ResourceNotFoundException;
import io.dashboard.model.Data;
import io.dashboard.repository.DataRepository;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private DataRepository repository;
	
	@Override
	public List<Data> findAll() {
		return this.repository.findAll();
	}
	
	@Override
	public Data findById(String entryId) {
		return this.repository.findById(entryId).orElseThrow(() -> new ResourceNotFoundException("Data", "EntryId", entryId));
	}

	@Override
	public List<Data> findByStartYear(String startYear) {
		if(this.repository.findByStartYear(startYear).isEmpty())
			throw new ResourceNotFoundException("Data", "StartYear", startYear);
		return this.repository.findByStartYear(startYear);
	}

	@Override
	public List<Data> findByEndYear(String endYear) {
		if(this.repository.findByEndYear(endYear).isEmpty())
			throw new ResourceNotFoundException("Data", "EndYear", endYear);
		return this.repository.findByEndYear(endYear);
	}

	@Override
	public List<Data> findByTopic(String topic) {
		if(this.repository.findByTopic(topic).isEmpty())
			throw new ResourceNotFoundException("Data", "Topic", topic);
		return this.repository.findByTopic(topic);
	}

	@Override
	public List<Data> findBySector(String sector) {
		if(this.repository.findBySector(sector).isEmpty())
			throw new ResourceNotFoundException("Data", "Sector", sector);
		return this.repository.findBySector(sector);
	}

	@Override
	public List<Data> findByRegion(String region) {
		if(this.repository.findByRegion(region).isEmpty())
			throw new ResourceNotFoundException("Data", "Region", region);
		return this.repository.findByRegion(region);
	}

	@Override
	public List<Data> findBySwot(String swot) {
		if(this.repository.findBySwot(swot).isEmpty())
			throw new ResourceNotFoundException("Data", "Swot", swot);
		return this.repository.findBySwot(swot);
	}

	@Override
	public List<Data> findByPestle(String pestle) {
		if(this.repository.findByPestle(pestle).isEmpty())
			throw new ResourceNotFoundException("Data", "Pestle", pestle);
		return this.repository.findByPestle(pestle);
	}

	@Override
	public List<Data> findBySource(String source) {
		if(this.repository.findBySource(source).isEmpty())
			throw new ResourceNotFoundException("Data", "Source", source);
		return this.repository.findBySource(source);
	}

	@Override
	public List<Data> findByCity(String city) {
		if(this.repository.findByCity(city).isEmpty())
			throw new ResourceNotFoundException("Data", "City", city);
		return this.repository.findByCity(city);
	}

	@Override
	public List<Data> findByCountry(String country) {
		if(this.repository.findByCountry(country).isEmpty())
			throw new ResourceNotFoundException("Data", "Country", country);
		return this.repository.findByCountry(country);
	}

	@Override
	public List<String> findAllStartYear() {
		List<String> allStartYear = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allStartYear.contains(d.getStartYear()) && !d.getStartYear().equals("")) allStartYear.add(d.getStartYear());
		}
		return allStartYear;
	}

	@Override
	public List<String> findAllEndYear() {
		List<String> allEndYear = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allEndYear.contains(d.getEndYear()) && !d.getEndYear().equals("")) allEndYear.add(d.getEndYear());
		}
		return allEndYear;
	}
	
	@Override
	public List<String> findAllTopic() {
		List<String> allTopic = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allTopic.contains(d.getTopic()) && !d.getTopic().equals("")) allTopic.add(d.getTopic());
		}
		return allTopic;
	}
	
	@Override
	public List<String> findAllSector() {
		List<String> allSector = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allSector.contains(d.getSector()) && !d.getSector().equals("")) allSector.add(d.getSector());
		}
		return allSector;
	}

	@Override
	public List<String> findAllRegion() {
		List<String> allRegion = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allRegion.contains(d.getRegion()) && !d.getRegion().equals("")) allRegion.add(d.getRegion());
		}
		return allRegion;
	}

	@Override
	public List<String> findAllSwot() {
		List<String> allSwot = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allSwot.contains(d.getSwot()) && !d.getSwot().equals("")) allSwot.add(d.getSwot());
		}
		return allSwot;
	}

	@Override
	public List<String> findAllPestle() {
		List<String> allPestle = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allPestle.contains(d.getPestle())&& !d.getPestle().equals("")) allPestle.add(d.getPestle());
		}
		return allPestle;
	}

	@Override
	public List<String> findAllSource() {
		List<String> allSource = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allSource.contains(d.getSource()) && !d.getSource().equals("")) allSource.add(d.getSource());
		}
		return allSource;
	}

	@Override
	public List<String> findAllCity() {
		List<String> allCity = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allCity.contains(d.getCity()) && !d.getCity().equals("")) allCity.add(d.getCity());
		}
		return allCity;
	}

	@Override
	public List<String> findAllCountry() {
		List<String> allCountry = new ArrayList<>();
		for(Data d : this.repository.findAll()) {
			if (!allCountry.contains(d.getCountry()) && !d.getCountry().equals("")) allCountry.add(d.getCountry());
		}
		return allCountry;
	}

	@Override
	public List<String> findAllFilter() {
		List<String> allFilters = new ArrayList<>();
		allFilters.add("topic"); allFilters.add("source"); allFilters.add("sector"); allFilters.add("pestle"); allFilters.add("city"); allFilters.add("country"); allFilters.add("region"); allFilters.add("swot"); allFilters.add("startyear"); allFilters.add("endyear");
		return allFilters;
	}

	@Override
	public Map<String, Integer> findStartYearFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getStartYear().equals("")) frequencyMap.put(d.getStartYear(), frequencyMap.getOrDefault(d.getStartYear(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findEndYearFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getEndYear().equals("")) frequencyMap.put(d.getEndYear(), frequencyMap.getOrDefault(d.getEndYear(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findTopicFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getTopic().equals("")) frequencyMap.put(d.getTopic(), frequencyMap.getOrDefault(d.getTopic(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findSectorFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getSector().equals("")) frequencyMap.put(d.getSector(), frequencyMap.getOrDefault(d.getSector(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findRegionFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getRegion().equals("")) frequencyMap.put(d.getRegion(), frequencyMap.getOrDefault(d.getRegion(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findSwotFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getSwot().equals("")) frequencyMap.put(d.getSwot(), frequencyMap.getOrDefault(d.getSwot(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findPestleFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getPestle().equals("")) frequencyMap.put(d.getPestle(), frequencyMap.getOrDefault(d.getPestle(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findSourceFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getSource().equals("")) frequencyMap.put(d.getSource(), frequencyMap.getOrDefault(d.getSource(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findCityFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getCity().equals("")) frequencyMap.put(d.getCity(), frequencyMap.getOrDefault(d.getCity(), 0) + 1);
		}
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> findCountryFrequency() {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(Data d : this.repository.findAll()) {
			if(!d.getCountry().equals("")) frequencyMap.put(d.getCountry(), frequencyMap.getOrDefault(d.getCountry(), 0) + 1);
		}
		return frequencyMap;
	}
}
