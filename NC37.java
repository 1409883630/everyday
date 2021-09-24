//NC37 合并区间
//给出一组区间，请合并所有重叠的区间。
//请保证合并后的区间按区间起点升序排列、
import java.util.*;
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res=new ArrayList<>();
        Collections.sort(intervals,(o1,o2)->{
            if(o1.start!=o2.start)
                return o1.start-o2.start;
            else
                return o1.end-o2.end;
        });
        int l=intervals.size();
        int i=0;
        while(i<l){
            Interval tmp=intervals.get(i);
            int j=i+1;
            while(j<l && intervals.get(j).start<=tmp.end){
                tmp=new Interval(
                    tmp.start,Math.max(tmp.end,intervals.get(j).end));
                j++;
            }
            res.add(tmp);
            i=j;
        }
        return res;
    }
}
