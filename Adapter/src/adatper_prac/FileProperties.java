package adatper_prac;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO{
	
	private Properties properties = new Properties();

	@Override
	public void readFromFile(String filename) throws IOException {
		properties.load(new FileReader(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		properties.store(new FileWriter(filename), "Written by Properties.");
	}

	@Override
	public void setValue(String key, String value) {
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return properties.getProperty(key);
	}
	
}
