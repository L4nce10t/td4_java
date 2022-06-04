package Exercice_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class StaticLogger {
	private static String DIR = "output";
	private static String LOGS_FILE_PATH = "staticLog.txt";

	public static void write(Level l, String error) {
		writeToFile(l, error, DIR + "\\" + LOGS_FILE_PATH);
	}

	private static void writeToFile(Level l, String error, String fileName) {
		try {
			FileWriter fileWriter = new FileWriter(fileName, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write("[" + l + "]: " + error + "\n");
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
