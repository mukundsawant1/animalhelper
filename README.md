# Animal Helper Model
##Given Code - 
```
class Animal {
	void walk(){
	System.out.println("I am walking");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
}
public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
```
#A)
1. Can you implement the sing() method for the bird?
	1. How did you unit test it? **Added Test class**