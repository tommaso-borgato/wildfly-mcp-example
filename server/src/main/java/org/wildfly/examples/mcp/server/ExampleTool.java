package org.wildfly.examples.mcp.server;

import org.wildfly.extension.mcp.injection.tool.McpTool;
import org.wildfly.mcp.api.Tool;

@McpTool
public class ExampleTool {

	@Tool(name = "String.length", description = "Calculates the length of a string")
	int stringLength(String s) {
		System.out.println("Called stringLength() with s='" + s + "'");
		return s.length();
	}
}
