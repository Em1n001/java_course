package developia.az.Swagger;

import org.springframework.context.annotation.Bean;

import developia.az.config.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Mənim Spring Boot API Layihəm")
                .version("1.0.0")
                .description("Bu layihə Swagger ilə sənədləşdirilmişdir."));
    }
}
