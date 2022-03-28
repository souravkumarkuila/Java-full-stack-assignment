package s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
	
	@GetMapping("/hello")
	public String Hello() {
		String s = "<h1>HelloWorld</h1>" ;
		return (s);
		
	}

}
