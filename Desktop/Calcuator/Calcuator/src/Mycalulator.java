
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mycalulator extends JFrame implements ActionListener {
    private final String[]KEYS={"7","8","9","+","4","5","6","-","1","2","3","*","0",".","=","/"};
    private final String[]Command={"删除","AC"};
    private JButton[] keys=new JButton[KEYS.length];
    private JButton[] coms=new JButton[Command.length];
    private JTextField text=new JTextField("0");
    private boolean Firstdigit=true;//是否第一次输入
    private double result=0.0;//结果
    private String operator = "=";//默认操作为"="
    private boolean operateValidFlag = true;//操作是否合法
    public Mycalulator() {
        // TODO Auto-generated constructor stub
        init();
        this.setTitle("计算器");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(width, height)
        this.pack();
    }
    private void init() {
        // TODO Auto-generated method stub
        text.setHorizontalAlignment(JTextField.RIGHT);//文本右对齐
        text.setEditable(false);//不可编辑
        text.setBackground(Color.WHITE);//背景白色
        JPanel keyspanel=new JPanel();//装按键的画板
        keyspanel.setLayout(new GridLayout(4,4,3,3));//布局为网格布局4行4列 水平竖直间距都为3像素
        for(int i=0;i<keys.length;i++){//创建按钮
            keys[i]=new JButton(KEYS[i]);
            keyspanel.add(keys[i]);//在画板上添加按钮
            keys[i].setForeground(Color.blue);//按键前景色蓝色
        }
        //运算符按键前景色为红
        keys[3].setForeground(Color.red);
        keys[7].setForeground(Color.red);
        keys[11].setForeground(Color.red);
        keys[14].setForeground(Color.red);
        keys[15].setForeground(Color.red);
        JPanel comspanel=new JPanel();
        comspanel.setLayout(new GridLayout(1,2,3,3));
        for(int i=0;i<coms.length;i++){
            coms[i]=new JButton(Command[i]);
            comspanel.add(coms[i]);
        }
        JPanel panel1=new JPanel();
        panel1.setLayout(new BorderLayout(3,3));// 画板采用边界布局管理器，画板里组件之间的水平和垂直方向上间隔都为3象素
        panel1.add("North", comspanel);
        panel1.add("Center", keyspanel);
        JPanel top = new JPanel();  
        top.setLayout(new BorderLayout()); 
        top.add("Center", text);  
        getContentPane().setLayout(new BorderLayout(3,5));
        getContentPane().add("North", top);  
        getContentPane().add("Center", panel1);  
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i].addActionListener(this);  
        }  
        for (int i = 0; i < Command.length; i++) {  
            coms[i].addActionListener(this);  
        }  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String label=e.getActionCommand();
        if(label==Command[0]){
            handledelete();
        }
        else if(label==Command[1]){
            handleC();
        }
        else if("0123456789.".indexOf(label)>=0){
            handlenumber(label);
        }
        else{
            handleOperator(label);
        }
    }
    private void handleOperator(String label) {
        // TODO Auto-generated method stub
        if(operator.equals("/")){
            if(text.getText()== " 0"){
                text.setText("除数不能为0");
                operateValidFlag=false;
                handleC();
            }
            else{
                result/=Double.valueOf(text.getText());
            }
        }
        else if(operator.equals("*")){
            result*=Double.valueOf(text.getText());
        }
        else if(operator.equals("+")){
            result+=Double.valueOf(text.getText());
        }
        else if(operator.equals("-")){
            result-=Double.valueOf(text.getText());
        }
        else if(operator.equals("=")){
            result=Double.valueOf(text.getText());
        }
        if(operateValidFlag){
            text.setText(String.valueOf(result));
        }
        operator=label;
        Firstdigit = true;//按完运算符后 在输入数字为第一次输入
        operateValidFlag=true;
    }
    private void handlenumber(String label) {
        // TODO Auto-generated method stub
        if(Firstdigit){
            if(label.equals(".")){
                text.setText(text.getText()+".");
            }
            else{
            text.setText(label);
            }
        }
        //按的是"."并且字符串里没"."
        else if(label.equals(".")&&text.getText().indexOf(".")<0){
            text.setText(text.getText()+".");
        }
        //按得是数字
        else if(!label.equals(".")){
            text.setText(text.getText()+label);
        }
        Firstdigit=false;//输过就不是第一次输入了
    }
    private void handleC() {
        // TODO Auto-generated method stub
        text.setText("0");
        Firstdigit=true;
        operator="=";
    }
    private void handledelete() {
        // TODO Auto-generated method stub
        if(text.getText().length()>1){
            text.setText(text.getText().substring(0, text.getText().length()-1));
        }
        else if(text.getText().length()==1){
            text.setText("0");
        }
    }
    public static void main(String args[]) {  
        Mycalulator calculator1 = new Mycalulator();  
         
//        Mycalulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}
