package adatper_prac;

import java.io.IOException;

public class AdapterTester {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("C:\\Users\\te02\\Desktop\\oka\\Java_DesignPattern\\workspace\\Adapter\\src\\adatper_prac/file.txt");
			f.setValue("Width", "1024");
			f.setValue("height","512");
			f.setValue("depth", "32");
			f.writeToFile("newfile.txt");
			System.out.println("newfile.txt is created!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
