package com.xiets;
import static org.junit.Assert.*;
import org.junit.Test;


public class testPerson {

	@Test
	public void testname(){
		Person1 p1=new Person1();
		p1.setName("name1");
		assertEquals("name1",p1.getName());
	}

	@Test
	/*
	 * 测试正确，错误，总题数分别为（1，1，2）的情况测试正确。
	 */
	public void testnumber1() {
		Person1 p1=new Person1("name1");
		p1.addrightnumber();
		p1.addwrongnumber();
		assertEquals(1,p1.getRightnumber());
		assertEquals(1,p1.getWrongnumber());
		assertEquals(2,p1.getTotalnumber());
	}
	
	@Test
	/*
	 * 边缘测试，测试（0,0,0）的情况
	 */
	public void testanumber2() {
		Person1 p2=new Person1("name2");
		assertEquals(0,p2.getRightnumber());
		assertEquals(0,p2.getWrongnumber());
		assertEquals(0,p2.getTotalnumber());
	}

}
