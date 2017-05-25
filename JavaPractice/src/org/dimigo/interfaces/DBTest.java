/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author BSH
 * @version : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		IDBManager[] DB = {
				IDBManager.getDBObject(IDBManager.SYBASE_DATABASE),
				IDBManager.getDBObject(IDBManager.ORACLE_DATABASE)
		};
		for(IDBManager a : DB){
			crud(a);
		}
	}
	private static void crud(IDBManager db){
		if(db instanceof SybaseDB){
			System.out.println("<<변경 전>>");
		}
		else if(db instanceof OracleDB){
			System.out.println("<<변경 후>>");
		}
		db.insert();
		db.search();
		db.update();
		db.delete();
		System.out.println();
	}
}
