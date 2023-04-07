package com.javalab.fileio.pkg03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 문자 입출력 FileReader , BufferedReader 클래스
 * - 문자를 2byte씩 읽어들임
 */
public class BufferedReaderEx1 {

	public static void main(String[] args) {
		try {
			// 파일 객체 생성
			File file = new File("C:/filetest/123.txt"); // 절대경로
			// FileReader : 리더기의 큰아들
			FileReader fr = new FileReader(file);
			// BufferedReader : 보조 프로그램 성능을 향상시켜 줌
			BufferedReader br = new BufferedReader(fr);
			
			/*
			String line = "";
			for (int i = 1;(line = br.readLine())!=null; i++) {
				System.out.println(i + ":" + line);
			}
			*/
			
			int lineNo = 1;
			while (true) {
				String str = br.readLine(); // 한 행을 읽어들임
				if (str == null) break; // while문 빠져나감
				System.out.println(lineNo + "\t" + str);
				lineNo++;
					
			}
			
			// finally문 안에 작성해야 함
			br.close(); // BufferedReader 닫음 
		} catch (IOException e) {}

	}

}
