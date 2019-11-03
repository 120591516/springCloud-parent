package springcloud.helloworld.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @SpringCloudApplication 包含	//@SpringBootApplication
 * 								//@EnableDiscoveryClient
 */
@SpringBootApplication
@EnableSidecar
public class ServiceSidecarApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceSidecarApplication.class, args);
	}
}