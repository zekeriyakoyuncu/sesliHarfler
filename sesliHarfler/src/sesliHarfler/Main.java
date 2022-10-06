package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		String harf = "A";
		
		int flag = 2;
		String[][] sesliHarfler = {{"a","ı","o","u"},{"e","i","ö","ü"}};
		
		
		if(harf.length()>1) {
			System.out.println("Karakter sayısı hesaplanması için fazla.");
		}
		else {
			for(int i=0 ; i<2 ; i++) {
				for(int j=0; j<4 ; j++) {
					if(sesliHarfler[i][j] == harf.toLowerCase()) {
						flag = i;
				}
			}
		}
			if(flag == 2) {
				System.out.println("Geçersiz karakter.");
			}
			else if(flag == 0) {
				System.out.println("Kalın sesli harf.");
			}
			else {
				System.out.println("İnce sesli harf.");
			}
		}
		
		
	}
}
