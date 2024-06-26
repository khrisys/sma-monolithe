//package fr.cdrochon.smamonolithe.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = true)
//public class SecurityConfig {
//
//    private final JwtAuthConverter jwtAuthConverter;
//
//    public SecurityConfig(JwtAuthConverter jwtAuthConverter) {
//        this.jwtAuthConverter = jwtAuthConverter;
//    }
//
//    /**
//     * Spring security supprime les frames ar defaut, car considere que c'est une faille de securité
//     *
//     * Recuperation des roles depuis le jwt
//     * @param httpSecurity
//     * @return
//     * @throws Exception
//     */
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .csrf(Customizer.withDefaults())
//                .cors(Customizer.withDefaults())
//                .headers(h -> h.frameOptions(fo -> fo.disable()))
//                .csrf(csrf->csrf.ignoringRequestMatchers("/h2-console/**"))
//                .authorizeHttpRequests(ar->ar.requestMatchers("/h2-console/**").permitAll())
//                .authorizeHttpRequests(ar->ar.requestMatchers("/v3/**").permitAll())
//                .authorizeHttpRequests(ar->ar.requestMatchers("/swagger-ui/**").permitAll())
//                .authorizeHttpRequests(ar->ar.requestMatchers("/command/client/**").permitAll())
////                .authorizeHttpRequests(ar->ar.requestMatchers("/garages").permitAll())
////                .oauth2Login(Customizer.withDefaults())
//                .authorizeHttpRequests(ar -> ar.anyRequest().authenticated())
//                .oauth2ResourceServer(o2->o2.jwt(token->token.jwtAuthenticationConverter(jwtAuthConverter)))
//                .build();
//    }
//    //TODO ajuster la granularité
//    /**
//     * Politique de CORS origin par Spring Security
//     * @return
//     */
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("*"));
//        //configuration.setAllowedOrigins(Arrays.asList("http://localhost:8092"));
//        configuration.setAllowedMethods(Arrays.asList("GET", "POST"));
//        configuration.setAllowedHeaders(Arrays.asList("*"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//
////    @Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
////    private String issuerUri;
////
////    @Bean
////    public JwtDecoder jwtDecoder() {
////        return JwtDecoders.fromOidcIssuerLocation(issuerUri);
////    }
//}
