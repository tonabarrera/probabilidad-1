package interfaz;
import calculos.Integracion;
import excepciones.SigmaMenorQueCero;
import static interfaz.interfaz.nfinal;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;
public class resultados extends JFrame implements ActionListener
{
    private JButton btnregresar;
    private JTextArea txtArea;
    private JLabel lblTitulo;
    private int posx,posy;
     public void frame()
    {
        this.setSize(800, 600);
        this.setLocationRelativeTo(this);
        posx = this.getX();
        posy = this.getY();
        this.setLocation(posx+450, posy+25);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        this.setTitle("Resultados");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        
        lblTitulo = new JLabel("Resultados de la integración");
        
        btnregresar = new JButton("Regresar");
        btnregresar.setBounds(600, 500,100, 30);
        add(btnregresar);
        btnregresar.addActionListener(this);
        btnregresar.setVisible(true);
        
        
        txtArea = new JTextArea("Resultados");
        txtArea.setBounds(100, 75, 600, 400);
        add(txtArea);
        txtArea.setVisible(true);
        
       this.setVisible(false);
       //this.setVisible(true);
    }
     
    public void mostrar(boolean b)
    {
        this.setVisible(b);
        this.setState(NORMAL);
    }
     
     
     @Override
     public void actionPerformed(ActionEvent evento)
     {
         if(evento.getSource().equals(btnregresar))
         {
             this.setVisible(false);
         }
     }
     
    public static void main(String[] args) {
        resultados res = new resultados();
        res.frame();
    }
     
    public void mostrarResultados(String a1,String b2,String miu1,String sigma1)
    {
        try{
            double a = Double.parseDouble(a1);
            double b = Double.parseDouble(b2);
            double miu = Double.parseDouble(miu1);
            double sigma = Double.parseDouble(sigma1);
            int n = nfinal;
            double resultado = 0;
            
            if(sigma < 0) throw new SigmaMenorQueCero();
            
            Integracion integral = new Integracion();
            
            resultado = integral.integrar(sigma, miu, a, b, n);
            
            txtArea.setText("El resultado es: " + Math.abs(resultado));
        }
        catch(SigmaMenorQueCero e){
            JOptionPane.showMessageDialog(rootPane, "Sus datos son incorrectos buen hombre.\n" + e.getMessage());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Sus datos son incorrectos\n" + "No hemos podido convertir a uno o más datos.");
        }
    }
    
    public void modoAutomatico()
    {
         FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            int n = nfinal;
            double resultado = 0;
            
            
            String temp = "";
            
            Integracion integral = new Integracion();
            
            fichero = new FileWriter("resultados.txt");
            pw = new PrintWriter(fichero);
            
            txtArea.setText("Calculando...");
            for(double i = -5.99; i<6; i +=0.01)
            {
                i = (double)Math.round(i*100)/100;
                temp = "b = " + i + " Resultado = " + integral.integrar(i, n);
                pw.println(temp);
                System.out.println(temp);
            }
            
            txtArea.setText("El resultado es: " + "ta muy grande para mostrarlo aqui, mejor ve el archivo resultados.txt");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Sus datos son incorrectos buen hombre.\n" +e+ "No hemos podido convertir a uno o más datos.");
        }
        finally{
            try {
                if (null != fichero){
                   fichero.close();
                }
            }
            catch (Exception e2) {
                e2.printStackTrace();
           }
        }
    }
}
