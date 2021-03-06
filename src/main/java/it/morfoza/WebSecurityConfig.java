package it.morfoza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/all", "/piggybank", "/resources/**", "/confirm_payment", "/calculatorLiczby", "/calculatorWynik", "/podajImie" , "/powitanie", "/processing" , "/rekordy" , "/test.txt" , "/zwyciezca" , "/lista" , "/zwyciezcy").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/log_in_form")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user1").password("password1").roles("USER");
    }
}