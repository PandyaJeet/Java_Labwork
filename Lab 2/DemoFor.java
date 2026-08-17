import java.util.*;

class For{
    int num;
    public void setData(int n){
        num = n;
    }
    public void checkData(){
        for (int i = 1 ; i <= num; i++){
            System.out.println(i);
        }
    }
}
class DemoFor{
    public static void main(String args[]){
        For obj = new For();
        Scanner n = new Scanner (System.in);
        int no = n.nextInt();
        obj.setData(no);
        obj.checkData();
        
    }
}