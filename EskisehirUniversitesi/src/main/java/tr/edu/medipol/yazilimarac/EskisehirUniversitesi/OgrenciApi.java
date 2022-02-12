package tr.edu.medipol.yazilimarac.EskisehirUniversitesi;

import java.util.*;

import org.springframework.web.bind.annotation.*;






@RestController
@RequestMapping("/ogrenci")
public class OgrenciApi {
	
	@GetMapping("/listele")
	public List<Ogrenci> listele() {
		return OgrenciVerileri.ogrencileriListele()	;
		
				
	
	}
	
	
	@PostMapping("/ekle2")
	public Ogrenci ekle(@RequestBody Ogrenci ogrenci) {
		OgrenciVerileri.ogrenciEkle(ogrenci);
		return ogrenci;
	}
	
	@GetMapping("/ekle")
	public Ogrenci ogrenciEkle(@RequestParam String isim,@RequestParam String numara) {
		Ogrenci ogrenci = new Ogrenci(isim,numara);
		OgrenciVerileri.ogrenciEkle(ogrenci);
		return ogrenci;
	}

}
