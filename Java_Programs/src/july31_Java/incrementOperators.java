package july31_Java;

public class incrementOperators {

	public static void main(String[] args) {
		
		// Post incr [ a++]: First use then update itself
		
//		int a = 5;
//		int b = a++;
//		System.out.println(a);//6
//		System.out.println(b);//5
//		
//		int x = 10;
//		System.out.println(x++);//10
//		
//		int c = 4;
//		int d = 3 + c++;
//		System.out.println(c);//5
//        System.out.println(d);	//7
//        
//        int r = 2;
//        int s = r++ + r;
//        
//        System.out.println(r);//3
//        System.out.println(s);//5
//        
//        int n = 7;
//        int m = n++;
//        int p = n++;
//        
//        System.out.println(n);//9
//        System.out.println(m);//7
//        System.out.println(p);//8
        
       System.out.println("______________________________________________________"); 
		
     // Pre incr [ ++a]: First update then use 
        
//        
//       int a = 5;
//       int b = ++a;
//       System.out.println(a);//6
//       System.out.println(b);//

       int x = 10;
       System.out.println(++x);//11
//       
//       int a = 4;
//       int b = 3 + ++a;
//       System.out.println(a);//5
//       System.out.println(b);//8
       
       int m = 5;
       int n = ++m + ++m;
       System.out.println(m);//7
       System.out.println(n);//13
       
       int a = 2;
       int b = ++a + a + ++a;
       System.out.println(a);//4
       System.out.println(b);//10
		
	}

}
