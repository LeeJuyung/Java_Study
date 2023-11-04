package org.java_SummerStudy;

abstract class Unit{
	int x,y;
	abstract void move(int x,int y);
	void stop() {}
}

class Fighter implements Fightable{
	//인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
	public void move(int x,int y) {/*내용*/}
	public void attack(Unit u) {/*내용*/}
}
abstract class 클래스명2 implements Fightable {
	//추상클래스를 일부만 구현할 때, abstract 붙이기
	public void move(int x,int y) {}
}
class 클래스명3 extends Unit implements Fightable{
	//상속과 구현을 동시에 할 수도 있다.
	public void move(int x,int y) {}
	public void attack(Unit u) {}
}