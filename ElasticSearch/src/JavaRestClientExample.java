import java.io.IOException;
import java.util.Collections;

import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.http.entity.ContentType;
import org.elasticsearch.client.http.HttpEntity;
import org.elasticsearch.client.http.HttpHost;
import org.elasticsearch.client.http.nio.entity.NStringEntity;

public class JavaRestClientExample {

    public static void main(String[] args) throws IOException {

        String host = ""; // For example, my-test-domain.us-east-1.es.amazonaws.com
        String index = "movies";
        String type = "movie";
        String id = "6";

        String json = "{" + "\"title\":\"Walk the Line\"," + "\"director\":\"James Mangold\"," + "\"year\":\"2005\""
            + "}";

        RestClient client = RestClient.builder(new HttpHost(host, 443, "https")).build();

        HttpEntity entity = new NStringEntity(json, ContentType.APPLICATION_JSON);

        Response response = client.performRequest("PUT", "/" + index + "/" + type + "/" + id,
            Collections.<String, String>emptyMap(), entity);

        System.out.println(response.toString());
    }
}