package foo.bar;


import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCalculateAreaResource extends JerseyTest {
    
    public TestCalculateAreaResource() throws Exception {
        super("foo.bar");
    }

    @Test
    public void testAreaForSquare() {
        WebResource webResource = resource().path("/area/square/4.0");
        ClientResponse.Status status = webResource.head().getClientResponseStatus();
        assertEquals(200, status.getStatusCode());
        String result = webResource.get(String.class);
        assertEquals("{\"result\":16}", result);      

    }

    @Test
    public void testAreaForSquareInvalidParam() {
        WebResource webResource = resource().path("/area/square/hello");
        ClientResponse.Status status = webResource.head().getClientResponseStatus();
        assertEquals(404, status.getStatusCode());


    }

    @Test
    public void testAreaForRectangle() {
        WebResource webResource = resource().path("/area/rectangle/4.0/2.5");
        ClientResponse.Status status = webResource.head().getClientResponseStatus();
        assertEquals(200, status.getStatusCode());
        String result = webResource.get(String.class);
        assertEquals("{\"result\":10}", result);
    }

    @Test
    public void testAreaForRectangleInvalidParam() {
        WebResource webResource = resource().path("/area/rectangle/4.0");
        ClientResponse.Status status = webResource.head().getClientResponseStatus();
        assertEquals(404, status.getStatusCode());

    }
    
    @Test
    public void testAreaForTriangle() {
        WebResource webResource = resource().path("/area/triangle/4.0/2.5");
        ClientResponse.Status status = webResource.head().getClientResponseStatus();
        assertEquals(200, status.getStatusCode());
        String result = webResource.get(String.class);
        assertEquals("{\"result\":5}", result);
    }

    @Test
    public void testAreaForTriangleInvalidParam() {
        WebResource webResource = resource().path("/area/triangle/4.0/bob");
        ClientResponse.Status status = webResource.head().getClientResponseStatus();
        assertEquals(404, status.getStatusCode());
    }
}
