package info.doushen.tb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbApplication.class, args);
		System.out.println("==================================");
		System.out.println("=========tb启动成功！！！===========");
		System.out.println("==================================");
	}

}
