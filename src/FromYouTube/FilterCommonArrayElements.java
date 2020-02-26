package FromYouTube;

public class FilterCommonArrayElements {
//Examples
// {1,8,3,2},{4,2,6,1}
//{1,8,3,2,6},{2,6,1}
// {1,3,7,9},{7,1,9,3}
//{1,2},{3,4}
//{},{1,2,3}
//{1,2},{}
//{1,2},{}
//{1,2},null...but null is not working he didn't see it

    public static void main(String[] args) {
int[] sample1={1,2};
int [] sample2={3,4};

int[] result = FilterCommonElement(sample1,sample2);
for (int i=0; i<result.length;i++){
    System.out.println(result[i]);

}
    }
static  int[] FilterCommonElement(int[] firstArray,int[] secondArray){
        int [] output ={};
        if (firstArray == null || secondArray == null){
            return null;
        }
        else if (firstArray.length==0 || secondArray.length ==0){
            return output;
        }
        else {
            int commonElementArraySize;
            if (firstArray.length>secondArray.length){
                commonElementArraySize=secondArray.length;
            }
            else {
                commonElementArraySize=firstArray.length;
            }
            int[] commonElements =new int[commonElementArraySize];
            int counter =0;
        for (int i=0;i< firstArray.length;i++){
            for (int j=0; j<secondArray.length;j++){
                if (firstArray[i] == secondArray[j]){
                    commonElements[counter]=firstArray[i];
                    counter= counter+1;
                }
            }
        }
        if (counter == commonElementArraySize){
            return  commonElements;
        }
        else {
            int[] finalCommonElements=new int[counter];

            for (int x=0; x< finalCommonElements.length;x++){
                finalCommonElements[x] =commonElements[x];

            }
            return finalCommonElements;
        }
        }
}

}
