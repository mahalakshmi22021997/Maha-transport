package com.cg.mahalakshmi.service;

import java.util.Map;

import com.cg.mahalakshmi.bean.TransportBean;

public interface ITransportService {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
