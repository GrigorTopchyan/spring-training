package edu.training.spring.loading_external_resource_sample;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.core.io.Resource;

import com.google.common.collect.Streams;

public class CustomResourceLoader {
	
	private Resource banner;
		
	public Resource getBanner() {
		return banner;
	}

	public void setBanner(Resource banner) {
		this.banner = banner;
	}

	public void showResourceData() throws IOException{
		Scanner scanner = new Scanner(banner.getInputStream());
		scanner.useDelimiter("\\n");
		Streams.stream(scanner)
			   .filter(line -> line.contains("bean"))
			   .map(line -> line.toUpperCase())
			   .forEach(System.out::println);
	}
}
