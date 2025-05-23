---
navigation_title: IOReactor errors
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/io-reactor-errors.html
---

# Apache http-client I/O reactor errors

Sending requests can sometimes fail with one of the following errors, coming from the Apache http-client library:

* `Request cannot be executed; I/O reactor status: STOPPED`
* `I/O reactor terminated abnormally`
* `I/O reactor has been shut down`

The I/O Reactor is the internal event loop in the http client library. It can terminate when an application callback throws an `Error`, like an `OutOfMemoryError` or a `StackOverflowError`. Remember that `Error` is different from a regular `Exception` and – [quoting the Java documentation](https://docs.oracle.com/javase/8/docs/api/?java/lang/Error.md) – *indicates serious problems that a reasonable application should not try to catch*.

In the context of the Elasticsearch Java clients, this can happen on two occasions:

* the application calls the low level `RestClient` directly, using the asynchronous `performRequestAsync` method, and an `Error` is thrown in the `ResponseListener` provided by the application.
* an `OutOfMemoryError` happens while buffering the body of an http response.

In the first case, it is the application’s responsibility to catch `Error` in its `ResponseListener` and decide what to do when these errors happen.

The second case is taken care of in the Java API Client since version 8.12: the error is wrapped in a `RuntimeException` that is reported to the application.

In previous versions of the Java API Client, you can copy/paste the `SafeResponseConsumer` class in your project and initialize the `RestClientTransport` as follows:

```java
RestClient restClient = ...
JsonpMapper mapper = ...
RestClientOptions options = new RestClientOptions(
    SafeResponseConsumer.DEFAULT_REQUEST_OPTIONS
);
RestClientTransport transport = new RestClientTransport(
    restClient, mapper, options
);
```
