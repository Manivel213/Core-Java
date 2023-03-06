package org.lang;

public class LanguageInfo {
	private void tamilLanguage() {
		System.out.println("Dravidian");
	}
	private void englishLanguage() {
		System.out.println("British");

	}
	private void hindiLangauge() {
		System.out.println("Ariyan");

	}
	public static void main(String[] args) {
		
		LanguageInfo l = new LanguageInfo();
		
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLangauge();
	}
	

}
