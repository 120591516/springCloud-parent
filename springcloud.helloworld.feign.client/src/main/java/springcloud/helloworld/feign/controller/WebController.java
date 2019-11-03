package springcloud.helloworld.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springcloud.helloworld.feign.service.HelloWorldService;

@RestController
public class WebController {
	@Autowired
	HelloWorldService helloWorldFeignService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {

		return helloWorldFeignService.sayHello();
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		return helloWorldFeignService.hello(name);
	}
}
