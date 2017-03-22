package test.resources.java8streams_jobs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import test.java.TestTask;

public class SimpleLogAnalyzer extends TestTask{
	
	public StringBuilder doTask(String inputFile) {
		StringBuilder builder = new StringBuilder();
		try{
			Stream<String> myStream = Files.lines(Paths.get(inputFile));
			long lines = 0;
			myStream.filter(s -> s.contains("Sherbrooke"))
					.map(l -> l)
					.filter(s -> s.length()>10);
					//.count();
			builder.append(lines);
			myStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 		
		return builder;
	}
}