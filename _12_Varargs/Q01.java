package _12_Varargs;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve
		concat("h","a","c","e","r");
		concat("haným"," basrili"," qa");
		
		
		//birden cok stringi alip tek string haline getirecegiz concat
		//miktar belli olmadigi icin ve ayni tipse varargsdir.
		
	}
	public static void concat(String...str) {
		String yeniStr="";
		for (String each : str) {
			yeniStr=yeniStr.concat(each);
			
		}
		System.out.println(yeniStr);
	}

}
