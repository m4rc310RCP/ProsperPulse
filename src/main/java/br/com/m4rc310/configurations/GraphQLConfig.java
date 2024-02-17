package br.com.m4rc310.configurations;

import org.springframework.context.annotation.Configuration;

import br.com.m4rc310.gql.MUserProvider;
import br.com.m4rc310.gql.dto.MUser;

@Configuration
public class GraphQLConfig extends MUserProvider {

	@Override
	public MUser authUser(String username, Object password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MUser getUserFromUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidUser(MUser user) {
		// TODO Auto-generated method stub
		return false;
	}

}
