package Ejercicio_3;

import com.sun.opengl.util.Animator;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Ejercicio_3 implements GLEventListener {
    static GLU glu;
    static GL gl;
    static JFrame frame;
    public static int lados=0;
    public static int cont=0;
    public static ArrayList<int[]> trazo = new ArrayList<int[]>();
        
public static void main(String[] args) {  
      lados=Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de lados: "));    
      frame = new JFrame("Ejercicio_3");
      GLCanvas canvas = new GLCanvas();

      canvas.addGLEventListener(new Ejercicio_3());
      frame.add(canvas);
      frame.setSize(640, 480);
      final Animator animator = new Animator(canvas);
      frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            new Thread(new Runnable() {
                public void run() {
                     animator.stop();
                     System.exit(0);
                }
            }).start();
        }
       });
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        
        canvas.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if(cont<lados){
                    if(trazo.size()>0){
                        int[] nuevo ={e.getX(),frame.getHeight()-e.getY()};
                        trazo.set(trazo.size()-1, nuevo);
                    }
                }
            }          
        });
        
        canvas.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                 if(cont==lados){
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(Ejercicio_3.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    reiniciar();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(cont<lados){
                     int[] nuevo={e.getX(),frame.getHeight()-e.getY()};
                        if(trazo.size() == 0){
                             trazo.add(nuevo);
                        }
                       trazo.add(nuevo);
                        cont++;
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
       glu = new GLU();
       gl = drawable.getGL();
       gl.glClearColor(0, 0, 0, 4);
       gl.glMatrixMode(gl.GL_PROJECTION);
       glu.gluOrtho2D(-700, 700, -350, 350);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
     
    }

    public void display(GLAutoDrawable drawable) {
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glLineWidth(1);
        gl.glColor3d(250, 0, 150);
        gl.glPushMatrix();
            gl.glTranslated((-frame.getWidth()/2)+15, (-frame.getHeight()/2)-30, 0);
                if(cont<lados){ 
                   gl.glBegin(GL.GL_LINE_STRIP);
                    if(trazo.size()>0){
                        for(int i=0;i<trazo.size();i++){
                            gl.glVertex2d(trazo.get(i)[0],trazo.get(i)[1]);                       
                        }
                    }
                    gl.glEnd();
               }else{
                gl.glBegin(GL.GL_POLYGON);
                  if(trazo.size()>0){
                    for(int i=0;i<trazo.size();i++){
                        gl.glVertex2d(trazo.get(i)[0],trazo.get(i)[1]);
                    } 
                }
                 gl.glEnd();
               }
           gl.glPopMatrix();
           gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    public static void reiniciar(){
        trazo.clear();
        cont=0;
        lados=Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de lados"));   
    
    }
}