import java.util.*;
public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{  
            System.out.println("1.Search direct Fibonacci number :");
            System.out.println("2.Go with fibonacci series :");
            int f1 = 0;
            int f2 = 1;
            int ans = sc.nextInt();
            if (ans == 1) {
                System.out.print("Enter the term for your fibonacci :");
                int term = sc.nextInt();
                directSeries(f1, f2, term);

            }
            else if (ans == 2) {
                System.out.print("Enter the term for your fibonacci :");
                int term = sc.nextInt();
                seriesFibonacci(f1, f2,term);
            }
            else{ 
                System.out.println("Please give right input & try again!");
                break;
            }
            sc.nextLine(); //for clear buffer
            int i = 0;
            int j = 3;
            for(i = 0 ; i<j; i++){ 
                
                System.out.println("Do you want to exit ? (Y/N) ");
                String st = sc.nextLine();
                if (st.equals("Y")) {
                    System.out.println("Thanks for using our service ");
                    return;
                }
                else if (st.equals("N")){ 
                    break;
                }
                else{ 
                    System.out.println("Wrong input try again !");
                }
               
            }
            if (i == j ) {
                System.out.println();
                System.out.println("Maximum times reached run the program again.");
                return;
            }
            sc.close();
        }while(true);
      
        
    }public static void seriesFibonacci(int f1,int f2,int term){ 
        if (term == 1) {
            System.out.println(f1);
        }
        else if (term == 2) {
            System.out.print(f1+" "+f2);
        }
        else{ 
            System.out.print("Your fibonacci series here ---> "+f1 +" "+f2+" ");
            for(int i = 3; i<=term; i++){ 
              int f3 = f1 + f2;
                  f1 = f2;
                  f2 = f3;
                  System.out.print(f3+" ");
            }
            System.out.println();
            
        }

    }public static void directSeries(int f1,int f2,int term ){ 
        for(int i = 3; i<=term; i++){ 
            int f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
          }
          int yourTerm = f2;
          System.out.println("At "+term+" your fibonacci number is "+yourTerm);
          System.out.println();
    }
}
