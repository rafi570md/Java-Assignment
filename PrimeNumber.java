public class PrimeNumber {
    public static void main(String[] args) {
    int n = 11;
    int count = 0;
    int i;
    for(i=2;i<n;i++)
    {
        if(n%i == 0)
        {
            count++;
        }
    }
    if (count == 0)
    {
      System.out.println("Prime Number");
    }
    
    else{
        System.out.println("Not Prime Number");
    }
    
    }

}