package TrabalhoFinal1;

import Lexico.LexicalError;
import Lexico.Lexico;
import Lexico.SemanticError;
import Lexico.SyntaticError;
import VerificaLinha.LineInfo;

public class Compilador {
	
	private boolean error;
	private LineInfo line;
	
	public String sintaxCheck(String source) {
		error = true;
		Lexico lexico = new Lexico();
		lexico.setInput(source);
		try {
			//sintatico.parse(lexico, semantico);
			error = false;
			return "Programa compilado com sucesso!";
		} catch (LexicalError e) {
			return e.getMessage();
		} catch (SyntaticError e) {
			return "Erro na linha " + lexico.getLinha() + " - " + e.getMessage();
		} catch (SemanticError e) {
			return "Erro na linha " + lexico.getLinha() + " - " + e.getMessage();
		}
	}
	

}
