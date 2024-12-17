package com.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\text file\\text1.txt");
		FileWriter fw = new FileWriter("C:\\text file\\text2.txt");
		int ch;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
        fr.close();
        fw.close();
        System.out.println("file copied");
	}


}
