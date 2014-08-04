package dk.unwire.mticket.oiorest.location.service.http;

import org.apache.http.client.HttpClient;

import com.unwire.mticket.net.http.execute.ConnectionException;
import com.unwire.mticket.net.http.execute.ExecuteHttpRequestImpl;
import com.unwire.mticket.net.http.model.HttpRequest;
import com.unwire.mticket.net.http.model.HttpResponseString;
import com.unwire.mticket.net.http.repsonse.ResponseException;

public class HttpExecuter {

	private final String ENCODING = "utf-8";

	private final HttpClient httpClient;

	public HttpExecuter(HttpClient httpClient) {
		this.httpClient = httpClient;
	}

	ExecuteHttpRequestImpl createExecutor() {
		return new ExecuteHttpRequestImpl();
	}

	public String executeHttpRequest(HttpRequest httpRequest) throws ResponseException, ConnectionException {
		ExecuteHttpRequestImpl requestExector = createExecutor();
		HttpResponseString result = requestExector.getRequest(httpRequest, this.ENCODING, this.httpClient);
		return result.getResponseValue();
	}
}
