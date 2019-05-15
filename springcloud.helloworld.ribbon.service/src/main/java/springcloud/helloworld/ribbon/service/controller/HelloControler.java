package springcloud.helloworld.ribbon.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloud.helloworld.ribbon.service.service.HelloService;

@RestController
public class HelloControler {
	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/")
	public String hello() {
		return helloService.getHelloContent();
	}
}