public class PermMissingElem {

    public static int solution(int[] A) {
        if(A.length == 0){
            return 1;
        }

        int[] count = new int[A.length+2];
        for (int i=0; i < A.length; i++){
            count[A[i]] = 1;
        }

        for (int i=1; i < count.length; i++){
            if(count[i] == 0){
                return i;
            }
        }

        return -1;

    }
}


