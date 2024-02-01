package io.dashboard.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dashboard.model.Data;
import io.dashboard.service.DataService;

@CrossOrigin
@RestController
@RequestMapping("/data")
public class DataController {
	
	@Autowired
	private DataService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Data>> findAll() {
		return new ResponseEntity<>(this.service.findAll(), HttpStatus.FOUND);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Data> findById(@PathVariable String id) {
		return new ResponseEntity<>(this.service.findById(id), HttpStatus.FOUND);
	}
	
	@GetMapping("/startyear/{year}")
	public ResponseEntity<List<Data>> findByStartYear(@PathVariable String year) {
		return new ResponseEntity<>(this.service.findByStartYear(year), HttpStatus.FOUND);
	}
	
	@GetMapping("/endyear/{year}")
	public ResponseEntity<List<Data>> findByEndYear(@PathVariable String year) {
		return new ResponseEntity<>(this.service.findByEndYear(year), HttpStatus.FOUND);
	}
	
	@GetMapping("/topic/{topic}")
	public ResponseEntity<List<Data>> findByTopic(@PathVariable String topic) {
		return new ResponseEntity<>(this.service.findByTopic(topic), HttpStatus.FOUND);
	}
	
	@GetMapping("/sector/{sector}")
	public ResponseEntity<List<Data>> findBySector(@PathVariable String sector) {
		return new ResponseEntity<>(this.service.findBySector(sector), HttpStatus.FOUND);
	}
	
	@GetMapping("/region/{region}")
	public ResponseEntity<List<Data>> findByRegion(@PathVariable String region) {
		return new ResponseEntity<>(this.service.findByRegion(region), HttpStatus.FOUND);
	}
	
	@GetMapping("/swot/{swot}")
	public ResponseEntity<List<Data>> findBySwot(@PathVariable String swot) {
		return new ResponseEntity<>(this.service.findBySwot(swot), HttpStatus.FOUND);
	}
	
	@GetMapping("/pestle/{pestle}")
	public ResponseEntity<List<Data>> findByPestle(@PathVariable String pestle) {
		return new ResponseEntity<>(this.service.findByPestle(pestle), HttpStatus.FOUND);
	}
	
	@GetMapping("/source/{source}")
	public ResponseEntity<List<Data>> findBySource(@PathVariable String source) {
		return new ResponseEntity<>(this.service.findBySource(source), HttpStatus.FOUND);
	}
	
	@GetMapping("/city/{city}")
	public ResponseEntity<List<Data>> findByCity(@PathVariable String city) {
		return new ResponseEntity<>(this.service.findByCity(city), HttpStatus.FOUND);
	}
	
	@GetMapping("/country/{country}")
	public ResponseEntity<List<Data>> findByCountry(@PathVariable String country) {
		return new ResponseEntity<>(this.service.findByCountry(country), HttpStatus.FOUND);
	}
	
	@GetMapping("/startyear/")
	public ResponseEntity<List<String>> findAllStartYear() {
		return new ResponseEntity<>(this.service.findAllStartYear(), HttpStatus.FOUND);
	}
	
	@GetMapping("/endyear/")
	public ResponseEntity<List<String>> findAllEndYear() {
		return new ResponseEntity<>(this.service.findAllEndYear(), HttpStatus.FOUND);
	}
	
	@GetMapping("/topic/")
	public ResponseEntity<List<String>> findAllTopic() {
		return new ResponseEntity<>(this.service.findAllTopic(), HttpStatus.FOUND);
	}
	
	@GetMapping("/sector/")
	public ResponseEntity<List<String>> findAllSector() {
		return new ResponseEntity<>(this.service.findAllSector(), HttpStatus.FOUND);
	}
	
	@GetMapping("/region/")
	public ResponseEntity<List<String>> findAllRegion() {
		return new ResponseEntity<>(this.service.findAllRegion(), HttpStatus.FOUND);
	}
	
	@GetMapping("/swot/")
	public ResponseEntity<List<String>> findAllSwot() {
		return new ResponseEntity<>(this.service.findAllSwot(), HttpStatus.FOUND);
	}
	
	@GetMapping("/pestle/")
	public ResponseEntity<List<String>> findAllPestle() {
		return new ResponseEntity<>(this.service.findAllPestle(), HttpStatus.FOUND);
	}
	
	@GetMapping("/source/")
	public ResponseEntity<List<String>> findAllSource() {
		return new ResponseEntity<>(this.service.findAllSource(), HttpStatus.FOUND);
	}
	
	@GetMapping("/city/")
	public ResponseEntity<List<String>> findAllCity() {
		return new ResponseEntity<>(this.service.findAllCity(), HttpStatus.FOUND);
	}
	
	@GetMapping("/country/")
	public ResponseEntity<List<String>> findAllCountry() {
		return new ResponseEntity<>(this.service.findAllCountry(), HttpStatus.FOUND);
	}
	
	@GetMapping("/filter/")
	public ResponseEntity<List<String>> findAllFilter() {
		return new ResponseEntity<>(this.service.findAllFilter(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/startyear/")
	public ResponseEntity<Map<String, Integer>> findStartYearFrequency() {
		return new ResponseEntity<>(this.service.findStartYearFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/endyear/")
	public ResponseEntity<Map<String, Integer>> findEndYearFrequency() {
		return new ResponseEntity<>(this.service.findEndYearFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/topic/")
	public ResponseEntity<Map<String, Integer>> findTopicFrequency() {
		return new ResponseEntity<>(this.service.findTopicFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/sector/")
	public ResponseEntity<Map<String, Integer>> findSectorFrequency() {
		return new ResponseEntity<>(this.service.findSectorFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/region/")
	public ResponseEntity<Map<String, Integer>> findRegionFrequency() {
		return new ResponseEntity<>(this.service.findRegionFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/swot/")
	public ResponseEntity<Map<String, Integer>> findSwotFrequency() {
		return new ResponseEntity<>(this.service.findSwotFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/pestle/")
	public ResponseEntity<Map<String, Integer>> findPestleFrequency() {
		return new ResponseEntity<>(this.service.findPestleFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/source/")
	public ResponseEntity<Map<String, Integer>> findSourceFrequency() {
		return new ResponseEntity<>(this.service.findSourceFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/city/")
	public ResponseEntity<Map<String, Integer>> findCityFrequency() {
		return new ResponseEntity<>(this.service.findCityFrequency(), HttpStatus.FOUND);
	}
	
	@GetMapping("/chart/country/")
	public ResponseEntity<Map<String, Integer>> findCountry() {
		return new ResponseEntity<>(this.service.findCountryFrequency(), HttpStatus.FOUND);
	}
}
