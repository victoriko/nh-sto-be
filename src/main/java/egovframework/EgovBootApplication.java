package egovframework;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import egovframework.com.config.EgovWebApplicationInitializer;

@ServletComponentScan
@SpringBootApplication
@Import({EgovWebApplicationInitializer.class})
public class EgovBootApplication {
	public static void main(String[] args) {
		System.out.println("##### EgovBootApplication Start #####");

		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		//springApplication.setLogStartupInfo(false);
		springApplication.run(args);

		System.out.println("##### EgovBootApplication End #####");
	}
	
//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedOrigins("http://localhost:7100");
//            }
//        };
//    }

}
