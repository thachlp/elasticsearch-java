---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/index.html
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/introduction.html
---

# Java [introduction]

This is the documentation for the official Java API Client for {{es}}. The client provides strongly typed requests and responses for all {{es}} APIs.


## Features [_features]

* Strongly typed requests and responses for all {{es}} APIs.
* Blocking and asynchronous versions of all APIs.
* Use of fluent builders and functional patterns to allow writing concise yet readable code when creating complex nested structures.
* Seamless integration of application classes by using an object mapper such as Jackson or any JSON-B implementation.
* Delegates protocol handling to an http client such as the [Java Low Level REST Client](transport/rest-client/index.md) that takes care of all transport-level concerns: HTTP connection pooling, retries, node discovery, and so on.


## Elasticsearch server compatibility policy [_elasticsearch_server_compatibility_policy]

The {{es}} Java client is forward compatible; meaning that the client supports communicating with greater or equal minor versions of {{es}} without breaking. It does not mean that the client automatically supports new features of newer {{es}} versions; it is only possible after a release of a new client version. For example, a 8.12 client version won’t automatically support the new features of the 8.13 version of {{es}}, the 8.13 client version is required for that. {{es}} language clients are only backwards compatible with default distributions and without guarantees made.

| Elasticsearch Version | Elasticsearch-Java Branch | Supported |
|-----------------------|---------------------------|-----------|
| main                  | main                      |           |
| 9.x                   | 9.x                       | 9.x       |
| 8.x                   | 8.x                       | 8.17      |

