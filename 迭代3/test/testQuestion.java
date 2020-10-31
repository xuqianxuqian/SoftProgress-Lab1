package com.xiets;
import static org.junit.Assert.*;
import org.junit.Test;

public class testQuestion {

	@Test
	/*
	 *对question中result的计算和getResult进行计算
	 */
	public void testResult() {
		Question q=new Question(1,1,"-");
		assertEquals(0,q.getResult());
		Question q1=new Question(1,1,"+");
		assertEquals(2,q1.getResult());
	}
	
	@Test
	/*
	 * 对checkAnswer函数进行测试
	 */
	public void testCheck() {
		Question q=new Question(4,1,"-");
		assertEquals(1,q.checkAnswer(3));
		Question q1=new Question(4,1,"-");
		assertEquals(0,q1.checkAnswer(2));
	}

	/*
	* 对getquestion进行测试
	 */
	public void testGetQuestion(){
		Question q=new Question(4,1,"-");
		assertEquals("4-1=?",q.getquestion());
	}
}
