import java.util.*;

class doWhile{
    int num;
    public void setData(int n){
        num = n;
    }
    public void checkData(){
        int i = 0 ;
        do{
            i++;
            System.out.println(i);
        }while(i<num);
        
    }
    public static void main(String args[]){
        doWhile obj = new doWhile();
        Scanner n = new Scanner (System.in);
        int no = n.nextInt();
        obj.setData(no);
        obj.checkData();

    }
}