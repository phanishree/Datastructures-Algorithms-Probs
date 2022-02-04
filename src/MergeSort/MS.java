package MergeSort;





public class MS{

    static int b[]=new int[100];
    static int j=0;
    static int a[]={3,2,5,3,8,9};
    public static void main(String args[]){


        divide(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);




    }

    public static void divide(int a[],int left,int right){

        if(left>=right){
            return;
        }

        int mid=(left+right)/2;

        divide(a,left,mid);
        divide(a,mid+1,right);

        conquer(a,left,mid,right);


    }

    public static void conquer(int a[],int l,int m,int r){


int n1 = m - l + 1;
        int n2 = r - m;
        int le[]=new int[n1];
        int re[]=new int[n2];

        for(int i=0;i<n1;i++)
        le[i]=a[l+i];
        for(int i=0;i<n2;i++)
        re[i]=a[m+i+1];

        int i=0,j=0;
        int k=l;

        while(i<n1&&j<n2){
            if(le[i]<re[j]){
            a[k]=le[i];
            i++;
            }else {
            a[k]=re[j];
            j++;
            }
            k++;
        }
        while(i<n1){
        a[k]=le[i];
        i++;
        k++;
        }
         while(j<n2){
        a[k]=re[j];
        j++;
        k++;
        }

    }

}

/* */