package fr.treeptik.utils;

import java.util.Locale;

public class I18n {
	private static Locale locale;
	
	public I18n(){
		I18n.locale = new Locale("fr");
	}
	
	public I18n(String locale){
		I18n.locale = new Locale(locale);
	}

	public static Locale getLocale() {
		return locale;
	}

	public static void setLocale(Locale locale) {
		I18n.locale = locale;
	}
	
}
