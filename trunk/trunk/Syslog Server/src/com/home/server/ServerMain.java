package com.home.server;

import org.productivity.java.syslog4j.server.SyslogServer;
import org.productivity.java.syslog4j.server.SyslogServerEventHandlerIF;
import org.productivity.java.syslog4j.server.SyslogServerIF;
import org.productivity.java.syslog4j.server.impl.net.udp.UDPNetSyslogServerConfig;


public class ServerMain {
	int port = 514;
	String host ="192.168.1.1";
ServerMain(String host, int port)
{
	this.port = port;
	this.host = host;
}

void serverStart()
{
	UDPNetSyslogServerConfig udpConfig = new UDPNetSyslogServerConfig(host,port);
	SyslogServerEventHandlerIF()
    udpConfig.addEventHandler(new );
    udpConfig.setUseDaemonThread(false);

    SyslogServerIF server = SyslogServer.createInstance(host + port, udpConfig);
    server.run();
	
}

}
