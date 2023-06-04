class args{
    public static void main(String[] args) {
        int a[] = {2,3,1,5,3,2,7,7,1,3};
        for(int i=0;i<a.length;i++)
        {
            int count=1;
            int x= 0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    a[j]=0;
                    x=i;
                }
            }
            if(a[i]!=0&&count>1)
            {
                System.out.println(a[i]+":-"+x);
            }
        }
    }
}