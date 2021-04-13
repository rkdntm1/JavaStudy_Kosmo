package view;

import javax.swing.JButton;

import model.Cell;

public class ButtonCell extends JButton {
	private Cell cell;

	public ButtonCell(Cell cell) {
		super(" ");
		this.cell = cell;
	}

	protected Cell getCell() {
		return cell;
	}
	
}
