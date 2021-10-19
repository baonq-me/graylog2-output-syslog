package com.wizecore.graylog2.plugin;

import org.graylog2.plugin.Message;
import org.graylog2.syslog4j.SyslogIF;

public class RawSender implements MessageSender {
    @Override
    public void send(SyslogIF syslog, int level, Message msg) {
        syslog.log(level, msg.getMessage());
    }
}
