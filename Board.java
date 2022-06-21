package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board {

    // Counter to change player turns
    int turnCounter = 2;

    // Counters to track # of times each button has been clicked
    int buttonClick1 = 0;
    int buttonClick2 = 0;
    int buttonClick3 = 0;
    int buttonClick4 = 0;
    int buttonClick5 = 0;
    int buttonClick6 = 0;
    int buttonClick7 = 0;
    int buttonClick8 = 0;
    int buttonClick9 = 0;
    int buttonClick10 = 0;
    int buttonClick11 = 0;
    int buttonClick12 = 0;
    int buttonClick13 = 0;
    int buttonClick14 = 0;
    int buttonClick15 = 0;
    int buttonClick16 = 0;
    int buttonClick17 = 0;
    int buttonClick18 = 0;
    int buttonClick19 = 0;
    int buttonClick20 = 0;
    int buttonClick21 = 0;
    int buttonClick22 = 0;
    int buttonClick23 = 0;
    int buttonClick24 = 0;
    int buttonClick25 = 0;
    int buttonClick26 = 0;
    int buttonClick27 = 0;
    int buttonClick28 = 0;
    int buttonClick29 = 0;
    int buttonClick30 = 0;
    int buttonClick31 = 0;
    int buttonClick32 = 0;
    int buttonClick33 = 0;
    int buttonClick34 = 0;
    int buttonClick35 = 0;
    int buttonClick36 = 0;
    int buttonClick37 = 0;
    int buttonClick38 = 0;
    int buttonClick39 = 0;
    int buttonClick40 = 0;
    int buttonClick41 = 0;
    int buttonClick42 = 0;

    // Sets the button to display an empty slot
    ImageIcon empty = new ImageIcon(getClass().getResource("emptyCell.png"));

    JFrame frame = new JFrame();

    // Sets the button to display red chip or yellow chip
    ImageIcon redChip = new ImageIcon(getClass().getResource("redChip.png"));
    ImageIcon yellowChip = new ImageIcon(getClass().getResource("yellowChip.png"));

    public static void main(String[] args){
        new Board();
    }

    // Method that changes the chip color based on the player turn
    public String changeChip(JButton button) {
            if(turnCounter % 2 == 0) {
                button.setIcon(redChip);
                turnCounter++;
                String red = "red";
                return red;
            } else {
                button.setIcon(yellowChip);
                turnCounter++;
                String yellow = "yellow";
                return yellow;
            }
    }

    // Checks if Red Player Wins
    public static boolean didRedPlayerWin(String[][] boardGrid) {

        for(int row = 0; row < boardGrid.length; row++) {
            for(int col = 0; col < boardGrid[0].length - 3; col++) {
                if(boardGrid[row][col] == "R" && boardGrid[row][col + 1] == "R" && boardGrid[row][col + 2] == "R" && boardGrid[row][col + 3] == "R") {
                    return true;
                }
            }
        }

        for(int row = 0; row < boardGrid.length - 3; row++) {
            for(int col = 0; col < boardGrid[0].length; col++) {
                if(boardGrid[row][col] == "R" && boardGrid[row + 1][col] == "R" && boardGrid[row + 2][col] == "R" && boardGrid[row + 3][col] == "R") {
                    return true;
                }
            }
        }

        for(int row = 3; row < boardGrid.length; row++) {
            for(int col = 0; col < boardGrid[0].length - 3; col++) {
                if(boardGrid[row][col] == "R" && boardGrid[row - 1][col + 1] == "R" && boardGrid[row - 2][col + 2] == "R" && boardGrid[row - 3][col + 3] == "R") {
                    return true;
                }
            }
        }

        for(int row = 0; row < boardGrid.length - 3; row++) {
            for(int col = 0; col < boardGrid[0].length - 3; col++) {
                if(boardGrid[row][col] == "R" && boardGrid[row + 1][col + 1] == "R" && boardGrid[row + 2][col + 2] == "R" && boardGrid[row + 3][col + 3] == "R") {
                    return true;
                }
            }
        }
        return false;
    }

    // Checks if Yellow Player Wins
    public static boolean didYellowPlayerWin(String[][] boardGrid) {

        for(int row = 0; row < boardGrid.length; row++) {
            for(int col = 0; col < boardGrid[0].length - 3; col++) {
                if(boardGrid[row][col] == "Y" && boardGrid[row][col + 1] == "Y" && boardGrid[row][col + 2] == "Y" && boardGrid[row][col + 3] == "Y") {
                    return true;
                }
            }
        }

        for(int row = 0; row < boardGrid.length - 3; row++) {
            for(int col = 0; col < boardGrid[0].length; col++) {
                if(boardGrid[row][col] == "Y" && boardGrid[row + 1][col] == "Y" && boardGrid[row + 2][col] == "Y" && boardGrid[row + 3][col] == "Y") {
                    return true;
                }
            }
        }

        for(int row = 3; row < boardGrid.length; row++) {
            for(int col = 0; col < boardGrid[0].length - 3; col++) {
                if(boardGrid[row][col] == "Y" && boardGrid[row - 1][col + 1] == "Y" && boardGrid[row - 2][col + 2] == "Y" && boardGrid[row - 3][col + 3] == "Y") {
                    return true;
                }
            }
        }

        for(int row = 0; row < boardGrid.length - 3; row++) {
            for(int col = 0; col < boardGrid[0].length - 3; col++) {
                if(boardGrid[row][col] == "Y" && boardGrid[row + 1][col + 1] == "Y" && boardGrid[row + 2][col + 2] == "Y" && boardGrid[row + 3][col + 3] == "Y") {
                    return true;
                }
            }
        }
        return false;
    }

    public Board(){

        // Resizing the image to fit inside the buttons
        Image image = empty.getImage();
        Image newimg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        empty = new ImageIcon(newimg);

        Image image1 = redChip.getImage();
        Image newimg1 = image1.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        redChip = new ImageIcon(newimg1);

        Image image2 = yellowChip.getImage();
        Image newimg2 = image2.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        yellowChip = new ImageIcon(newimg2);

        // Initializing a 2D array which will store the chips in the grid
        String[][] boardGrid = new String[6][7];

        // Adjusting the JFrame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Connect 4");
        frame.setVisible(true);
        frame.setLayout(new GridLayout(6, 7, 10, 10));
        frame.setSize(new Dimension(900, 800));
        frame.setResizable(false);

        // Buttons
        JButton button1 = new JButton(empty);
        frame.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Checks to see if button has ever been clicked
                if(buttonClick1 == 0) {
                    // Checks to see if the button below has been clicked
                    if(buttonClick8 != 0) {
                        // Changes the chip color
                        changeChip(button1);
                        if(turnCounter % 2 == 0) {
                            // Sets the color to yellow in the 2D array
                            boardGrid[0][0] = "Y";
                            // Checks if Yellow Player Wins
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                // Displays winning message
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            // Sets the color to red in the 2D array
                            boardGrid[0][0] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            // Checks if Red Player Wins
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        // Increments the button counter
                        buttonClick1++;
                    } else {
                        // Error message
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    // Error message
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button2 = new JButton(empty);
        frame.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick2 == 0) {
                    if(buttonClick9 != 0) {
                        changeChip(button2);
                        if(turnCounter % 2 == 0) {
                            boardGrid[0][1] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[0][1] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick2++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button3 = new JButton(empty);
        frame.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick3 == 0) {
                    if(buttonClick10 != 0) {
                        changeChip(button3);
                        if(turnCounter % 2 == 0) {
                            boardGrid[0][2] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[0][2] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick3++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button4 = new JButton(empty);
        frame.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick4 == 0) {
                    if(buttonClick11 != 0) {
                        changeChip(button4);
                        if(turnCounter % 2 == 0) {
                            boardGrid[0][3] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[0][3] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick4++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button5 = new JButton(empty);
        frame.add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick5 == 0) {
                    if(buttonClick12 != 0) {
                        changeChip(button5);
                        if(turnCounter % 2 == 0) {
                            boardGrid[0][4] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[0][4] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick5++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button6 = new JButton(empty);
        frame.add(button6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick6 == 0) {
                    if(buttonClick13 != 0) {
                        changeChip(button6);
                        if(turnCounter % 2 == 0) {
                            boardGrid[0][5] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[0][5] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick6++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button7 = new JButton(empty);
        frame.add(button7);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick7 == 0) {
                    if(buttonClick14 != 0) {
                        changeChip(button7);
                        if(turnCounter % 2 == 0) {
                            boardGrid[0][6] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[0][6] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick7++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button8 = new JButton(empty);
        frame.add(button8);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick8 == 0) {
                    if(buttonClick15 != 0) {
                        changeChip(button8);
                        if(turnCounter % 2 == 0) {
                            boardGrid[1][0] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[1][0] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick8++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button9 = new JButton(empty);
        frame.add(button9);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick9 == 0) {
                    if(buttonClick16 != 0) {
                        changeChip(button9);
                        if(turnCounter % 2 == 0) {
                            boardGrid[1][1] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[1][1] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick9++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button10 = new JButton(empty);
        frame.add(button10);
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick10 == 0) {
                    if(buttonClick17 != 0) {
                        changeChip(button10);
                        if(turnCounter % 2 == 0) {
                            boardGrid[1][2] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[1][2] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick10++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button11 = new JButton(empty);
        frame.add(button11);
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick11 == 0) {
                    if(buttonClick18 != 0) {
                        changeChip(button11);
                        if(turnCounter % 2 == 0) {
                            boardGrid[1][3] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[1][3] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick11++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button12 = new JButton(empty);
        frame.add(button12);
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick12 == 0) {
                    if(buttonClick19 != 0) {
                        changeChip(button12);
                        if(turnCounter % 2 == 0) {
                            boardGrid[1][4] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[1][4] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick12++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button13 = new JButton(empty);
        frame.add(button13);
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick13 == 0) {
                    if(buttonClick20 != 0) {
                        changeChip(button13);
                        if(turnCounter % 2 == 0) {
                            boardGrid[1][5] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[1][5] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick13++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button14 = new JButton(empty);
        frame.add(button14);
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick14 == 0) {
                    if(buttonClick21 != 0) {
                        changeChip(button14);
                        if(turnCounter % 2 == 0) {
                            boardGrid[1][6] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[1][6] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick14++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button15 = new JButton(empty);
        frame.add(button15);
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick15 == 0) {
                    if(buttonClick22 != 0) {
                        changeChip(button15);
                        if(turnCounter % 2 == 0) {
                            boardGrid[2][0] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[2][0] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick15++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button16 = new JButton(empty);
        frame.add(button16);
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick16 == 0) {
                    if(buttonClick23 != 0) {
                        changeChip(button16);
                        if(turnCounter % 2 == 0) {
                            boardGrid[2][1] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[2][1] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick16++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button17 = new JButton(empty);
        frame.add(button17);
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick17 == 0) {
                    if(buttonClick24 != 0) {
                        changeChip(button17);
                        if(turnCounter % 2 == 0) {
                            boardGrid[2][2] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[2][2] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick17++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button18 = new JButton(empty);
        frame.add(button18);
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick18 == 0) {
                    if(buttonClick25 != 0) {
                        changeChip(button18);
                        if(turnCounter % 2 == 0) {
                            boardGrid[2][3] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[2][3] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick18++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button19 = new JButton(empty);
        frame.add(button19);
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick19 == 0) {
                    if(buttonClick26 != 0) {
                        changeChip(button19);
                        if(turnCounter % 2 == 0) {
                            boardGrid[2][4] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[2][4] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick19++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button20 = new JButton(empty);
        frame.add(button20);
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick20 == 0) {
                    if(buttonClick27 != 0) {
                        changeChip(button20);
                        if(turnCounter % 2 == 0) {
                            boardGrid[2][5] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[2][5] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick20++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button21 = new JButton(empty);
        frame.add(button21);
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick21 == 0) {
                    if(buttonClick28 != 0) {
                        changeChip(button21);
                        if(turnCounter % 2 == 0) {
                            boardGrid[2][6] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[2][6] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick21++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button22 = new JButton(empty);
        frame.add(button22);
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick22 == 0) {
                    if(buttonClick29 != 0) {
                        changeChip(button22);
                        if(turnCounter % 2 == 0) {
                            boardGrid[3][0] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[3][0] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick22++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button23 = new JButton(empty);
        frame.add(button23);
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick23 == 0) {
                    if(buttonClick30 != 0) {
                        changeChip(button23);
                        if(turnCounter % 2 == 0) {
                            boardGrid[3][1] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[3][1] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick23++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button24 = new JButton(empty);
        frame.add(button24);
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick24 == 0) {
                    if(buttonClick31 != 0) {
                        changeChip(button24);
                        if(turnCounter % 2 == 0) {
                            boardGrid[3][2] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[3][2] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick24++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button25 = new JButton(empty);
        frame.add(button25);
        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick25 == 0) {
                    if(buttonClick32 != 0) {
                        changeChip(button25);
                        if(turnCounter % 2 == 0) {
                            boardGrid[3][3] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[3][3] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick25++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button26 = new JButton(empty);
        frame.add(button26);
        button26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick26 == 0) {
                    if(buttonClick33 != 0) {
                        changeChip(button26);
                        if(turnCounter % 2 == 0) {
                            boardGrid[3][4] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[3][4] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick26++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button27 = new JButton(empty);
        frame.add(button27);
        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick27 == 0) {
                    if(buttonClick34 != 0) {
                        changeChip(button27);
                        if(turnCounter % 2 == 0) {
                            boardGrid[3][5] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[3][5] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick27++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button28 = new JButton(empty);
        frame.add(button28);
        button28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick28 == 0) {
                    if(buttonClick35 != 0) {
                        changeChip(button28);
                        if(turnCounter % 2 == 0) {
                            boardGrid[3][6] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[3][6] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick28++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button29 = new JButton(empty);
        frame.add(button29);
        button29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick29 == 0) {
                    if(buttonClick36 != 0) {
                        changeChip(button29);
                        if(turnCounter % 2 == 0) {
                            boardGrid[4][0] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[4][0] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick29++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button30 = new JButton(empty);
        frame.add(button30);
        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick30 == 0) {
                    if(buttonClick37 != 0) {
                        changeChip(button30);
                        if(turnCounter % 2 == 0) {
                            boardGrid[4][1] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[4][1] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick30++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button31 = new JButton(empty);
        frame.add(button31);
        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick31 == 0) {
                    if(buttonClick38 != 0) {
                        changeChip(button31);
                        if(turnCounter % 2 == 0) {
                            boardGrid[4][2] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[4][2] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick31++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button32 = new JButton(empty);
        frame.add(button32);
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick32 == 0) {
                    if(buttonClick39 != 0) {
                        changeChip(button32);
                        if(turnCounter % 2 == 0) {
                            boardGrid[4][3] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[4][3] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick32++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button33 = new JButton(empty);
        frame.add(button33);
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick33 == 0) {
                    if(buttonClick40 != 0) {
                        changeChip(button33);
                        if(turnCounter % 2 == 0) {
                            boardGrid[4][4] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[4][4] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick33++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button34 = new JButton(empty);
        frame.add(button34);
        button34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick34 == 0) {
                    if(buttonClick41 != 0) {
                        changeChip(button34);
                        if(turnCounter % 2 == 0) {
                            boardGrid[4][5] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[4][5] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick34++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button35 = new JButton(empty);
        frame.add(button35);
        button35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick35 == 0) {
                    if(buttonClick42 != 0) {
                        changeChip(button35);
                        if(turnCounter % 2 == 0) {
                            boardGrid[4][6] = "Y";
                            boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                            if(yellowPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        } else {
                            boardGrid[4][6] = "R";
                            boolean redPlayerWin = didRedPlayerWin(boardGrid);
                            if(redPlayerWin == true) {
                                JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                        buttonClick35++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button36 = new JButton(empty);
        frame.add(button36);
        button36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* if(buttonClick36 == 0) {
                    if(changeChip(button36) == "red") {
                        changeChip(button36);
                        boardGrid[5][0] = "R";
                    } else if(changeChip(button36) == "yellow") {
                        changeChip(button36);
                        boardGrid[5][0] = "Y";
                    }
                    buttonClick36++;
                } */

                if(buttonClick36 == 0) {
                    changeChip(button36);
                    if(turnCounter % 2 == 0) {
                        boardGrid[5][0] = "Y";
                        boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                        if(yellowPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    } else {
                        boardGrid[5][0] = "R";
                        boolean redPlayerWin = didRedPlayerWin(boardGrid);
                        if(redPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }
                    buttonClick36++;
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button37 = new JButton(empty);
        frame.add(button37);
        button37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick37 == 0) {
                    changeChip(button37);
                    if(turnCounter % 2 == 0) {
                        boardGrid[5][1] = "Y";
                        boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                        if(yellowPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    } else {
                        boardGrid[5][1] = "R";
                        boolean redPlayerWin = didRedPlayerWin(boardGrid);
                        if(redPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }
                    buttonClick37++;
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button38 = new JButton(empty);
        frame.add(button38);
        button38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick38 == 0) {
                    changeChip(button38);
                    if(turnCounter % 2 == 0) {
                        boardGrid[5][2] = "Y";
                        boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                        if(yellowPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    } else {
                        boardGrid[5][2] = "R";
                        boolean redPlayerWin = didRedPlayerWin(boardGrid);
                        if(redPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }
                    buttonClick38++;
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button39 = new JButton(empty);
        frame.add(button39);
        button39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick39 == 0) {
                    changeChip(button39);
                    if(turnCounter % 2 == 0) {
                        boardGrid[5][3] = "Y";
                        boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                        if(yellowPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    } else {
                        boardGrid[5][3] = "R";
                        boolean redPlayerWin = didRedPlayerWin(boardGrid);
                        if(redPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }
                    buttonClick39++;
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button40 = new JButton(empty);
        frame.add(button40);
        button40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick40 == 0) {
                    changeChip(button40);
                    if(turnCounter % 2 == 0) {
                        boardGrid[5][4] = "Y";
                        boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                        if(yellowPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    } else {
                        boardGrid[5][4] = "R";
                        boolean redPlayerWin = didRedPlayerWin(boardGrid);
                        if(redPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }
                    buttonClick40++;
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button41 = new JButton(empty);
        frame.add(button41);
        button41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick41 == 0) {
                    changeChip(button41);
                    if(turnCounter % 2 == 0) {
                        boardGrid[5][5] = "Y";
                        boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                        if(yellowPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    } else {
                        boardGrid[5][5] = "R";
                        boolean redPlayerWin = didRedPlayerWin(boardGrid);
                        if(redPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }
                    buttonClick41++;
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button42 = new JButton(empty);
        frame.add(button42);
        button42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonClick42 == 0) {
                    changeChip(button42);
                    if(turnCounter % 2 == 0) {
                        boardGrid[5][6] = "Y";
                        boolean yellowPlayerWin = didYellowPlayerWin(boardGrid);
                        if(yellowPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Yellow Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    } else {
                        boardGrid[5][6] = "R";
                        boolean redPlayerWin = didRedPlayerWin(boardGrid);
                        if(redPlayerWin == true) {
                            JOptionPane.showMessageDialog(frame, "Connect 4! Red Player Wins!", "Winning Message", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }
                    buttonClick42++;
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a valid slot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}


