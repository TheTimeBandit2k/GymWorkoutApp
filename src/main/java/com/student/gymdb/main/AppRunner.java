package com.student.gymdb.main;

import com.student.gymdb.ui.MainDashboard;
import javax.swing.SwingUtilities;


public class AppRunner {
    public static void main (String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainDashboard appWindow = new MainDashboard();
            appWindow.setLocationRelativeTo(null);
            appWindow.setVisible(true);
        });
        
    }
}
