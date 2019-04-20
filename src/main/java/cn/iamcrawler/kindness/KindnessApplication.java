package cn.iamcrawler.kindness;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("cn.iamcrawler.kindness.mapper")
@EnableTransactionManagerServer
public class KindnessApplication {

    public static void main(String[] args) {
        SpringApplication.run(KindnessApplication.class, args);
    }

}
