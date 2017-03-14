/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author BSH
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long pay = 1700000;
		long mem = 3;
		long store = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여: %,d원\n", pay);
		System.out.printf("점포 내 직원 수: %d명\n", mem);
		System.out.printf("점포 수: %,d개\n\n\n", store);
		System.out.printf("연간 인건비: %,d원", pay * mem* 12 * store);
		
	}

}
