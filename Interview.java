
public class Inter{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        for(int i =1;i<=x;i++){
            for(int y=1;y<=i;y++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}