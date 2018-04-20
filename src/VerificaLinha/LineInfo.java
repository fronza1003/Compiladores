package VerificaLinha;

public class LineInfo {
	
	private int lineNumber;
	private int firstPosition;
	private int lastPosition;
	
//	Objeto contendo o número da linha, primeira posição e ultima posição, contendo os gets e sets
	public LineInfo(int ln, int fp, int lp) {
		setLineNumber(ln);
		setFirstPosition(fp);
		setLastPosition(lp);
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int ln) {
		this.lineNumber = ln;
	}

	public int getFirstPosition() {
		return firstPosition;
	}

	public void setFirstPosition(int fp) {
		this.firstPosition = fp;
	}

	public int getLastPosition() {
		return lastPosition;
	}

	public void setLastPosition(int lp) {
		this.lastPosition = lp;
	}
	
	

}
