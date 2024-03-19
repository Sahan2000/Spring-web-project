package lk.gdse.aad.springproject.config;

import jakarta.servlet.annotation.MultipartConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "lk.gdse.aad.springproject")
@Configuration
@EnableWebMvc
@MultipartConfig
public class WebAppConfig {
}
