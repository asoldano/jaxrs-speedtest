package com.github.K0zka.dummywarhead;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class HelloApplication extends Application {
	
	private final Set<Object> s;
	
	public HelloApplication() {
		HashSet<Object> hs = new HashSet<>();
		hs.add(new HelloService());
		s = Collections.unmodifiableSet(hs);
	}
	
	public Set<Object> getSingletons() {
        return s;
    }
}