package com.exam.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*

class MyActionListener implements ActionListener {

	private JTextField tf1;
	
	public void setJTextField(JTextField tf1) {
		this.tf1= tf1;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf1.getText();
		
		System.out.println(str);
		JOptionPane.showMessageDialog(null, str);
		
		tf1.setText("");
		tf1.requestFocus();
	}
	
}

*/

// swing gui
public class Ex1 extends JFrame {
	
	private JButton btn1 = new JButton("버튼1");
	private JButton btn2 = new JButton("버튼2");
	private JTextField tf1 = new JTextField(15);
	

	public Ex1() {
		setTitle("창 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		
		contentPane.add(tf1);
		contentPane.add(btn1);
		contentPane.add(btn2);
		
		//지역 내부클랙스 : 가장 수명이 짧다
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭됨");
				
			}
		};
		btn1.addActionListener(listener);
		/*
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		*/
		
		btn2.addActionListener((event)->System.out.println("버튼2 클릭됨!"));
		
		
		
		
//		MyActionListener listener = new MyActionListener();
//		listener.setJTextField(tf1);
//		btn1.addActionListener(listener);
		
		
		setSize(300, 300);
		setResizable(false);
		setVisible(true);
	} // 생성자
	
	// 이름붙여서  내부클래스 정의
	/*
	class MyActionListener implements ActionListener {
		

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = tf1.getText();
			
			System.out.println(str);
			JOptionPane.showMessageDialog(null, str);
			
			tf1.setText("");
			tf1.requestFocus();
		}
		
	} // class MyActionListener
	
	*/
	public static void main(String[] args) {
		new Ex1();
	} // main method

}
