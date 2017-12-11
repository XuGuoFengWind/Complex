import java.awt.*;
import javax.swing.*;
public class Jcomplex extends JPanel{
	JTextField jt1,jt2;
	JLabel jl1,jl2;
	public Jcomplex(){
		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jl1=new JLabel("+");
		jl2=new JLabel("i");
		this.add(jt1);
		this.add(jl1);
		this.add(jt2);
		this.add(jl2);
	}
	public Jcomplex(JButton b){
		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jl1=new JLabel("+");
		jl2=new JLabel("i");
		this.add(b);
		this.add(jt1);
		this.add(jl1);
		this.add(jt2);
		this.add(jl2);
	}
	public Jcomplex(JComboBox jc){
		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jl1=new JLabel("+");
		jl2=new JLabel("i");
		this.add(jc);
		this.add(jt1);
		this.add(jl1);
		this.add(jt2);
		this.add(jl2);
	}
}
