package springcloud.helloworld.ribbon.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import springcloud.helloworld.ribbon.service.service.HelloService;

@RestController
public class HelloControler {
	@Autowired
	HelloService helloService;
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(value = "/")
	public String hello() {
		return helloService.getHelloContent();
	}
	@RequestMapping(value = "/hello/{name}")
	public String hello1(@PathVariable String name) {
		return restTemplate.getForObject("http://PROVIDER-USER/hello/"+name, String.class);
	}
}