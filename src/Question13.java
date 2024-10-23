public class Question13 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};//2차원배열 선언
        int num=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                num+=arr[i][j];
            }
            System.out.println("각 행 가로의 합은 : "+num);
            num=0;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                num+=arr[j][i];
            }
            System.out.println("각 열 세로의 합은 : "+num);
            num=0;
        }

    }
}



