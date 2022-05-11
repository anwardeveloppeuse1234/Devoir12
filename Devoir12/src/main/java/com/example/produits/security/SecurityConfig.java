package com.example.produits.security;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	 PasswordEncoder passwordEncoder = passwordEncoder ();
	 auth.inMemoryAuthentication().withUser("admin")
	.password(passwordEncoder.encode("123")).roles("ADMIN");
	 auth.inMemoryAuthentication().withUser("amira")
	.password(passwordEncoder.encode("123")).roles("AGENT","USER");
	 auth.inMemoryAuthentication().withUser("user1")
	.password(passwordEncoder.encode("123")).roles("USER");
	 }
	 @Bean
	 public PasswordEncoder passwordEncoder () {
	 return new BCryptPasswordEncoder();
	 }
}