package com.basic.B_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//proxy is to give different instance of JDBC Connection
public class JdbcConnection 
{
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
