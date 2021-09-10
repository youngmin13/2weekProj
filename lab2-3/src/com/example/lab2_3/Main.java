package com.example.lab2_3;

import java.util.ArrayList; //command + shift + o 임포트 자동
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list= new ArrayList<Student>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("홍길동 ");
		s.setAge(20);
		list.add(s);
		list.add(new Student(2,"철수", 22));
		
		//list 데이터 출력
		
		for(int i = 0; i < list.size(); i++)	//순서대로 
		{
			System.out.println(list.get(i).toString());
		}
		
		list.remove(1); //철수 삭제 
		
		for(Student ss : list)	//for each
		{
			System.out.println(ss.toString());
		}
		
		
		
	}

}
