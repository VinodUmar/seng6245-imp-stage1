package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.parser.ParserUtil;

public class MinusExpressionTest {

	private static MinusExpression minus;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Expression expr1 = ParserUtil.parseExpression("5");
		Expression expr2 = ParserUtil.parseExpression("5");
		minus = new MinusExpression(expr1,expr2 );
	}

	@Test
	public void testMinusExpression() {
		assertEquals("5-5", 0, minus.interpret().getIntValue().intValue());
	}

}
