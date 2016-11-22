
public class ConvertaNumbertoHexadecimal {
    //ֱ�ӽ�num���������Ƶ�����ȥ����Ȼ��ÿ4λӳ��һ�ξͺ�,Ȼ���߼�λ�ƾͺ�
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            sb.append(map[(num & 15)]); 
            num = (num >>> 4);
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args){
    	int n=12;
    	ConvertaNumbertoHexadecimal r = new ConvertaNumbertoHexadecimal();
    	System.out.println(r.toHex(n));
    }
}
