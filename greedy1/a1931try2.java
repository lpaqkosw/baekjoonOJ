package greedy1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class a1931try2 {
    static SortedMap<Integer,Integer> map = new TreeMap<>();
    static int cnt=1;
    static int maxbegin;
    static int minendkey;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int initstart = Integer.parseInt(st.nextToken());
        int initend = Integer.parseInt(st.nextToken());
        map.put(initstart, initend);
        minendkey=initstart;
        maxbegin=initstart;
        for(int i = 2; i < n+1;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(start>maxbegin){
                maxbegin=start;
            }
            if(map.get(start)==null || end<map.get(start)){
                map.put(start, end);
                if(end<map.get(minendkey)){
                    minendkey=start;
                }
            }
        }

    
        min(map.get(minendkey));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(cnt+" ");
        bw.close();
    }

    static void min(int start){
        int loop = maxbegin+1;
        int min = Integer.MAX_VALUE;
        int minkey = -1;
        if(start>maxbegin){
            return;
        }
        SortedMap<Integer,Integer> tmp = map.subMap(start, loop);
        Iterator it= tmp.keySet().iterator();
        if(!it.hasNext()){
            return;
        }
        for(;;){
            int next = (int)it.next();
            if(next >= loop){
                if(min==map.get(minkey)){
                    min+=1;
                }
                min(min);
                break;
            } else{
                if(tmp.get(next)<min){
                    min=tmp.get(next);
                    minkey = next;
                    loop = tmp.get(next);
                }
                if(!it.hasNext()){
                    break;
                }
            }
        }
        // System.out.println("----------------");
        // System.out.println("min: "+map.get(minkey));
        // System.out.println("minkey: "+minkey);
        // System.out.println("----------------");
        cnt++;
    }
}

    

