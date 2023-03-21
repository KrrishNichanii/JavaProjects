import java.util.Scanner;
class guesser {
    int guessNum;
    int upperLimit;
    int lowerLimit;

    int guessingNum() {
        Scanner s = new Scanner(System.in);
        boolean a = false;
        System.out.println("Let's enter the range first");

        System.out.print("Enter lower limit ");
        lowerLimit = s.nextInt();
        System.out.print("Enter upper limit ");
        upperLimit = s.nextInt();
        do {
            System.out.println("Guesser!! guess the number");
            guessNum = s.nextInt();
            if (guessNum > upperLimit || guessNum < lowerLimit) {
                a = true;
                System.out.println("Number out of range. Guess again");
            }
            else{
                a=false;
            }
        } while (a);
        return guessNum;
    }
}
    class Player{
        String name;
        int guessNum;
        int upperLimit;
        int lowerLimit;
        int guessingNum(){
            Scanner s=new Scanner(System.in);
            /*guesser g=new guesser();
            upperLimit=g.upperLimit;
            lowerLimit=g.lowerLimit;*/

            System.out.print("Enter name of player ");
            name=s.nextLine();


                System.out.println(name + " guess a number  " );
                guessNum = s.nextInt();

            return guessNum;

        }

    }
    class umpire{
    int guesserNum;
    int player1;
    int player2;
    int player3;
    String name1;
    String name2;
    String name3;
    void gNum(){
        guesser g=new guesser();
        guesserNum=g.guessingNum();
    }
    void pNum(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        player1=p1.guessingNum();
        player2=p2.guessingNum();
        player3=p3.guessingNum();
        name1=p1.name;
        name2=p2.name;
        name3=p3.name;

    }
    void compare(){

        if(guesserNum==player1) {
            if (guesserNum == player2 && guesserNum == player3) {
                System.out.println("All are winners");
            } else if (guesserNum == player2) {
                System.out.println(name1 + " and " + name2 + " are the winners");
            } else if (guesserNum == player3) {
                System.out.println(name1 + " and " + name3 + " are the winners");
            } else {
                System.out.print(name1 + " is the winner");
            }
        }
            else if(guesserNum==player2)
        {
            if(guesserNum==player3)
            {
                System.out.print(name2+" and "+name3+" are the winners");
            }
            else{
                System.out.print(name2+" is the winner");
            }
        }
            else if(guesserNum==player3){
                System.out.print(name3+" is the winner");
        }
            else{
                System.out.print("No one is the winner");
        }

    }
    }
    public class Main {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||i+j==n-1&&i>=(n-1)/2||i==j&&j>(n-1)/2||j==n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("   ");
            for(int j=0;j<n;j++)
            {
                if(j==0||i==0||i==(n-1)/2||i==n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("   ");
            for(int j=0;j<n;j++)
            {
                if(j==0||i==n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            for(int j=0;j<n;j++)
            {
                if(i==0&&j>1||j==0&&i>1&&i<n-2||i==n-1&&j>1||j==1&&i==1||j==1&&i==n-2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            for(int j=0;j<n;j++)
            {
                if(i==0&&j>1&&j<n-2||j==n-1&&i>1&&i<n-2||i==n-1&&j>1&&j<n-2||j==0&&i>1&&i<n-2||j==1&&i==1||j==n-2&&i==1||j==n-2&&i==n-2||j==1&&i==n-2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            for(int j=0;j<n;j++)
            {
                if(j==0||j==n-1||i==j&&i<(n-1)/2||i+j==n-1&&j>=(n-1)/2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            for(int j=0;j<n;j++)
            {
                if(i==0||i==n-1||i==(n-1)/2||j==0)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
        umpire u=new umpire();
        u.gNum();
        u.pNum();
        u.compare();
    }
}