package com.xiets;
import static org.junit.Assert.*;

import org.junit.Test;

public class testQuestion2 {

	@Test
	/*
	 *��question��result�ļ����getResult���м���
	 */
	public void testResult() {
		Question2 q=new Question2(1,1,"-");
		assertEquals(0,q.getResult());
		Question2 q1=new Question2(1,1,"+");
		assertEquals(2,q1.getResult());
	}
	
	@Test
	/*
	 * ��checkAnswer�������в���
	 */
	public void testCheck() {
		Question2 q=new Question2(4,1,"-");
		assertEquals(1,q.checkAnswer(3));
		Question q1=new Question(4,1,"-");
		assertEquals(0,q1.checkAnswer(2));
	}

	/*
	* ��getquestion���в���
	 */
	public void testGetQuestion(){
		Question2 q=new Question2(4,1,"-");
		assertEquals("4-1=?",q.getquestion());
	}
	
	@Test
	/*
	 * �����úͻ�ȡ�Ѷȼ�����м��
	 */
	public void testlevel1() {
		Question2 q=new Question2();
		q.setlevel("1");
		assertEquals("1",q.getLevel());
		assertTrue(q.getNumber1()<10);
		assertTrue(q.getNumber2()<10);
	}
	
	@Test
	/*
	 * �����úͻ�ȡ�Ѷȼ�����м��
	 */
	public void testlevel2() {
		Question2 q=new Question2();
		q.setlevel("2");
		q.refresh();
		//System.out.println(q.getNumber1());
		//System.out.println(q.getNumber2());
		assertEquals("2",q.getLevel());
		assertTrue(q.getNumber1()<50);
		assertTrue(q.getNumber2()<50);
	}
	
	@Test
	/*
	 * �����úͻ�ȡ�Ѷȼ�����м��
	 */
	public void testlevel3() {
		Question2 q=new Question2();
		q.setlevel("3");
		q.refresh();
		assertEquals("3",q.getLevel());
		System.out.println(q.getNumber1());
		assertTrue(q.getNumber1()>50);
		assertTrue(q.getNumber2()>50);
		assertTrue(q.getNumber1()<100);
		assertTrue(q.getNumber2()<100);
	}
}
