package com.naver.client.repo;

import com.naver.client.entity.Oauth_client_details;

public interface Oauth_client_detailsRepo {
	boolean insert(Oauth_client_details ocd);

	boolean update(Oauth_client_details ocd);

	boolean delete(String client_id);

	Oauth_client_details select();
}
