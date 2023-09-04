package com.github.hotelalura;

import java.awt.EventQueue;

import com.github.hotelalura.views.MenuMain;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMain main = new MenuMain();
					main.setVisible(true);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
