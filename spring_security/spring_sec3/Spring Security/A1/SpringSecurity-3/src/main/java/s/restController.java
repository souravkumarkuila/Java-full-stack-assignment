package s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
	
	@GetMapping("/")
	public String Hello() {
		String s = "<h1>Hello</h1>" ;
		return (s);
	}
	@GetMapping("/user")
	public String Hellouser() {
		String s = "<h1>Hello User</h1>" ;
		return (s);
	}
	@GetMapping("/admin")
	public String Helloadmin() {
		String s = "<h1>Hello Admin</h1>" ;
		return (s);
	}

}
