package idv.tsaipifong.mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintController {

	@Autowired
	private PrintInput printInput;
	
	@GetMapping("/print")
	public void execute(String input) {
		printInput.execute(input);
	}
	
}
