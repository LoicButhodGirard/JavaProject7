package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Menu extends MouseAdapter{
	
	Game game;
	
	public Menu(Game game) {
		this.game = game;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(mouseOver(mx, my, 400, 250, 300, 100)) {
			
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if(mx > x && my < x + width) {
			if(my > y && my <y + height) {
				return true;
			}else return false;
		}else return false;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		Font fnt = new Font("arial", 1, 70);
		Font fnt2 = new Font("arial", 1, 50);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Menu", 450, 120);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawRect(400, 250, 300, 100);
		g.drawString("Play", 495, 320);
		
		g.setColor(Color.white);
		g.drawRect(400, 400, 300, 100);
		g.drawString("Help", 495, 465);
		
		g.setColor(Color.white);
		g.drawRect(400, 550, 300, 100);
		g.drawString("Quit", 495, 617);
	}
}
