package Exercice_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class SingletonFileLogger implements ILogger {
	private static final String DIR = "output";
	private static final String LOGS_FILE_PATH = "singletonLog.txt";
	private static SingletonFileLogger logger;

	private SingletonFileLogger() {
	}

	public static synchronized SingletonFileLogger getInstance() {
		return logger = new SingletonFileLogger();
	}

	public void write(Level l, String error) {
		writeToFile(l, error, DIR + "\\" + LOGS_FILE_PATH);
	}

	private void writeToFile(Level l, String error, String fileName) {
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
