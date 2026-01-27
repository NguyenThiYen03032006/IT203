public class SS03_06 {
    public static int[] mergeBooks(int[] a,int[] b){
        int[] c=new int[(a.length+b.length)];
        int index=0;
        // ktra trung va them phan tu mang a vao c
        for(int i=0;i< a.length;i++){
            boolean flag=true;
            for(int j=0;j<c.length;j++){
                if(a[i]==c[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                c[index]=a[i];
                index++;
            }
        }
        // tuong tu voi mang b
        for(int i=0;i< b.length;i++){
            boolean flag=true;
            for(int j=0;j<c.length;j++){
                if(b[i]==c[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                c[index]=b[i];
                index++;
            }
        }
        // tao mang d de luu lai mang da gop va loc
        int[] d=new int[index];
        for(int i=0;i<index;i++){
            d[i]=c[i];
        }
        // sap xep lai mang d
        for (int i=0;i<index-1;i++){
            for(int j=0;j<index-1-i;j++){
                if(d[j]>d[j+1]){
                    int temp=d[j];
                    d[j]=d[j+1];
                    d[j+1]=temp;
                }
            }

        }
        return d;
    }
    public static void main(String[] args) {
        int[] arrayFirst={1,3,5,7,9};
        int[] arraySecond={2,3,5,6,8,9,10};
        int[]arrayMerge=mergeBooks(arrayFirst,arraySecond);

        for(int e:arrayMerge){
            System.out.print(e+" ");
        }
    }
}
