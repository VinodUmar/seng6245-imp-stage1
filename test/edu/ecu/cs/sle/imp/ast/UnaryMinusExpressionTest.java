package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.parser.ParserUtil;

public class UnaryMinusExpressionTest {

	private static UnaryMinusExpression uMin;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Expression expr1 = ParserUtil.parseExpression("5");
		uMin = new UnaryMinusExpression(expr1);
	}

	@Test
	public void testUnaryMinusExpression() {
		
		assertEquals("5*-1", -5, uMin.interpret().getIntValue().intValue());

	}

}
