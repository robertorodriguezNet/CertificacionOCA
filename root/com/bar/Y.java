package com.bar;

/*
	//in file /root/com/foo/X.java
	
	package com.foo;
	public class X{
		public static int LOGICID = 10;
		
		public void apply(int i){
			System.out.println("applied");
		}
	}
*/

//1  <== INSERT STATEMENT(s) HERE
import static com.bar.x.LOGICID;

public class Y{
    public static void main(String[] args){
       System.out.println(X.LOGICID);
    }
}
//What should be inserted at //1 so that Y.java can compile without any error?

// import static X;
// import static com.foo.*;
// import static com.foo.X.*;
// import com.foo.*;
// import com.foo.X.LOGICID;