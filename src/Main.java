
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void s(int[] arr, int st, int en) { //st=0 //en=arr.length-1
        if (st >= en) { // st와en이 같다면 배열안에 1개의 값만 들어있다 ==> 탈출조건
            return;
        }
        int pivot = st; //기준값을 각배열의 인덱스0으로 설정
        int l = st + 1; //st는 기준값이므로 다음인덱스부터 정렬
        int r = en;


//엇갈리면 while문 종료
        while (l <= r) {
            while (l <= en && arr[l] <= arr[pivot]) {
// 배열의 왼쪽에서부터 pivot보다 큰값을 찾을때까지 l++;
                l += 1;
            }
            while (r > st && arr[pivot] <= arr[r]) {
// 배열의 오른쪽에서부터 pivot보다 작은값을 찾을때까지 r--;
                r -= 1;
            }

            if (l > r) {  // 엇갈렸으면 r과 pivot의 위치를 바꾼다
// [5,4,2,0,3,1,6,9,7,8] ==> [1,4,2,0,3,5,6,9,7,8]
                int tem = arr[pivot];
                arr[pivot] = arr[r];
                arr[r] = tem;
            } else { // 엇갈리지 않았으면 l과 r의 위치를 바꾼다
//[5,7,9,0,3,1,6,2,4,8] ==> [5,4,9,0,3,1,6,2,7,8]
                int tem = arr[l];
                arr[l] = arr[r];
                arr[r] = tem;
            }

//							[2,1,3,4,5,9,7,6,8]
            s(arr, st, r - 1);  //분할 후 pivot의 왼쪽 부분
            s(arr, r + 1, en); //분할 후 pivot의 오른쪽 부분
//							[2,1,3,4,5,9,7,6,8]
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }

        Main main = new Main();
        main.s(arr,0,arr.length-1);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",arr[i]);

        }
    }
}