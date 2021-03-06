package rh.company.webapp;



	import org.springframework.boot.context.properties.ConfigurationProperties;
	import org.springframework.context.annotation.Configuration;

	import lombok.Data;


	@Configuration
	@ConfigurationProperties(prefix = "rh.company.webapp")
	@Data
	public class CustomProperties {

	    private String apiUrl;

		public String getApiUrl() {
			return apiUrl;
		}

		public void setApiUrl(String apiUrl) {
			this.apiUrl = apiUrl;
		}

	}


