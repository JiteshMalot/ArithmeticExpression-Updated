package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArithmeticExpressionApplicationTests {

	@Autowired
	private ArithmeticService arithmeticService;

	@Test
	void testExpression() {

		// Test 1
		ArithmeticExpressionEntity expEntity = new ArithmeticExpressionEntity();
		expEntity.setExpression("(1+(3-2))");
		try {
			int res = arithmeticService.evaluateExpression(expEntity);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
