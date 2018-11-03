package com.cg.mahalakshmi.dao;

import java.util.Map;

import com.cg.mahalakshmi.bean.TransportBean;

public interface ITransportDao {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
