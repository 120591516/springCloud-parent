package springcloud.helloworld.feign.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springcloud.helloworld.feign.client.service.HelloWorldService;

@RestController
public class WebController {
	@Autowired
	HelloWorldService helloWorldFeignService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return helloWorldFeignService.sayHello();
	}
}
