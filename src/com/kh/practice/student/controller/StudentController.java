package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	// Student타입 참조변수끼리 모아놓은 배열 선언
	private Student[] sArr = new Student[5];	
	//커트라인 상수
	public static final int CUT_LINE = 60;
	
	
	//생성자부
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);		
	}
	
	
	public Student[] printStudent() {
		return this.sArr;
	}
	
	public int sumScore() {
		int sum = 0;			
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	
	public double[] avgScore() {		
		double[] dArr = new double[2];
		dArr[0] = sumScore();
		dArr[1] = sumScore()/5;
		return dArr;
	}
	

}
