package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		for(int i = 0; i <object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	public void clearEnemys() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
<<<<<<< HEAD
			if(tempObject.getId() == ID.BasicEnemy) removeObject(tempObject);
			if(tempObject.getId() == ID.SmartEnemy) removeObject(tempObject);
			if(tempObject.getId() == ID.LargeEnemy) removeObject(tempObject);
			if(tempObject.getId() == ID.FastEnemy) removeObject(tempObject);
=======
			
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.EnemyBoss || tempObject.getId() == ID.SmartEnemy || tempObject.getId() == ID.FastEnemy || tempObject.getId() == ID.LargeEnemy || tempObject.getId() == ID.EnemyBoss) removeObject(tempObject);
>>>>>>> 497cde5f7f3e0fb57902fc8b369c30ef986192c0
		}
	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
	
}
