package dive.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(
	    name = "Keycloak2"
	    , openIdConnectUrl = "http://localhost:8082/realms/dive-dev/.well-known/openid-configuration"
	    , scheme = "bearer"
	    , type = SecuritySchemeType.OPENIDCONNECT
	    , in = SecuritySchemeIn.HEADER
	    )
public class SpringbootKeycloakauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKeycloakauthApplication.class, args);
	}

}
