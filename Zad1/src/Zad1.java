
public class Zad1 {
	public static void main (String [] args) {
		int i,samoglasnik=0;
		char c;
		do {
			i=Svetovid.in.readInt("Unesite duzinu niza koja mora biti izmedju 1 i 20");
		}while (i<=0 || i>=20);
		String [][] matrica1 = new String [i][i];
		int [][] matrica2= new int [i][i]; 

		for (int n=0;n<i;n++) {
			for (int t = 0; t < matrica1.length; t++) {
				matrica1[n][t]=Svetovid.in.readLine("Unesite niz karaktera ");
				matrica1[n][t]=matrica1[n][t].toLowerCase();
			}
		}
		for (int j = 0; j < matrica1.length; j++) {
			for (int g = 0; g < matrica1.length; g++) {
				samoglasnik=0;
				for (int k = 0; k < matrica2.length; k++) {
					c=matrica1[j][g].charAt(k);
					if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
						samoglasnik++;
					matrica2[j][g]=samoglasnik;
				}
			}
		}
		for (int j=0;j<i;j++) {
			for (int t = 0; t < matrica1.length; t++) {
				System.out.print(matrica2[j][t]+" ");
			}
		System.out.println();
		}
	}
}

