package greedy1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a1931try3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Team[] teams = new Team[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            teams[i] = new Team(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(teams); // 회의실 종료 시간을 기준으로 정렬
        int count = 1;
        int end = teams[0].end;
        for (int i = 1; i < n; i++) {
            if(end <= teams[i].start ) {
                count++;
                end = teams[i].end;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
    private static class Team implements Comparable<Team> { 
        int start;
        int end;

        Team(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Team o) {
            if(this.end > o.end){
                return 1;
            } else if(this.end == o.end){
                if(this.start > o.start){
                    return 1;
                }
            }
            
            return -1;
        }
        }
    }

