package egovframework.com.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//@EnableWebMvc
//public class EgovConfigCors implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*");
////                .allowedMethods("GET", "PUT", "POST", "DELETE");
//    }
//}

//@Configuration
//public class EgovConfigCors implements WebMvcConfigurer {
//
//  @Override
//  public void addCorsMappings(CorsRegistry registry) {
//    registry.addMapping("/**")
//        .allowedOrigins("http://localhost:7100");
//  }
//}