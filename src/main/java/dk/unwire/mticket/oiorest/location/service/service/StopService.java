package dk.unwire.mticket.oiorest.location.service.service;

import org.apache.http.client.HttpClient;

import com.unwire.mticket.net.http.client.HttpClientFactory;
import com.unwire.mticket.net.http.client.HttpClientType;
import com.unwire.mticket.net.http.execute.ConnectionException;
import com.unwire.mticket.net.http.model.HttpRequest;
import com.unwire.mticket.net.http.repsonse.ResponseException;
import com.unwire.mticket.util.json.JsonUtil;

import dk.unwire.mticket.oiorest.location.service.http.HttpExecuter;
import dk.unwire.mticket.oiorest.location.service.model.Stop;

public class StopService {

	private final HttpExecuter httpExecuter;

	public StopService() {
		HttpClient httpClient = HttpClientFactory.getHttpClient(HttpClientType.MULTI_THREADED_CLIENT_SINGLE_HOST);

		this.httpExecuter = new HttpExecuter(httpClient);
	}

	public Stop[] getStop(String name) throws ResponseException, ConnectionException {
		HttpRequest httpRequest = new HttpRequest();
		httpRequest.setFullUrl("http://geo.oiorest.dk/holdepladser.json?navn=n%C3%B8rreport&maxantal=3");
		String result = this.httpExecuter.executeHttpRequest(httpRequest);
		System.out.println(result);

		Stop[] stops = JsonUtil.factoryFromString(result, Stop[].class);
		return stops;
	}
}
