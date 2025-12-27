import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long [] prefix = new long[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i=1;i<=N;i++){
            int x = Integer.parseInt(st.nextToken());
            prefix[i]= prefix[i-1]+x;
        }

        StringBuilder sb = new StringBuilder();

        for (int q=0;q<M;q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            long ans = prefix[j]-prefix[i-1];
            sb.append(ans).append("\n");
        }

        System.out.print(sb.toString());


    }
}
