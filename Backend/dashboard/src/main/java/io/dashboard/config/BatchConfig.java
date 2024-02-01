package io.dashboard.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import io.dashboard.model.Data;

@Configuration
public class BatchConfig {
	
	@Bean
	public Job job(JobRepository jobRepository, JobCompletionNotificationImpl listener, Step step) {
		return new JobBuilder("Import-Data-Job", jobRepository)
				.listener(listener)
				.start(step)
				.build();
	}
	
	@Bean
	public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager, ItemReader<Data> reader, ItemProcessor<Data, Data> processor, ItemWriter<Data> writer) {
		return new StepBuilder("Import-Data-Job-Step", jobRepository)
				.<Data, Data>chunk(10, transactionManager)
				.reader(reader)
				.processor(processor)
				.writer(writer)
				.build();
	}
	
	@Bean
	public FlatFileItemReader<Data> reader(){
		return new FlatFileItemReaderBuilder<Data>()
				.name("itemReader")
				.resource(new ClassPathResource("Data.csv"))
				.linesToSkip(1)
				.delimited()
				.names("end_year", "citylng", "citylat", "intensity", "sector", "topic", "insight", "swot", "url", "region", "start_year", "impact", "added", "published", "city", "country", "relevance", "pestle", "source", "title", "likelihood")
				.targetType(Data.class)
				.build();
	}
	
	@Bean
	public ItemProcessor<Data, Data> itemProcessor(){
		return new CustomItemProcessor();
	}
	
	@Bean
	public ItemWriter<Data> itemWriter(DataSource dataSource){
		return new JdbcBatchItemWriterBuilder<Data>()
		.sql("INSERT INTO data (entry_id, end_year, citylng, citylat, intensity, sector, topic, insight, swot, url, region, start_year, impact, added, published, city, country, relevance, pestle, source, title, likelihood) VALUES (:entryId, :endYear, :cityLng, :cityLat, :intensity, :sector, :topic, :insight, :swot, :url, :region, :startYear, :impact, :added, :published, :city, :country, :relevance, :pestle, :source, :title, :likelihood)")
		.dataSource(dataSource)
		.beanMapped()
		.build();
	}
	
}
