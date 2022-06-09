package d0609_06_verify;

class printer{
    private int numOfPapers = 0;
    
    public void setPapers(int papers) {
    	this.numOfPapers = papers;
    }
    
    public print(int amounts) {
	      numOfPapers -= amounts;
    }
    
    public void reset(int reset) {
    	numOfPapers = 0;
    }

}

public class PrintDemo {

	public static void main(String[] args) {
		// 1. 인스턴스  2. 용지 셋팅  3. 용시 사용  4. 현재 용지 출력
       printer p = new printer();
       p.setPapers(100);
       p.print(70);
       System.out.println(p);
       
		
	}

}
