package me.kahwah.dd4t.providers;

public interface LinkProvider {
	public String resolveComponent(String componentId);
	
	public String resolveComponentFromPage(String componentId, String pageId);
}
