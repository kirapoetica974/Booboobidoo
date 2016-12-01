package configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InitialiseurApplication extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[0];
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {
				ConfigurationApplication.class, ConfigurationEntrepot.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	/*@Override
	protected Filter[] getServletFilters() {
		return new Filter[]{new CORSFilter()};

	}*/
}
