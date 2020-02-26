package FromYouTube;

public class RemoveDuplicateItem {


    public static void main(String[] args) {
        //Examples {1,2,3,4,5,6},{1,2,3,4,2,5},{12,32,1,3,6,2,12,3,1,2},{}
        int[] sampleData ={12,32,1,3,6,2,12,3,1,2};

        int[] result = RemoveDuplicate(sampleData);

        for (int i=0; i<result.length;i++){
            System.out.println(result[i]);

        }
    }

    static int[] RemoveDuplicate(int [] givenArray){
        if (givenArray == null ||givenArray.length == 0){
            return givenArray;
        }else {
            int[] output= new int[givenArray.length];
            int counter =0;

            boolean isDuplicate =false;
            for (int i=0; i< givenArray.length; i++){
                isDuplicate =false;
                for (int j=0; j <output.length;j++){
                    if (givenArray[i]==output[j]){
                        isDuplicate=true;
                        break;
                    }
                }
            if (isDuplicate==false) {
                output[counter] = givenArray[i];
                counter++;
            }
            }
            if (counter == output.length){
                return output;
            }
        else {
        int[] filteredoutput=new int[counter];
        for (int x=0; x< filteredoutput.length; x++){
            filteredoutput[x] = output[x];
        }
        return filteredoutput;
        }
        }


    }
}
