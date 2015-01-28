package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.parser.ParserUtil;

public class PlusExpressionTest {

	private static PlusExpression plus;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Expression expr1 = ParserUtil.parseExpression("5");
		Expression expr2 = ParserUtil.parseExpression("5");
		plus = new PlusExpression(expr1, expr2);
	}

	@Test
	public void testPlusExpression() {
		
		assertEquals("5+5", 10, plus.interpret().getIntValue().intValue());
	}

}
