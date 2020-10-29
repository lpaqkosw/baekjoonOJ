package greedy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class a1931 {
    static Map<Integer,Integer> meeting = new HashMap<>();
    static int cnt = 1;
    static List<Integer> keys;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int initstart = Integer.parseInt(st.nextToken());
        int initend = Integer.parseInt(st.nextToken());
        meeting.put(initstart, initend);
        int minendkey=initstart;
        int maxbegin=initstart;
        for(int i = 2; i < n+1;i++){
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(start>maxbegin){
                maxbegin=start;
            }
            if(meeting.get(start)==null || end<meeting.get(start)){
                meeting.put(start, end);
                if(end<meeting.get(minendkey)){
                    minendkey=start;
                }
            }
        }
        
        keys = new ArrayList<>(meeting.keySet());
        Collections.sort(keys);

    }

    // static int getNext(int begin,int loopend){
    //     int tmp = loopend;
    //     for(int i = begin;i<=tmp; i++){
    //         if(meeting.get(i)==null){
    //             continue;
    //         }
    //         if(meeting.get(i)<=)
    //     }
    // }
}
