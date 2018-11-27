package com.demo.config;

import com.demo.service.security.CustomUserService;
import com.demo.util.MD5Util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ClassName WebSecurityConfig
 * @Description : Security配置类
 * @Author Hobo
 * @Date 18-11-25 下午2:05
 **/

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    UserDetailsService customUserService() {
        return new CustomUserService();
    }

    /**
     * security5新特性吧～  不使用加密方式会报异常
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService())
                //启动MD5加密
                .passwordEncoder(new PasswordEncoder() {
                    MD5Util md5Util = new MD5Util();

                    @Override
                    public String encode(CharSequence charSequence) {
                        return md5Util.encode((String) charSequence);
                    }

                    @Override
                    public boolean matches(CharSequence charSequence, String s) {
                        return s.equals(md5Util.encode((String) charSequence));
                    }
                });
    }


    /**
     * 还没配置 登录后的url 项目完成后一个一个配置QAQ
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("login","/user/add").permitAll()
                .anyRequest().authenticated()
//                .and().formLogin().loginPage("/login")
//                .defaultSuccessUrl("/find/query").failureForwardUrl("login?error").permitAll()
                .and()
                .logout().permitAll()
                .and()
                .formLogin();


        http.csrf().disable();
    }
}
