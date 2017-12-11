import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Fushu1 extends JFrame implements ActionListener{
	JButton b;
	JComboBox jc1,jc2;
	Jcomplex ab1,ab2,ab3,ab4;
	public static void main(String[] args) {
		Fushu1 ab=new Fushu1();
	}
	public Fushu1(){
		
		this.setLayout(new GridLayout(4,2,5,5));
		b=new JButton("=");
		b.addActionListener(this);
		jc1=new JComboBox();
		jc1.addItem("+");
		jc1.addItem("-");
		jc2=new JComboBox();
		jc2.addItem("+");
		jc2.addItem("-");
		ab1=new Jcomplex();
		ab2=new Jcomplex(jc1);
		ab3=new Jcomplex(jc2);
		ab4=new Jcomplex(b);
		this.add(ab1);
		
		String[] str={"+","-"};
		jc1=new JComboBox(str);
		this.add(ab2);
		jc2=new JComboBox(str);
		this.add(ab3);
		this.add(ab4);
		
		this.setTitle("复数表达式计算");
		this.setSize(450,220);
		this.setLocation(300,300);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try{
			double sum=0,sum2=0;
			String s1=(String) jc1.getSelectedItem();
			String s2=(String) jc2.getSelectedItem();
			String d1=ab1.jt1.getText();
			String d2=ab2.jt1.getText();
			String d3=ab3.jt1.getText();
			String e1=ab1.jt2.getText();
			String e2=ab2.jt2.getText();
			String e3=ab3.jt2.getText();
			double a=Double.valueOf(d1);
			double a2=Double.valueOf(d2);
			double a3=Double.valueOf(d3);
			double b=Double.valueOf(e1);
			double b2=Double.valueOf(e2);
			double b3=Double.valueOf(e3);
			if(s1.equals("+"))
			{
				sum+=a+a2;
				sum2+=b+b2;
			}
			else{
				sum=a-a2;
				sum2=b-b2;
			}
			if(s2.equals("+"))
			{
				sum+=a3;
				sum2+=b3;
			}
			else
			{
				 sum-=a3;
				 sum2-=b3;
			}
			ab4.jt1.setText(String.valueOf(sum));
			ab4.jt2.setText(String.valueOf(sum2));
		}catch(Exception e){
			System.out.println("数值转化格式错误！！！");
		}
	}
}
