package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.parser.ParserUtil;

public class MultExpressionTest {

	private static MultExpression mult;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Expression expr1 = ParserUtil.parseExpression("5");
		Expression expr2 = ParserUtil.parseExpression("5");
		mult = new MultExpression(expr1,expr2 );
	}

	@Test
	public void testMultExpression() {
		assertEquals("5*5", 25, mult.interpret().getIntValue().intValue());
	}

}
