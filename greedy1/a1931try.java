// package greedy1;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.StringTokenizer;

// public class a1931try {
//     public static void main(String[] args) throws NumberFormatException, IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int cnt=1;

//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int initstart = Integer.parseInt(st.nextToken());
//         int initend = Integer.parseInt(st.nextToken());
//         meeting.put(initstart, initend);
//         int minendkey=initstart;
//         int maxbegin=initstart;
//         for(int i = 2; i < n+1;i++){
//             int start = Integer.parseInt(st.nextToken());
//             int end = Integer.parseInt(st.nextToken());
//             if(start>maxbegin){
//                 maxbegin=start;
//             }
//             if(meeting.get(start)==null || end<meeting.get(start)){
//                 meeting.put(start, end);
//                 if(end<meeting.get(minendkey)){
//                     minendkey=start;
//                 }
//             }
//         }

//         int loopend = maxbegin;
//         for(int i = meeting.get(minendkey);i<=loopend; i++){
//             if()
//         }

//     }
// }
