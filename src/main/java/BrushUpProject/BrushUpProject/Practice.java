package BrushUpProject.BrushUpProject;

/**
 * @author sunil
 *
 */

public class Practice {
	int c;

	public void test() {
		
		System.out.println("result:"+ c);
		
	}
	
	public static void main(String[] args) {
		Practice p=new Practice(2, 3);
		//p.test();
	}
	 
	 public Practice(int a, int b) {
		    c=a+b;
			System.out.println("in constructor");
		}
	 static  {
			System.out.println(" starts");
		}
}
