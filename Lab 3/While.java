import java.util.*;

class While{
    int num;
    public void setData(int n){
        num = n;
    }
    public void checkData(){
        int i = 0 ;
        while(i<=num){
            System.out.println(i);
            i++;
        }
        
    }
    public static void main(String args[]){
        While obj = new While();
        Scanner n = new Scanner (System.in);
        int no = n.nextInt();
        obj.setData(no);
        obj.checkData();

    }
}