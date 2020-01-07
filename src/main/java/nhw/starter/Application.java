package nhw.starter;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;


@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring";
    }

    public static void main(String[] args){
        /*SpringApplication.run(Application.class, args);*/

        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);


    }
    /*@Bean
    public ServletWebServerFactory serverFactory(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    private Connector createStandardConnector(){
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);
        return connector;
    }*/

}
