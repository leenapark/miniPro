package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		ArrayList<Contact> cList = new ArrayList<Contact>();

		Reader ph = new FileReader("C:\\javaStudy\\강의자료\\02.java_programming\\minipro\\PhoneDB.txt");
		BufferedReader userph = new BufferedReader(ph);

		Writer fw = new FileWriter("C:\\javaStudy\\강의자료\\02.java_programming\\minipro\\PhoneDB2.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		int no = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("*********************************");
		System.out.println("*       전화번호 관리 프로그램               *");
		System.out.println("*********************************");
		System.out.println("");

		while (true) {

			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			System.out.println("--------------------------------");
			System.out.print(">메뉴번호:");
			String menu = sc.nextLine();

			
			if ("5".equals(menu)) {
				break;
			} else if ("1".equals(menu)) {
				// 리스트
				System.out.println("<1.리스트>");
				// cList.add();
				while (true) {
					String list = userph.readLine();

					if (list == null) {
						break;
					}
					String[] data = list.split(",");
					Contact exilist = new Contact(no, data[0], data[1], data[2]);
					no++;
					
					cList.add(exilist);
				}
				for (int i = 0; i < cList.size(); i++) {
					cList.get(i).showInfo();
				}
				System.out.println("");
			} else if ("2".equals(menu)) {
				// 등록
				System.out.println("<2.등록>");
				System.out.print(">이름:");
				Scanner sc2 = new Scanner(System.in);
				String name = sc2.nextLine();
				System.out.print(">휴대전화:");
				String hp = sc2.nextLine();
				System.out.print(">회사전화:");
				String company = sc2.nextLine();

				Contact enroll = new Contact(no, name, hp, company);

				cList.add(enroll);

			}

		}
		
		bw.close();
		ph.close();
		sc.close();

	}
}
