package com.kh.practice.student.view;

import java.util.Arrays;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {	
	
	private StudentController ssm = new StudentController();
	
	
	public StudentMenu() {
		
		System.out.println("========== 학생 정보 출력 ==========");
		
		for(int i = 0; i < ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());			
		}				
		System.out.println();//개행
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : " + (int)ssm.avgScore()[0]);
		System.out.println("학생 점수 : " + ssm.avgScore()[1]);
		
		System.out.println();//개행
		
		System.out.println("========== 성적 결과 출력 ==========");
		for(int i = 0; i < ssm.printStudent().length; i++) {
			if(ssm.CUT_LINE <= ssm.printStudent()[i].getScore()) {
				System.out.println(ssm.printStudent()[i].getName()
						+ "학생은 통과입니다.");
				}else { System.out.println(ssm.printStudent()[i].getName()
								+ "학생은 재시험 대상입니다.");
				}//else문 끝
		}// for문 끝 
		
	}

}
