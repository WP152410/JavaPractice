/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 * 
 * @author BSH
 * @version : 1.0
 */

	
	
public class SnackTest {
	int sum = 0;
	public void printArray(Snack[] arr){
		for(Snack value : arr){
			System.out.print(value + "\n\n");
			sum = sum + value.calcPrice();
		}	
	}
	public static void main(String[] args) {
	SnackTest obj = new SnackTest();
	Snack[] snackArr = new Snack[3];
	snackArr[0] = new Snack("새우깡", "농심", 1100, 2);
	snackArr[1] = new Snack("콘칲", "크라운", 1200, 1);
	snackArr[2] = new Snack("허니버터칩", "해태", 1500, 4);
	obj.printArray(snackArr);
	System.out.println("총 구매 금액 " + String.format("%,d", obj.sum));
	}

}
