package developia.az.bookJWT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        ((Object) http.csrf()).disable()
            .authorizeHttpRequests()
            .requestMatchers("/auth/**").permitAll() // login endpoint sərbəstdir
            .anyRequest().authenticated();
        return http.build();
    }
}
