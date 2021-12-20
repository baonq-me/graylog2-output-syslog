package com.baonq.graylog2.plugin;

import java.util.Arrays;
import java.util.Collection;

import org.graylog2.plugin.Plugin;
import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.PluginModule;

public class JsonLogOutputPlugin implements Plugin {

	@Override
	public PluginMetaData metadata() {
		return new JsonLogOutputMetaData();
	}
	
	@Override
	public Collection<PluginModule> modules() {
		return Arrays.<PluginModule>asList(new JsonLogOutputModule());
	}
}
