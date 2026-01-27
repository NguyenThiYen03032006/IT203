package demo;

public class ArrayDemo {
    public static void main(String[] args) {
        // khai bao mang
        int[] arrayInt;
        Object[] arrayObject;// chua dc cap phat vung nho => tro toi vung nho null

        arrayInt=new int[5];
        arrayObject=new Object[3];
        // khoi tao mang
        arrayInt[0]=10;
        arrayInt[1]=20;
        arrayInt[2]=30;
        arrayInt[3]=40;
        arrayInt[4]=50;

        arrayObject[0]="Hello";
        arrayObject[1]= 123;
        arrayObject[2]=true;

        String[] arrayString={"Java","Python","C++","JavaScript"};
        // ktra do dai mang
        System.out.println("Do dai mang arrayInt: "+ arrayInt.length);
        // duyet mang: thuat toan tim kiem tuan tu
        // cach 1 : for i: duyet theo chi so
        // duyet mang arrayInt de tim ra so lon nhat
        int max=arrayInt[0];
        for(int i=1;i<arrayInt.length;i++){
            if (arrayInt[i]>max){
                max=arrayInt[i];
            }
        }
        // cach 2: for each: duyet mang theo gtri
        for(int e:arrayInt){
            System.out.println("Element: "+e);
        }
        // mang 2 chieu
        int[][] array2D={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // ky thuat lap trinh
        // count, sum,multi,average,min,max,flag,search, ...
        // dem so luong phan tu trong 1 danh sach cho trc
        // tinh tong cua cac ohan tu trong mang so
        // tinh min, max trong 1 danh sach
        // khi bai toan yc ktra kq la co hay khong ma can say ra dk if o trong vong lap it nhat 1 lan => flag

    }
}
