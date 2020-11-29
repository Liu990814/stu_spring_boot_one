package pers.ljt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.applet.Main;

/**
 * @author ljt
 * @create 2020-11-29 15:29
 */

/**
 * @SpringBootApplication来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
