// Slime.java

package game;

import javax.swing.JOptionPane;

class Slime {
	
	String name;
	int hp = 80;
	
	// ������
	public Slime(String n) {
		
		name = n;
		
	}
	
	// ����
	public void attack(Human h) {
		
		if(hp > 0) {
		
			System.out.println(name + "�� " + h.name + "�� �����ߴ�");
			h.hp = h.hp - 10;
		
			if(h.hp < 1) {
				JOptionPane.showMessageDialog(null, "Game Over");
				System.exit(0);
			}
				
		System.out.println("���� " + h.name + "�� ü���� " + h.hp + "�̴�\n");
		
		}
		
	}

}
