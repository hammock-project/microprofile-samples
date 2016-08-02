package io.microprofile.sample.canonical.rest;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static net.javacrumbs.jsonunit.fluent.JsonFluentAssert.assertThatJson;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Ignore
public class TopCDsEndpointTest {

    private Client client;
    private WebTarget webTarget;

    private static WeldContainer weldContainer;
//    @BeforeClass
//    public static void setupContainer() {
//        weldContainer = new Weld().enableDiscovery()
//              .initialize();
//    }
//
//    @AfterClass
//    public static void shutdownContainer() {
//        weldContainer.shutdown();
//    }

    @Before
    public void initWebTarget() {
        client = ClientBuilder.newClient();
        webTarget = client.target("http://localhost:8080/");
    }

    // ======================================
    // =            Test methods            =
    // ======================================

    @Test
    public void should_be_deployed() {
        assertEquals(Response.Status.OK.getStatusCode(), webTarget.request(MediaType.APPLICATION_JSON).get().getStatus());
    }

    @Test
    public void should_have_five_items() {
        String body = webTarget.request(MediaType.APPLICATION_JSON).get(String.class);
        assertThatJson(body).isArray().ofLength(5);
        assertTrue(body.startsWith("[{\"id\":"));
    }
}
