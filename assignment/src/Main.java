import java.util.Scanner;
public class Main {                      //WAP to print the alphabets A,B,C,D,E,F,G,H using pattern programming logic
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || i > 0 && j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i==0&&j<n-1||j==0||i==n-1&&j<n-1||j==n-1&&i>0&&i<(n-1)/2||i==(n-1)/2&&j<n-1||i>(n-1)/2&&i<n-1&&j==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i==0&&j>1||j==0&&i>1&&i<n-2||i==n-1&&j>1||j==1&&i==1||i==n-2&&j==1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j==0||i==0&&j<n-2||j==n-1&&i>1&&i<n-2||i==n-1&&j<n-2||j==n-2&&i==1||j==n-2&&i==n-2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==(n-1)/2||i==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i==0&&j>1&&j<n-2||i>1&&i<n-2&&j==0||j>1&&j<n-2&&i==n-1||j==n-1&&i>(n-1)/2&&i<n-2||j==n-1&&j>1&&j<(n-1)||j==1&&i==1||j==1&&i==n-2||j==n-2&&i==n-2||j==n-2&&i==1||i==((n-1)/2)+1&&j>(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j==0||i==(n-1)/2||j==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }


            System.out.println();
        }

    }
}
