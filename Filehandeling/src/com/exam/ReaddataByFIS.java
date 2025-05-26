package com.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReaddataByFIS {

	public static void main(String[] args) throws IOException{
		File f=new File("D:\\ds\\new\\B.txt");
		FileInputStream fis=new FileInputStream(f);
		if(f.canRead()) {
			int n=fis.read();
			while(n!=-1) {
				System.out.print((char)n);
				n=fis.read();
			}
		}
		else {
			System.out.println("we can't read the data");
		}
		fis.close();

	}

}
