package org.enbd.poc;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class EnrichBean {
	 public Document enrich(Document doc) {
	        Node node = doc.getElementsByTagName("incidentId").item(0);
	        String incident = node.getTextContent();

	        // here we enrich the document by changing the incident id to another value
	        // you can of course do a lot more in your use-case
	        node.setTextContent("456");
	        System.out.println("Incident was " + incident + ", changed to 456");

	        return doc;
	    }

}
