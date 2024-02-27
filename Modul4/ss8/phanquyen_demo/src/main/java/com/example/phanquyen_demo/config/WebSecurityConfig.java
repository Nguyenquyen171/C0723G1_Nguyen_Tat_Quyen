package com.example.phanquyen_demo.config;

import com.example.phanquyen_demo.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Autowired
    private MyUserDetailService myUserDetailService;

    @Autowired
    private JWTAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(myUserDetailService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public WebMvcConfigurer corsMappingConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                CorsConfiguration corsConfig = new CorsConfiguration();
                corsConfig.setAllowedOrigins(Arrays.asList("http://localhost:8081"));
                corsConfig.addAllowedMethod("*");
                corsConfig.addAllowedHeader("Requestor-Type");
                corsConfig.addExposedHeader("X-Get-Header");

                UrlBasedCorsConfigurationSource source =
                        new UrlBasedCorsConfigurationSource();
                source.registerCorsConfiguration("/**", corsConfig);
            }
        };
    }


//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        // cấu hình có thể logout
//        http.csrf(AbstractHttpConfigurer::disable);
//        // các đường dẫn không phải login
//        http.authorizeHttpRequests((authorize) -> authorize
//                .requestMatchers("/home", "/account/login","/logout","/logoutSuccessful","/403","home/detail/1","home/hottour").permitAll());
//        // cấp quyền cho admin
//        http.authorizeHttpRequests((authorize) -> authorize
//                .requestMatchers("/admin","/booking").hasRole("ADMIN"));
//        // cấp quyền cho user và admin
//        http.authorizeHttpRequests((authorize) -> authorize
//                .requestMatchers("/test").hasAnyRole("USER", "ADMIN"));
//        // cấu hình form login
//        http.formLogin(form -> form
//                .loginPage("/account/login")
//                .loginProcessingUrl("/j_spring_security_check")
//                .defaultSuccessUrl("/home")//
//                .failureUrl("/account/login")
//                .usernameParameter("username")//trùng với tên trong form đăng nhập
//                .passwordParameter("password")// trung với tên trong form đăng nhập
//
//        ).httpBasic(Customizer.withDefaults());
//        http.logout(form->form.logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful").invalidateHttpSession(true).deleteCookies("JSESSIONID"));
//        http.exceptionHandling(ex -> ex.accessDeniedPage("/403"));;
//        return http.build();
//    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.exceptionHandling((exception) -> exception.accessDeniedPage("/403"));
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers().hasRole("ADMIN")
//                        .requestMatchers().hasAnyRole("USER")
                        .requestMatchers("/account/sign-up","/account/sign-in","/").permitAll()
                )
                .formLogin((formLogin) ->
                        formLogin
                                .loginPage("/account/sign-in")
                                .defaultSuccessUrl("/")
                                .failureUrl("/account/sign-in")


                )
                .httpBasic(Customizer.withDefaults())
                .build();



    }
}