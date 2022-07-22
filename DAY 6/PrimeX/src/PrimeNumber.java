import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        primeGenerate(10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Input: ");
        int input = scanner.nextInt();
        primeGenerateX(input);
    }

    static void primeGenerate(int batas){
        int n=0,i=1,lastPrime=0;
        while(n < batas)
        {
            int j=1;
            int flag=0;
            while(j<=i)
            {
                if(i%j==0)
                    flag++;
                j++;
            }
            if(flag==2)
            {
                System.out.print(" "+i);
                n++;
            }
            lastPrime = i;
            i++;
        }
    }

    static void primeGenerateX(int search){
        int n=0,i=1,lastPrime=0;
        while(n < search)
        {
            int j=1;
            int flag=0;
            while(j<=i)
            {
                if(i%j==0)
                    flag++;
                j++;
            }
            if(flag==2)
            {
                n++;
            }
            lastPrime = i;
            i++;
        }
        System.out.println(lastPrime);
    }
}
