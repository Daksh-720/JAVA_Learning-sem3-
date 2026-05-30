public class S3_9 {
    public static void main(String[] args){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int n4 = Integer.parseInt(args[3]);


        int smallest = n1;

        if(n2<smallest){
            smallest = n2;
        }

        if(n3<smallest){
            smallest = n3;
        }

        if(n4<smallest){
            smallest = n4;
        }

        System.out.println("Smallest no.: "+ smallest);
    }
    
}
