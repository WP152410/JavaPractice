/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author BSH
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions =  {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers =  {"없음", "없음", "수학"};
		int k;
		for(k = 0; k < 3; k++){
		System.out.printf("%d.", k+1);
		System.out.println( questions[k]);
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(answer.equals(answers[k])){
			System.out.println("정답입니다!");
		}
		else{
		 System.out.println("틀렸습니다!");
		}
		}
		
		System.out.println("<<결과 출력>>");
		//for(k = 0; k < 3; k++){
		//	System.out.println(questions[k] + " " + answers[k] + "입니다.");
		//}
		StringBuilder sb0 = new StringBuilder();
		sb0.append(questions[0]).append(" ").append(answers[0]).append("입니다.");
		System.out.println(sb0);
		StringBuilder sb1 = new StringBuilder();
		sb1.append(questions[1]).append(" ").append(answers[1]).append("입니다.");
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder();
		sb2.append(questions[2]).append(" ").append(answers[2]).append("입니다.");
		System.out.println(sb2);
		
	}

}
