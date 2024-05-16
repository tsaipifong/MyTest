package idv.tsaipifong.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrintInputTest {

	@Autowired
	private PrintInput printInput;
	
	@Test
	void test() {
		printInput.execute("Hello world");
	}

}
