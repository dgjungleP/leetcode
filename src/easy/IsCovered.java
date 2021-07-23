package easy;

public class IsCovered {

    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] flag = new boolean[51];
        for(int[] range : ranges){
            for(int i = range[0]; i <= range[1];i++){
                flag[i] = true;
            }
        }
        for(int i = left; i <= right; i++){
            if(!flag[i]) return false;
        }
        return true;


    }

    public static void main(String[] args) {

    }
}
