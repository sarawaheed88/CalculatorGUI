import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Font f18 = new Font ( " Times New Roman " , Font.BOLD , 18 );
        Font f28 = new Font ( " Times New Roman " , Font.BOLD , 28 );



        JFrame frame = new JFrame( " Calculater ");
        frame.setSize( 435 , 420);
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setLayout( null );

        JLabel oldValue = new JLabel(" 0 ");
        JLabel op = new JLabel();
        JLabel newValue = new JLabel( " 0 ");
        JButton btn0 = new JButton(" 0 ");
        JButton btnDot = new JButton(" . ");
        JButton btn1 = new JButton(" 1 ");
        JButton btn2 = new JButton(" 2 ");
        JButton btn3 = new JButton (" 3 ");
        JButton btn4 = new JButton(" 4 ");
        JButton btn5 = new JButton(" 5 ");
        JButton btn6 = new JButton(" 6 ");
        JButton btn7 = new JButton(" 7 ");
        JButton btn8 = new JButton(" 8 ");
        JButton btn9 = new JButton(" 9 ");
        JButton btnPlus = new JButton(" + ");
        JButton btnMin = new JButton(" - ");
        JButton btnMult = new JButton(" * ");
        JButton btnDiv = new JButton(" / ");
        JButton btnEqual = new JButton(" = ");
        JButton btnRemove = new JButton(" <--");
        JButton btnClear = new JButton(" C ");
        JButton btnSign = new JButton(" + / - ");




        oldValue.setBounds( 0, 5 , 380 , 25 );
        op.setBounds( 390 , 5 , 15 , 25 );
        newValue.setBounds( 0, 30 , 400 , 100);
        btnSign.setBounds( 2 , 135 , 100 , 40 );
        btnClear.setBounds( 105 , 135 , 100 , 40 );
        btnRemove.setBounds( 210 , 135 , 100 , 40 );
        btnDiv.setBounds( 315 , 135 , 100 , 40 );
        btn7.setBounds( 2 , 180 , 100 , 40 );
        btn8.setBounds( 105 , 180 , 100 , 40 );
        btn9.setBounds( 210 , 180 , 100 , 40 );
        btnMult.setBounds( 315 , 180 , 100 , 40 );
        btn4.setBounds( 2 , 225 , 100 , 40 );
        btn5.setBounds( 105 , 225 , 100 , 40 );
        btn6.setBounds( 210 , 225 , 100 , 40 );
        btnMin.setBounds( 315 , 225 , 100 , 40 );
        btn1.setBounds( 2 , 270 , 100 , 40 );
        btn2.setBounds( 105 , 270 , 100 , 40 );
        btn3.setBounds( 210 , 270 , 100 , 40 );
        btnPlus.setBounds( 315 , 270 , 100 , 40 );
        btn0.setBounds( 2 , 315 , 205 , 40 );
        btnDot.setBounds( 210 , 315 , 100 , 40 );
        btnEqual.setBounds( 315 , 315 , 100 , 40 );



        oldValue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        newValue.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );


        frame.getContentPane().setBackground( Color.DARK_GRAY );
        oldValue.setBackground( Color.DARK_GRAY );
        oldValue.setOpaque( true );
        op.setBackground( Color.DARK_GRAY );
        op.setOpaque( true );
        newValue.setBackground( Color.DARK_GRAY );
        newValue.setOpaque( true );
        btnEqual.setBackground( Color.BLUE );
        btnPlus.setBackground( Color.DARK_GRAY);
        btnMin.setBackground( Color.DARK_GRAY );
        btnMult.setBackground( Color.DARK_GRAY );
        btnRemove.setBackground( Color.DARK_GRAY );
        btnClear.setBackground( Color.DARK_GRAY );
        btnSign.setBackground( Color.DARK_GRAY );
        btnDiv.setBackground( Color.DARK_GRAY );
        btn0.setBackground( Color.BLACK);
        btn1.setBackground( Color.BLACK);
        btn2.setBackground( Color.BLACK);
        btn3.setBackground( Color.BLACK);
        btn4.setBackground( Color.BLACK);
        btn5.setBackground( Color.BLACK);
        btn6.setBackground( Color.BLACK);
        btn7.setBackground( Color.BLACK);
        btn8.setBackground( Color.BLACK);
        btn9.setBackground( Color.BLACK);
        btnDot.setBackground( Color.BLACK);


        oldValue.setForeground( Color.WHITE );
        op.setForeground( Color.WHITE );
        newValue.setForeground( Color.WHITE );
        btnEqual.setForeground( Color.WHITE );
        btnPlus.setForeground( Color.WHITE );
        btnMin.setForeground( Color.WHITE );
        btnMult.setForeground( Color.WHITE );
        btnRemove.setForeground( Color.WHITE );
        btnClear.setForeground( Color.WHITE );
        btnSign.setForeground( Color.WHITE );
        btnDiv.setForeground( Color.WHITE );
        btn0.setForeground( Color.WHITE );
        btn1.setForeground( Color.WHITE );
        btn2.setForeground( Color.WHITE );
        btn3.setForeground( Color.WHITE );
        btn4.setForeground( Color.WHITE );
        btn5.setForeground( Color.WHITE );
        btn6.setForeground( Color.WHITE );
        btn7.setForeground( Color.WHITE );
        btn8.setForeground( Color.WHITE );
        btn9.setForeground( Color.WHITE );
        btnDot.setForeground( Color.WHITE );


        oldValue.setFont( f18 );
        op.setFont( f18 );
        newValue.setFont( f28 );
        btn0.setFont( f18 );
        btnDot.setFont( f18 );
        btn1.setFont( f18 );
        btn2.setFont( f18 );
        btn3.setFont( f18 );
        btn4.setFont( f18 );
        btn5.setFont( f18 );
        btn6.setFont( f18 );
        btn7.setFont( f18 );
        btn8.setFont( f18 );
        btn9.setFont( f18 );
        btnPlus.setFont( f18 );
        btnMin.setFont( f18 );
        btnMult.setFont( f18 );
        btnDiv.setFont( f18 );
        btnEqual.setFont( f18 );
        btnRemove.setFont( f18 );
        btnClear.setFont( f18 );
        btnSign.setFont( f18 );


        frame.add( oldValue );
        frame.add( op );
        frame.add( btn0 );
        frame.add( btn1 );
        frame.add( btn2 );
        frame.add( btn3 );
        frame.add( btn4 );
        frame.add( btn5 );
        frame.add( btn6 );
        frame.add( btn7 );
        frame.add( btn8 );
        frame.add( btn9 );
        frame.add( btnDot );
        frame.add( btnPlus );
        frame.add( btnMin );
        frame.add( btnMult );
        frame.add( btnDiv );
        frame.add( btnRemove );
        frame.add( btnClear );
        frame.add( btnSign );
        frame.add( btnEqual );


        }
    }
