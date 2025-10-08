package org.wildfly.examples.mcp.server;

import io.modelcontextprotocol.server.McpAsyncServer;
import io.modelcontextprotocol.server.McpServerFeatures;
import io.modelcontextprotocol.spec.McpSchema;

//@ApplicationScoped
public class McpServer {
	McpAsyncServer asyncServer;

	/*public void onStart(@Observes @Initialized(ConversationScoped.class) ServletRequest request) {

		asyncServer = McpServer.async(transportProvider)
				.serverInfo("my-server", "1.0.0")
				.capabilities(McpSchema.ServerCapabilities.builder()
						.resources(false, true)     // Enable resource support
						.tools(true)                // Enable tool support
						.prompts(true)              // Enable prompt support
						.logging()                  // Enable logging support
						.completions()              // Enable completions support
						.build())
				.build();
		// Register tools, resources, and prompts
		asyncServer.addTool(McpServerFeatures.AsyncToolSpecification.builder().tool().build() )
				.doOnSuccess(v -> logger.info("Tool registered"))
				.subscribe();
	}

	public void onEnd(@Observes @Destroyed(ConversationScoped.class) ServletRequest request) {
		asyncServer.close()
				.doOnSuccess(v -> logger.info("Server closed"))
				.subscribe();
	}*/
}
