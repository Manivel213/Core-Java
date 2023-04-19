package org.inherit;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("Dravidian Language");
	}
	public void englishLanguage() {
		System.out.println("British Language");
	}
	public void hindiLanguage() {
		System.out.println("Ariyan Language");
	}
	public static void main(String[] args) {
		
		LanguageInfo l = new LanguageInfo();
		
		l.southIndia();
		l.northIndia();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		
		
		
	}
	

}
