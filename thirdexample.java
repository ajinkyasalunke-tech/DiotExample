class thirdexample{
    public static void name(int no) {
        System.out.println("Odd no are"+no);
        for (int i=0;i<no;i++) {
            if(i/2==0){
                break;
            }else{
                System.out.println(i);
            }
        }
        
    }
}