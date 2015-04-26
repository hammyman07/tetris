/**
 *
 * @author 
 * Reggie Barnett
 * Michael Moore
 * David Nard
 * Graham Taylor
 * Last Updated 4/19/2015, NetBeans IDE 8.0.2
 * CMSC 495
 * Phase 1 Source
 * 
 * Week 5
 * Spring OL1 2014
 */

package tetris;

import java.awt.Graphics;
import javax.swing.*;
import static tetris.Tetris.GameState.mainMenu;

public class Tetris extends JFrame
{
    protected enum GameState { mainMenu, gamePlaying, gamePaused, highScores };
    protected static GameState gameState;
      
    private PlayField playField;
    
    public Tetris()
    {
        playField = new PlayField();
        add(playField);
        gameState = mainMenu;
    }
    
    @Override
    public void paint(Graphics g)
    {
        playField.paintComponent(playField.getGraphics());
        playField.paint(g);
    }
    
    public static void main(String[] args) 
    {
        Tetris game = new Tetris();
        game.setTitle("CMSC495 Tetris Group -- Spring 2015");
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(800, 800);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        game.setResizable(false);
    }    
}