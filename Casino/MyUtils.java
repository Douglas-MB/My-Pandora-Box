package project;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MyUtils {
	private static final Random RANDOM_OBJ = new Random();

	public static final String RESET_COLOR_TEXT = "\u001b[0m";


	public static int getRandomNum(int rangeMin, int rangeMax){
		return RANDOM_OBJ.nextInt(rangeMin, rangeMax);
	}

	public static char getRandomChar(){
		return (char) RANDOM_OBJ.nextInt(32, 256);
	}

	public static char getRandomChar(int rangeMin, int rangeMax){
		return (char) RANDOM_OBJ.nextInt(rangeMin, rangeMax);
	}

	public static char getRandomLetter(boolean upperCase){
		if (upperCase){
			return (char) RANDOM_OBJ.nextInt(65, 91);
		}
		return (char) RANDOM_OBJ.nextInt(97, 123);
	}

	public static String randomSeqChar(int sizeSeq){
		String sequence = "";
		for (int i = 0; i < sizeSeq; i++) {
			sequence += (char)RANDOM_OBJ.nextInt(32, 256);
		}
		return sequence;
	}

	public static Scanner newScan(){
		return new Scanner(System.in);
	}

	public static String printColoredText(){
		int red = RANDOM_OBJ.nextInt(256);
		int green = RANDOM_OBJ.nextInt(256);
		int blue = RANDOM_OBJ.nextInt(256);

		return String.format("\u001b[38;2;%d;%d;%dm", red, green, blue);
	}


	public static File getFileByName(String fileName, String pathPieceFile) {
		File currentDir = new File(pathPieceFile);
		File[] files = currentDir.listFiles();

		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				if (file.isFile() && file.getName().equals(fileName)) {
					return file;
				}
			}
		}

		return null;
	}

	public static String readFile(File filename) {
		StringBuilder content = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line = "";
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return content.toString();
	}

	public static void writeFile(File filename, String data) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			writer.write(data);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
