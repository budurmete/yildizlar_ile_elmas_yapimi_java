import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp =  new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int numb= imp.nextInt();
        int ydnumb=numb;
        for (int i =0; i<=numb;i++)
        {
            for (int k =0; k<(numb-i);k++)
                {System.out.print(" ");}
            for (int c =1; c<=(2*i+1);c++)
                {System.out.print("*");}
            System.out.println();
        }

        for (int  i =0; i<=ydnumb;ydnumb--)
        {
            for (int k =-1; k<(numb-ydnumb);k++)
            {System.out.print(" ");}
            for (int c =1; c<=(2*ydnumb-1);c++)
            {System.out.print("*");}
            System.out.println();
        }



    }
}