package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopying {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\text file\\chota.jpg");
		FileOutputStream fo = new FileOutputStream("C:\\text file\\chota1.jpg");
		int ch;
		while((ch = fi.read()) != -1) {
			fo.write(ch);
		}
        fi.close();
        fo.close();
        System.out.println("image copied");
	}


}
