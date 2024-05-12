package idv.tsaipifong.mytest;

import org.springframework.stereotype.Service;

@Service
public class PrintInput {

	public void execute(String input) {
		System.out.println("Input: " + input);
	}
	
}
