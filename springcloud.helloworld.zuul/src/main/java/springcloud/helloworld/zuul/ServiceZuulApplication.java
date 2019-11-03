package springcloud.helloworld.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @SpringCloudApplication 包含	//@SpringBootApplication
 * 								//@EnableDiscoveryClient
 */
@SpringBootApplication
@EnableZuulProxy //启动zuul api gateway
public class ServiceZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}