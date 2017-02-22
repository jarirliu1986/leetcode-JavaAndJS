import java.util.*;

public class MergeIntervals {

	public class Solution {
	    public List<Interval> merge(List<Interval> intervals) {
	        
	        if(intervals.size() <= 1) return intervals;
	        List<Interval> list = new ArrayList<Interval>();
	        
	        Collections.sort(intervals, new Comparator<Interval>(){
	        	@Override
	        	public int compare(Interval x, Interval y){
	        		return Integer.compare(x.start, y.start);
	        	}
	        });
	        
	        int start = list.get(0).start;
	        int end = list.get(0).end;
	        
	        for(Interval interval : intervals){
	        	if(interval.start <= end){
	        		end = Math.max(end, interval.end);
	        	}else{
	        		list.add(new Interval(start, end));
	        		start = interval.start;
	        		end = interval.end;
	        	}
	        }
	        
	        return list;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
