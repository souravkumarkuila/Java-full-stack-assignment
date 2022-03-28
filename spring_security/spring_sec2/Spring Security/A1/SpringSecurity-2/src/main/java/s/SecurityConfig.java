package s;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
    protected void configure(HttpSecurity http) throws Exception {    
            
          http
          .authorizeRequests()
          .anyRequest().authenticated()  
          .and()  
          .formLogin()  
          .loginPage("/login")
          .permitAll()
          .and()
          .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
          .logoutSuccessUrl("/login").deleteCookies("JSESSIONID")
          .invalidateHttpSession(true).permitAll();  
         
          
	}  
	
	  protected void configure( AuthenticationManagerBuilder auth) throws Exception
	  {
	  
	  auth.inMemoryAuthentication() .withUser("test") .password("test")
	  .roles("USER") .and() .withUser("admin") .password("admin") .roles("Admin");
	  }
	   
    @SuppressWarnings("deprecation")
	@Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}