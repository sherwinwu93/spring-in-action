package com.wusd.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import javax.sql.DataSource;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/login")
                //登录成功后跳转页面
//                .defaultSuccessUrl("/test/test")
                .and()

                .authorizeRequests()
                //被保护的url
                .antMatchers("/").authenticated()
                .antMatchers("/test/roleUser").hasAnyRole("USER")
                .antMatchers("/test/roleAdmin").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/test/datasource").authenticated()

                .anyRequest().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username, password, true from spitter where username=?")
                .authoritiesByUsernameQuery(
                        "select username, authority from authority where username=?");
    }
}
