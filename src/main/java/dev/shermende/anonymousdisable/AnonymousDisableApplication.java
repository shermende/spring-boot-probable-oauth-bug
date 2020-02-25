package dev.shermende.anonymousdisable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class AnonymousDisableApplication extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .anonymous()
                .disable()
                .oauth2ResourceServer()
                .jwt()
        ;
    }

    public static void main(String[] args) {
        SpringApplication.run(AnonymousDisableApplication.class, args);
    }

}
