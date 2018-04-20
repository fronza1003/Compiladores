package VerificaLinha;

import java.util.ArrayList;

public class LineScanner {
	
	private String receivedText;
	private ArrayList<LineInfo> lineArray;
	
//	Objeto de processamento do texto, onde deve ser enviado todo jTextArea, ao ser criado ele automaticamente processa as linhas
//	Criar o objeto ao precionar o botão compile enviando o textArea, assim todo o código será mapeado.
	public LineScanner(String text) {
		setReceivedText(text);
		processLineInfo();
	}

	public String getReceivedText() {
		return receivedText;
	}

	public void setReceivedText(String text) { // t
		this.receivedText = text;
	}

	public ArrayList<LineInfo> getLineArray() { // aqui vai estar o array com todas as linhas posiçoes de inicio e fim FELIPE
		return lineArray;
	}

	public void setLineArray(ArrayList<LineInfo> la) {
		this.lineArray = la;
	}
	
//	Metodo para gerar o objeto lineInto, ele quebra cada linha por /n, pega a posicao do primeiro char e registra como first
//	position soma este valor com o comprimento da linha e adiciona como last position, bem como seta este valor acrescido a 
//	próxima primeira posição, para a linha seguinte.
	private void processLineInfo() {
		String[] lines = getReceivedText().split("\n"); // estava //n alterei para \n FELIPE
		ArrayList<LineInfo> lia = new ArrayList<>();
		int localLn = 0;
		int localFn = 0;
		int localLp = 0;
		for (int i = 0; i < lines.length; i++) {
			//localLn = i++; comentei essa linha pois ela estava pulando o primeiro caracter FELIPE
			localLp = localFn + lines[i].length();
			lia.add(new LineInfo(localLn, localFn, localLp));
			localFn = localLp++;
		}
		setLineArray(lia);
	}
	
//	Deve-se enviar a posição do erro ele percorrerá o ArrayList checando se a posição enviada é maior que a primeira e menor 
//	que a última, se for ele retorna a linha. 
	private int checkLine(int position) { 
		for (LineInfo lineInfo : lineArray) {
			if(position >= lineInfo.getFirstPosition() && position <= lineInfo.getLastPosition())
				return lineInfo.getLineNumber();
		}
		return -1;
	}
	

}
