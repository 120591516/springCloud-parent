package springcloud.helloworld.hystrix.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springcloud.helloworld.hystrix.client.service.HelloWorldService;

@RestController
public class WebController {
	@Autowired
	HelloWorldService helloWorldFeignService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {

		return helloWorldFeignService.sayHello();
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "fallbackHello")
	public String hello(@PathVariable String name) {
		return helloWorldFeignService.hello(name);
	}
	//断路器方法，返回值要和方法一致，参数也一致
	//注意一个BUG,断路器刚刚启动的时候,第一次访问就到断路器,不正常,第一次进入断路器不算数
	public String fallbackHello(String name){
		return "默认值："+name;//当发生异常是，直接返回默认值，这种凡是称为降级
	}
}
