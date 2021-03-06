package org.enbd.poc.model;

public class Company {

    private String name;
    private String geo;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

	@Override
	public String toString() {
		return "Company [name=" + name + ", geo=" + geo + ", active=" + active
				+ "]";
	}
    
    
}
