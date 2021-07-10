package model;

import java.awt.Point;
import java.util.Vector;

import javax.swing.undo.AbstractUndoableEdit;

public class Quaylai extends AbstractUndoableEdit {
	protected Vector points;

	protected Point point;

	public Quaylai(Point p, Vector v) {
		points = v;
		point = p;
	}

	public String getPresentationName() {
		return "Square Addition";
	}

	public void undo() {
		super.undo();
		points.remove(point);
	}

	public void redo() {
		super.redo();
		points.add(point);
	}
}