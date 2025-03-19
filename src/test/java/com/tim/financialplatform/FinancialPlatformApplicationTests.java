package com.tim.financialplatform;

import com.tim.financialplatform.documents.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinancialPlatformApplicationTests {

	@Test
	void contextLoads() {
		User user = new User();
		user.setAge(12);
		user.setAge(25);
		user.setEmail("tim@tim.com");
	}

}
