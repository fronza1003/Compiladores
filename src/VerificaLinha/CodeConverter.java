package VerificaLinha;

public class CodeConverter {
	
//	Metodo estático onde envia-se o id do erro e ele retorna a conversão.
	public static String idToLex(int id) {
		switch(id){
        case 2:
            return "Number constat";
        case 3:
            return "Real number constant";
        case 4:
            return "Char constant";
        case 5:
            return "Identifier";
        case 6:
            return "Keyword bool";
        case 7:
            return "Keyword consts";
        case 8:
            return "Keyword def";
        case 9:
            return "Keyword end";
        case 10:
            return "Keyword execute";
        case 11:
            return "Keyword false";
        case 12:
            return "Keyword float";
        case 13:
        	return "Keyword get";
        case 14:
        	return "Keyword ifFalse";
        case 15:
        	return "Keyword ifTrue";
        case 16:
        	return "Keyword input";
        case 17:
        	return "Keyword int";
        case 18:
        	return "Keyword print";
        case 19:
        	return "Keyword println";
        case 20:
        	return "Keyword set";
        case 21:
        	return "Keyword str";
        case 22:
        	return "Keyword true";
        case 23:
        	return "Keyword types";
        case 24:
        	return "Keyword var";
        case 25:
        	return "Keyword whileFalse";
        case 26:
        	return "Keyword whileTrue";
        case 27:
        	return "Token :";
        case 28:
        	return "Token (";
        case 29:
        	return "Token )";
        case 30:
        	return "Token =";
        case 31:
        	return "Token :=";
        case 32:
        	return "Token ,";
        case 33:
        	return "Token &&";
        case 34:
        	return "Token ||";
        case 35:
        	return "Token !";
        case 36:
        	return "Token !=";
        case 37:
        	return "Token <";
        case 38:
        	return "Token <=";
        case 39:
        	return "Token >";
        case 40:
        	return "Token >=";
        case 41:
        	return "Token +";
        case 42:
        	return "Token -";
        case 43:
        	return "Token *";
        case 44:
        	return "Token /";
        default:
        	return "Not found";
		}
	
	}
}
