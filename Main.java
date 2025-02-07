import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Bn = sc.nextInt();
    int Pb = (Bn-1)%8+1;
    int Co = 0;
    String Cot="";
    switch (Pb){
        case 1:
            Co = 4;
            Cot = "LB";
            break;
          case 2:
            Co = 5;
            Cot="MB";
            break;
        case 3:
            Co = 6;
            Cot= "UB";
            break;
        case 4:
            Co = 1;
            Cot ="LB";
            break;
        case 5:
            Co = 2;
            Cot ="MB";
            break;
        case 6:
               Co =3;
               Cot="UB";
               break;
              case 7:
               Co =8;
               Cot ="SU";
               break;
              case 8:
                  Co = 7;
                  Cot="SL";
                  break;
            }
            int CoP = (Bn-1)/8*8+Co;   
            
            System.out.println(CoP+Cot);
    
        sc.close();
   }
}