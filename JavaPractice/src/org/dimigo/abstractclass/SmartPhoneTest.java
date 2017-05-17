/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 * 
 * @author BSH
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] a = {
		new IPhone("iPhone 7", "애플", 900000) , new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		for(int i = 0; i < 2; i++){
			func(a[i]);
		}
		
	}
	private static void func(SmartPhone a){
		System.out.println(a);
		a.TurnOn();
		a.pay();
		a.useSpecialFunction();
		a.TurnOff();
	}
}	
