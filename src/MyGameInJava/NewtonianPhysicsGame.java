package MyGameInJava;

import java.util.ArrayList;

import javax.vecmath.Matrix3f;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;
import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
import com.jogamp.newt.opengl.GLWindow;

public class NewtonianPhysicsGame implements GLEventListener, KeyListener {
    private float angle = 0;
    private Matrix3f rotation = new Matrix3f();
    private Matrix4f shipTransform3D = new Matrix4f();
    private Vector3f velocity = new Vector3f(0, -0.01f, 0);

    private GLU glu = new GLU();
    private GLUT glut = new GLUT();
    private GLWindow window;

    public NewtonianPhysicsGame() {
        window = GLWindow.create(new GLCapabilities(null));
        window.setTitle("Newtonian Physics Game");
        window.setSize(600, 600);
        window.addGLEventListener(this);
        window.addKeyListener(this);

        window.setVisible(true);
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClearColor(0, 0, 0, 0);
        gl.glShadeModel(GL2.GL_SMOOTH);
        gl.glEnable(GL2.GL_DEPTH_TEST);
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

        gl.glLoadIdentity();
        glu.gluLookAt(0, 0, 10, 0, 0, 0, 0, 1, 0);

        gl.glPushMatrix();
        shipTransform3D.setIdentity();
        shipTransform3D.setTranslation(velocity);
        gl.glMultMatrixf(shipTransform3D.getArray(), 0);
        glut.glutWireCube(2);
        gl.glPopMatrix();

        if (shipTransform3D.getTranslation(new Vector3f()).y <= -5) {
            velocity.y = -velocity.y;
        }

        if (shipTransform3D.getTranslation(new Vector3f()).x <= -5 ||
                shipTransform3D.getTranslation(new Vector3f()).x >= 5) {
            velocity.x = -velocity.x;
        }

        if (shipTransform3D.getTranslation(new Vector3f()).z <= -5 ||
                shipTransform3D.getTranslation(new Vector3f()).z >= 5) {
            velocity.z = -velocity.z;
        }

        gl.glBegin(GL2.GL_QUADS);
        // back wall
        gl.glVertex3f(-5, 5, -5);
        gl.glVertex3f(-5, -5, -5);
        gl.glVertex3f(5, -5, -5);
        gl.glVertex3f(5, 5, -5);

        // front wall
        gl.glVertex3f(-5, 5, 5);
        gl.glVertex3f(-5, -5, 5);
        gl.glVertex3f(5, -5, 5);
        gl.glVertex3f(5, 5, 5);

        // left wall
        gl.glVertex3f(-5, 5, -5);
        gl.glVertex3f(-5, -5, -5);
        gl.glVertex3f(-5, -5, 5);
        gl.glVertex3f(-5, 5, 5);

        // right wall
        gl.glVertex3f(5, 5, -5);
        gl.glVertex3f(5, -5, -5);
        gl.glVertex3f(5, -5, 5);
        gl.glVertex3f(5, 5, 5);

        // floor
        gl.glVertex3f(-5, -5, -5);
        gl.glVertex3f(-5, -5, 5);
        gl.glVertex3f(5, -5, 5);
        gl.glVertex3f(5, -5, -5);

        // ceiling
        gl.glVertex3f(-5, 5, -5);
        gl.glVertex3f(-5, 5, 5);
        gl.glVertex3f(5, 5, 5);
        gl.glVertex3f(5, 5, -5);
        gl.glEnd();

        window.swapBuffers();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glViewport(0, 0, width, height);

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        glu.gluPerspective(60, (float) width / (float) height, 1, 100);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;
            case KeyEvent.VK_UP:
                velocity.y += 0.01f;
                break;
            case KeyEvent.VK_DOWN:
                velocity.y -= 0.01f;
                break;
            case KeyEvent.VK_LEFT:
                velocity.x -= 0.01f;
                break;
            case KeyEvent.VK_RIGHT:
                velocity.x += 0.01f;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Newtonian Physics Simulation");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        GLProfile profile = GLProfile.getDefault();
        GLCapabilities capabilities = new GLCapabilities(profile);

        GLCanvas canvas = new GLCanvas(capabilities);

        canvas.addGLEventListener(new PhysicsSimulation());
        canvas.addKeyListener(new PhysicsSimulation());

        frame.add(canvas);
        frame.setVisible(true);
    }
}
