public class upraznenie3 {

	public static void main(String[] args) {
		String text = "We are living in a <upcase>yellow submarine</upcase>." + 
						" We don't have <upcase>anything</upcase> else.";
		StringBuilder txt = new StringBuilder(text);
		int startIndex = txt.indexOf("<upcase>");
		int endIndex = txt.indexOf("</upcase>");
		while (endIndex != -1) {
			String txt1 = txt.substring(startIndex + 8, endIndex).toUpperCase();
			txt.replace(startIndex, endIndex + 9, txt1);
			startIndex = txt.indexOf("<upcase>", startIndex + 1);
			endIndex = txt.indexOf("</upcase>", startIndex + 1);
		}
		System.out.println(text);
		System.out.println(txt);
	}
}
