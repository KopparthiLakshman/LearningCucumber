package enumm;

public enum EnumInJav{
	
	SVANYC563,
	SVANYC583("https://svanyc583:8080/index.html"),
	SVANYC584("https://svanyc584:8080/index.html");
	String URL;
	private EnumInJav() {
		URL = "https://svanyc563:8080/index.html";
	}
	private EnumInJav(String url) {
		this.URL = url;
	}
}