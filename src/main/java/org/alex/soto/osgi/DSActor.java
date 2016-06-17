package org.alex.soto.osgi;
import org.osgi.service.component.annotations.Component;

import akka.actor.UntypedActor;


@Component
public class DSActor extends UntypedActor {

	@Override
	public void preStart() throws Exception {
		System.out.printf("Created");
	}

	@Override
	public void postStop() throws Exception {
		System.out.printf("Destroyed");
	}

	@Override
	public void onReceive(Object arg0) throws Exception {
		System.out.printf("Message received");
	}
}
