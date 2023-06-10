class nonuniqueDuplicate
{
public static void main(String args[])
{
int arr[]={1,2,8,4,5,2,5,4,8,9};
for(int i=0;i<arr.length;i++){
   for(int j=i+1;j<arr.length;j++){
       if(arr[i]==arr[j])
          {
          System.out.println("The non-unique duplicate elements in an array are:"+arr[j]);
          }
}
}
}
}