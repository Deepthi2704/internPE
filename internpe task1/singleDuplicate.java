class singleDuplicate
{
public static void main(String args[])
{
int arr[]={1,2,4,5,2,5,4,4,2};
outer:
for(int i=0;i<arr.length;i++){
   inner:
   for(int j=i+1;j<arr.length;j++){
       if(arr[i]==arr[j])
          {
          System.out.println("The single duplicate element in an array is:"+arr[j]);
          break outer;
          }
}
}
}
}