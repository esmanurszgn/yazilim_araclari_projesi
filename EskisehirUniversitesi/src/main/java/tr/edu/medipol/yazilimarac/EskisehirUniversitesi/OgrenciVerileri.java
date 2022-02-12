package tr.edu.medipol.yazilimarac.EskisehirUniversitesi;


import java.util.*;

public class OgrenciVerileri {
	
	
	private static final List<Ogrenci> OGRENCİLER = new ArrayList<>();
	static {
		OGRENCİLER.add(new Ogrenci("esin gün","123456"));
		OGRENCİLER.add(new Ogrenci("sevinç yılmaz","1234546626"));
		OGRENCİLER.add(new Ogrenci("gül kaya","H123456"));
		
	}

	public static List<Ogrenci> ogrencileriListele() {
		return OGRENCİLER;
	}
	
	public static void ogrenciEkle(Ogrenci ogrenci) {
		OGRENCİLER.add(ogrenci);
	}
}
