package d0609_03_OOP3;

public class Person {
	
     private int power;
     private int speed;
     private int level;
     String name;
    
     
     
     
     public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Person(){}
//     Person(int power, int speed, int level, String name) {
//    	 this.power = power;
//    	 this.speed = speed;
//    	 this.level = level;
//    	 this.name = name;
//     }
     
     Person(int p, int s, int l, String n) {
    	 this.power = p;
    	 p = 10;
    	 this.speed = s;
    	 s = 20;
    	 this.level = l;
    	 l = 30;
    	 this.name = n;
    	 n = "장휘주";
     }
     
    public void show() {
    	System.out.println(this.name + ", " + this.level + ", " + speed);
    }
    
}

