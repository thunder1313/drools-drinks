package com.sample;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gui {

	public static String printQuestion(String question, ArrayList<String> answers) {
    	Object[] possibleAnswers = answers.toArray();
    	int index = JOptionPane.showOptionDialog(
    					null,
    					question,
    					"",
    					JOptionPane.DEFAULT_OPTION,
    					JOptionPane.INFORMATION_MESSAGE,
    					null,
    					possibleAnswers,
    					possibleAnswers[0]);
    	return answers.get(index);
    }
	
	public static void showDrink(String choice) {
		JOptionPane.showMessageDialog(null, choice);
	}
}