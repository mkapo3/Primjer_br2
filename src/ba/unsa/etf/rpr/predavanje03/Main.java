package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;
public class Main {

	static int sumica(int k){
		int suma=0;
		while(k>0){
			suma+=k%10;
			k/=10;
		}
		return suma;
	}

    public static void main(String[] args) {
	    int n;
	    Scanner ulaz=new Scanner (System.in);
	    System.out.println("Unesite broj n: ");
	    n=ulaz.nextInt();
	    for(int i=1; i<n;i++){
	        int suma=sumica(i);

	        if(i%suma==0) System.out.println (" "+i);
        }
    }
}
