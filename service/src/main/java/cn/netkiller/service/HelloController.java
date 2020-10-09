package cn.netkiller.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

//	private static final Log log = LogFactory.getLog(HelloController.class);

	@GetMapping("/")
	public String hello() {
		Log.info("@Slf4j Test OK");
		return "Hello World";
	}

}
