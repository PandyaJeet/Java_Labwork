import java.util.*;

class Multiplication{
    int num;
    public void setData(int n){
        num = n;
    }
    public void checkData(){
        int i = 1 ;
        while(i<=10){
            System.out.println(num + " x " + i + " = " +(i*num));
            i++;
        }
        
    }
}
class MainMultiplication{
    public static void main(String args[]){
        Multiplication obj = new Multiplication();
        Scanner n = new Scanner (System.in);
        int no = n.nextInt();
        obj.setData(no);
        obj.checkData();

    }
}