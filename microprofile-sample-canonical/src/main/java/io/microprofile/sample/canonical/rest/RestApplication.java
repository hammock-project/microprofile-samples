package io.microprofile.sample.canonical.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
@ApplicationScoped
public class RestApplication extends Application {
}
