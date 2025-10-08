package org.wildfly.examples.mcp.server;

import org.wildfly.extension.mcp.injection.tool.McpTool;
import org.wildfly.mcp.api.Tool;
import org.wildfly.mcp.api.ToolArg;

@McpTool
public class ExampleTool {

	@Tool(name = "String.length", description = "Calculates the length of a string")
	Integer stringLength(
			@ToolArg(description = "The string of which you want to calculate the length")  String s) {
		System.out.println("Called stringLength() with s='" + s + "'");
		return s.length();
	}
}
