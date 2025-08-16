public class patterns{
    public static void main(String args[]){
        // int i,j =0;
        // for(i=0;i<5;i++){
        //     for (j=0;j<5;j++){
        //         System.out.print("* ");

        //     }
        //     System.out.println();
        // }
    
        // for(i = 0;i<5;i++){
        //     for(j=0;j<5;j++){
        //         if(i==0||i==4 )
        //             System.out.print("* ");
        //         else if(j==0||j==4)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();

        // }
        // for(i=0;i<5;i++){
        //     for(j=0;j<=i;j++){
        //         System.out.print("* ");

        //     }
        //     System.out.println();
        // }
        // for(i=0;i<5;i++){
        //     for(j=0;j<5;j++){
        //         if(5-i>j)
        //         System.out.print(" ");
        //         else if (5-i<=j)
        //         System.out.print("* ");
                
        //     }
        //     System.out.println();
        // }
        // for(i =0;i<5;i++){
        //     for(j=0;j<5;j++){
        //         if(4-j<=i)
        //         System.out.print("* ");
        //         else if(4-j>i)
        //         System.out.print("  ");
                
        //     }
        //     System.out.println();
        // }
        int i,j = 0;
        for(i =1;i<=8;i++){
            for(j=1;j<=8;j++){
                if(j-i<=0)
                    System.out.print("*");
                else if(9-i<=j)
                System.out.println("*");

            }
            System.out.println("");
        }




    }}