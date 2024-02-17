package br.com.m4rc310.configurations;

import org.springframework.context.annotation.Configuration;

import br.com.m4rc310.gql.MUserProvider;
import br.com.m4rc310.gql.dto.MUser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class GraphQLConfig extends MUserProvider {
	
	@Override
	public MUser authUser(String username, Object password) throws Exception {
		
		log.info("AuthUser {}", username);
		
		MUser user = new MUser();
		user.setUsername(username);
		user.setPassword(String.valueOf(password));
		user.setRoles("admin".split(";"));
		return user;
	}

	@Override
	public MUser getUserFromUsername(String username) {
		log.info("getUserFromUsername {}", username);
		MUser user = new MUser();
		user.setUsername(username);
		return user;
	}

	@Override
	public boolean isValidUser(MUser user) {
		log.info("isValidUser {}", user);
		return true;
	}

}
