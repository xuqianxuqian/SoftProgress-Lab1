package com.xiets;
import static org.junit.Assert.*;

import org.junit.Test;


public class testPerson2 {

	@Test
	public void testname(){
		Person2 p1=new Person2();
		p1.setName("name1");
		assertEquals("name1",p1.getName());
	}

	@Test
	/*
	 * ������ȷ�������������ֱ�Ϊ��1��1��2�������������ȷ��
	 */
	public void testnumber1() {
		Person2 p1=new Person2("name1");
		p1.addrightnumber();
		p1.addwrongnumber();
		assertEquals(1,p1.getRightnumber());
		assertEquals(1,p1.getWrongnumber());
		assertEquals(2,p1.getTotalnumber());
	}
	
	@Test
	/*
	 * ��Ե���ԣ����ԣ�0,0,0�������
	 */
	public void testanumber2() {
		Person2 p2=new Person2("name2");
		assertEquals(0,p2.getRightnumber());
		assertEquals(0,p2.getWrongnumber());
		assertEquals(0,p2.getTotalnumber());
	}

	@Test
	/*
	 * ���Ի���
	 */
	public void testmark1() {
		Person2 p2=new Person2("name2");
		p2.addrightnumber();
		p2.addwrongnumber();
		p2.addMark("1");
		assertEquals(1,p2.getRightnumber());
		assertEquals(1,p2.getWrongnumber());
		assertEquals(2,p2.getTotalnumber());
		assertEquals(1,p2.getMark());
	}
	
	@Test
	/*
	 * ���Ի���
	 */
	public void testmark2() {
		Person2 p2=new Person2("name2");
		p2.addMark("2");
		assertEquals(0,p2.getRightnumber());
		assertEquals(0,p2.getWrongnumber());
		assertEquals(0,p2.getTotalnumber());
		assertEquals(3,p2.getMark());
	}

	@Test
	public void testmark3() {
		Person2 p2=new Person2("name2");
		p2.addMark("3");
		assertEquals(0,p2.getRightnumber());
		assertEquals(0,p2.getWrongnumber());
		assertEquals(0,p2.getTotalnumber());
		assertEquals(5,p2.getMark());
	}
}
