## Start LLM

```shell
CONTAINER_ENGINE=$(command -v podman || command -v docker)
$CONTAINER_ENGINE run -d --rm --name ollama --replace --pull=always -p 11434:11434 -v ollama:/root/.ollama --stop-signal=SIGKILL docker.io/ollama/ollama
$CONTAINER_ENGINE exec -it ollama ollama run llama3.1
```

## Code

https://github.com/wildfly-extras/wildfly-mcp/blob/main/wildfly-mcp-server/README.md

-Dorg.wildfly.host.name=<host name> -Dorg.wildfly.port=<port>