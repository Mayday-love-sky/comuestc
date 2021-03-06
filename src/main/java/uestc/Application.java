package uestc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//mybatis DAO 扫描
@MapperScan("uestc.dao")
public class Application {
    public static void main(String[] args) {
        //启动类
        SpringApplication.run(Application.class,args);
    }
}
