package io.dashboard.config;

import org.springframework.batch.item.ItemProcessor;

import io.dashboard.model.Data;

public class CustomItemProcessor implements ItemProcessor<Data, Data>{
	
	private Integer id = 1;
	
	@Override
	public Data process(Data item) throws Exception {
		item.setEntryId(Integer.toString(this.id));
		this.id++;
		return item;
	}
}
