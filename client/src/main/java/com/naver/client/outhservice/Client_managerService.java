package com.naver.client.outhservice;

import java.util.List;

import com.naver.client.entity.Client_manager;

public interface Client_managerService {
	boolean insert(Client_manager cm);

	boolean delete(String client_id);

	boolean updateAppname(Client_manager cm);

	boolean updateSecret(Client_manager cm);

	List<Client_manager> select(String id);
}
