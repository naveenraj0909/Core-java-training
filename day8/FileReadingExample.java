package com.day8;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\text file\\text1.txt");
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
        fr.close();
	}

}
