package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
     for (int i=2; i<printToInclusive; i++){
         if (isPrime(i)){
             System.out.println(i);
         }
     }
    }
        static boolean isPrime(int a){
            for (int i=2; i<a; i++){
                if (a%i==0)
                    return false;
            }
            return true;
                }

            }
        }
    }
}
