package io.dashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Data {

	@Id
	private String entryId;
	private String endYear; 
	private String cityLng; 
	private String cityLat; 
	private String intensity; 
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private String startYear;
	private String impact;
	private String added;
	private String published;
	private String city;
	private String country;
	private String relevance;
	private String pestle;
	private String source;
	private String title;
	private String likelihood;
	
}
