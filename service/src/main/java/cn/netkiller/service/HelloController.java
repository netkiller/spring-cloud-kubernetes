package cn.netkiller.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

	private static final Log log = LogFactory.getLog(HelloController.class);

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/services")
	public List<String> services() {
		return this.discoveryClient.getServices();
	}

}
