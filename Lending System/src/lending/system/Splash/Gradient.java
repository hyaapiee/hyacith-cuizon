
package lending.system.Splash;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;

import javax.swing.JPanel;
public class Gradient {
    
   private final Color gradientStart;
    private final Color gradientEnd;

    public Gradient(Color gradientStart, Color gradientEnd) {
        this.gradientStart = gradientStart;
        this.gradientEnd = gradientEnd;
    }

    public void paintComponent(Graphics g) {
        int height = getHeight();
        Graphics2D g1 = (Graphics2D) g;
        GradientPaint painter = new GradientPaint(0, 0, gradientStart,
                0, height, gradientEnd);
        Paint oldPainter = g1.getPaint();
        g1.setPaint(painter);
        g1.fill(g1.getClip());
        painter = new GradientPaint(0, 0, gradientEnd,
                0, height / 2, gradientStart);
        g1.setPaint(painter);
        g1.fill(g1.getClip());

        painter = new GradientPaint(0, height / 2, gradientStart,
                0, height, gradientEnd);
        g1.setPaint(painter);
        g1.fill(g1.getClip());

        g1.setPaint(oldPainter);
    }

    private int getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

