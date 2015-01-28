package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


import edu.ecu.cs.sle.imp.parser.ParserUtil;

public class DivExpressionTest {

	private static DivExpression div;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Expression expr1 = ParserUtil.parseExpression("5");
		Expression expr2 = ParserUtil.parseExpression("5");
	    div = new DivExpression(expr1,expr2);

	}

	@Test
	public void testDivExpression() {
		
		assertEquals("5/5",1,div.interpret().getIntValue().intValue());
	}

}
