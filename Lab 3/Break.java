import java.util.*;

class Break{
    int num ;
    public void setData(int n){
        num = n;
    }
    public void checkData(){
        for(int i = 0 ; i < num ;i++){
            if(i==10)
                break;
            if (i%2==0)
                continue;
                System.out.println(i);
        }
    }
    public static void main(String args[]){
        Break obj = new Break();
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        obj.setData(no);
        obj.checkData();
    }
}