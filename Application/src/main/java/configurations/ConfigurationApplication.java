package configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import entrepot.Entrepot;
import entrepot.IEntrepot;

@Configuration
public class ConfigurationApplication extends WebMvcConfigurerAdapter {
	
	@Bean
	public IEntrepot iEntrepot() {
		return new Entrepot();
	}

}
