import java.util.*;

public class sol {
    public static void main(String args[] ) throws Exception {
        Scanner myscanner = new Scanner(System.in);
        String input = myscanner.nextLine();
        int total = 0;
        for(int i=input.length()-1;i>=0;i--){
            int digit=Integer.parseInt(""+input.charAt(i));
            if(i%2==1){
                digit=digit*2;
                if(digit>9){
                    digit=digit-9;
                }
            }
            total=total+digit;
        }
        if(total%10==0){
            System.out.println("valid credit card");
        }else{
            System.out.println("in valid credit card");
        }
    }
}
