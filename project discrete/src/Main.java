
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two distinct upper limits for the two primes p,q: ");
        System.out.print("upper limit for p: ");
        int p= scanner.nextInt();
        System.out.print("upper limit for q: ");
        int q= scanner.nextInt();
        int d=0;
        int e = 2;


        while (!isPrime(p)){
            p--;
        }
        while (!isPrime(q)){
            q--;
        }
        System.out.println("p= "+p);
        System.out.println("q= "+q);
        int n=p*q;
        System.out.println("n= "+n);
        int m=(p-1)*(q-1);
        System.out.println("m= "+m);

        while (gcd(m,e)!=1){
            e++;

        }

        System.out.println("e= "+e);
        for (int i=0;i<=10;i++) {
            int x=1+(i*m);
            if (x%e==0) {
                d=x/e;
                break;
            }
        }
        System.out.println("d= "+d);
        System.out.print("Enter original Message: ");
        scanner.nextLine();
        String w=scanner.nextLine();


        System.out.print("Cipher Message: ");

        int c;

        for (int i=0;i<w.length();i++){
            char f= w.charAt(i);
            int pe=f;
            c= (int) (Math.pow(pe,e)%n);


            char b= (char) c;
            double z=c;

            System.out.print(b);

        }
        System.out.println();
        System.out.print("Decrypted Massage: ");
        for (int i=0;i<w.length();i++){
            char f= w.charAt(i);
            int pe=f;
            c= (int) (Math.pow(pe,e)%n);


            char b= (char) c;

            BigInteger N=BigInteger.valueOf(n);
            BigInteger C=BigInteger.valueOf(c);

            BigInteger g= (C.pow(d)).mod(N);
            int s=g.intValue();


            char c1= (char) s;
            System.out.print(c1);




        }


    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double gcd(double m,double e){
        if (e==0){
            return m;
        }else {
            return gcd(e,m%e);
        }

    }

}
