package org.java_SummerStudy;

public interface Movable {
	//지정된 위치(x,y)로 이동하는 메서드
	void move(int x, int y);
}
interface Attacktable {
	//지정된 대상(u)을 공격하는 메서드
	void attack(Unit u);
}
interface Fightable extends Movable, Attacktable{}
