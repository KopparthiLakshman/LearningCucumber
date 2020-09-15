package enumm;

public class Cons {

//	public enum SERVER_URL implements toImplement{
	
	/**1. enum can implements interface but it cannot extends any other class
	 * 2. ANy unimplemented methods in interface has to be implemented in enum
	 * 3. Unlike class we can also have constructor, methods,....in ENUM*/

	public enum SERVER_URL{
		SVANYC563,
		SVANYC583("https://svanyc583:8080/index.html"),
		SVANYC584("https://svanyc584:8080/index.html");
		String URL;
		private SERVER_URL() {
			URL = "https://svanyc563:8080/index.html";
		}
		private SERVER_URL(String url) {
			this.URL = url;
		}
	}
	interface toImplement{
//		void methosInsideInteface();
	}
	
}
