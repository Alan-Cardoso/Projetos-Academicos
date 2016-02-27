package br.com.alvorada.gerenciadordealunos.v2_0_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * STUDENTS MANAGEMENT SOFTWARE - SMS
 * 
 * Phase 01 CRUD operations with next attributes (name, documentNumber,
 * classroom).
 * 
 * Phase 02 register students grades
 * 
 */

public class CadastroDeAlunos {

	private static final int REDRAW_VALUE = 10;
	private static final int POSITION_NAME = 0;
	private static final int POSITION_CPF = 1;
	private static final int POSITION_CLASS = 2;
	private static final int POSITION_FIRST_GRADE = 0;
	private static final int POSITION_SECOND_GRADE = 1;
	private static String[][] studentTable = new String[10][3];
	private static String[][] gradeTable = new String[10][2];
	private static int firstFreePositionOnDataBase = 0;

	/**
	 * Get keyboard input as a String.
	 * 
	 * @return String
	 */
	private static String getKeyboardInput() {
		String returnValue = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			returnValue = br.readLine();
		} catch (IOException e) {
		}
		return returnValue;
	}

	/**
	 * Get keyboard input as a String showing a message to user.
	 * <p>
	 * The return is always a String.
	 * </p>
	 * 
	 * <pre>
	 * String name = getKeyboardInput("Type a name:\n")
	 * </pre>
	 * 
	 * @param messageToShowBeforeGetInput
	 * @return String
	 */
	private static String getKeyboardInput(String messageToShowBeforeGetInput) {
		System.out.print(messageToShowBeforeGetInput);
		return getKeyboardInput();
	}

	/**
	 * Get keyboard input as a String showing a message to user e testing if the
	 * value can be parsed.
	 * <p>
	 * The return is always a String, but it's possible test if desired parse is
	 * possible adding the first letter of parse type
	 * </p>
	 * <br>
	 * possible options: i
	 * 
	 * <pre>
	 * Integer number = Integer.parseInt(getKeyboardInput("Type an Integer", i))
	 * </pre>
	 * 
	 * @param messageToShowBeforeGetInput
	 * @param firstLetterOfDesiredParse
	 * @return String
	 */
	private static String getKeyboardInput(String messageToShowBeforeGetInput, char firstLetterOfDesiredParse) {
		System.out.print(messageToShowBeforeGetInput);
		return getKeyboardInput(firstLetterOfDesiredParse);
	}

	/**
	 * Get keyboard input as a String and testing if the value can be parsed.
	 * <p>
	 * The return is always a String, but it's possible test if desired parse is
	 * possible adding the first letter of parse type
	 * </p>
	 * <br>
	 * possible options: i
	 * 
	 * <pre>
	 * Integer number = Integer.parseInt(getKeyboardInput("Type an Integer", i))
	 * </pre>
	 * 
	 * @param firstLetterOfDesiredParse
	 * @return String
	 */
	private static String getKeyboardInput(char firstLetterOfDesiredParse) {
		String returnValue = getKeyboardInput();
		while (!validateInput(returnValue, firstLetterOfDesiredParse)) {
			System.out.println("O valor digitado é inválido, tente novamente:");
			returnValue = getKeyboardInput();
		}
		return returnValue;
	}

	/**
	 * Test if a value (valueToTest) can be parsed to a choose type. That type
	 * could be informed with its first letter.
	 * <p>
	 * <br>
	 * Examples: <br>
	 * Integer - 'I'; <br>
	 * int - 'i'; <br>
	 * String - 'S'
	 * </p>
	 * 
	 * @param valueToTest
	 * @param firstLetterOfDesiredParse
	 * @return true - if value can be parsed <br>
	 *         false - if value cannot be parsed
	 */
	private static boolean validateInput(String valueToTest, char firstLetterOfDesiredParse) {
		boolean parseableValue = false;
		String[] numbers0To9 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		switch (firstLetterOfDesiredParse) {
		case 'i':
			for (int i = 0; i < valueToTest.length(); i++) {
				for (String number : numbers0To9) {
					if (valueToTest.substring(i, i + 1).equals(number)) {
						parseableValue = true;
						break;
					}
				}
				if (!parseableValue) {
					break;
				}
			}
			break;
		default:
			break;
		}
		return parseableValue;
	}

	/**
	 * Clear screen jumping 50 lines. WTF!!!
	 */
	private static void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	/**
	 * Expands array size. <br>
	 * actualSize plus REDRAW_VALUE
	 * 
	 * @param originalArray
	 *            - array to resize.
	 * @return greater array than original with all data included
	 */
	private static String[][] increaseArray(String[][] originalArray) {
		String[][] temporaryArray = new String[originalArray.length + REDRAW_VALUE][originalArray[0].length];
		for (int lineNumber = 0; lineNumber < firstFreePositionOnDataBase; lineNumber++) {
			for (int columnNumber = 0; columnNumber < originalArray[0].length; columnNumber++) {
				temporaryArray[lineNumber][columnNumber] = originalArray[lineNumber][columnNumber];
			}
		}
		return temporaryArray;
	}

	/**
	 * Retract array size. <br>
	 * actualSize minus REDRAW_VALUE
	 * 
	 * @param originalArray
	 *            - array to resize.
	 * @return smaller array than original with all data included
	 */
	private static String[][] decreaseArray(String[][] originalArray) {
		String[][] temporaryArray = new String[originalArray.length - REDRAW_VALUE][originalArray[0].length];
		for (int lineNumber = 0; lineNumber < firstFreePositionOnDataBase; lineNumber++) {
			for (int columnNumber = 0; columnNumber < originalArray[0].length; columnNumber++) {
				temporaryArray[lineNumber][columnNumber] = originalArray[lineNumber][columnNumber];
			}
		}
		return temporaryArray;
	}

	/**
	 * Option 1 of program - Insert a group of students in database
	 */
	private static void insertStudent() {
		int numberOfEntryes = Integer.parseInt(getKeyboardInput("Quantos alunos deseja cadastrar?\n", 'i'));
		if ((firstFreePositionOnDataBase + numberOfEntryes) >= studentTable.length) {
			studentTable = increaseArray(studentTable);
			gradeTable = increaseArray(gradeTable);
		}
		for (int i = 0; i < numberOfEntryes; i++) {
			System.out.println((i + 1) + "º Aluno:");
			String studentName = getKeyboardInput("Digite o nome do aluno:");
			String studentDocument = getKeyboardInput("Digite o número do CPF:", 'i');
			String studentClass = getKeyboardInput("Digite a classe:");
			updateOneFullEntryOfStudents(firstFreePositionOnDataBase, studentName, studentDocument, studentClass);
			updateOneFullEntryOfGrades(firstFreePositionOnDataBase, "0", "0");
			firstFreePositionOnDataBase++;
			System.out.println("\n\n");
		}

	}

	/**
	 * Update all attributes of one line
	 * @param entryLine
	 * @param studentName
	 * @param studentDocument
	 * @param studentClass
	 */
	private static void updateOneFullEntryOfStudents(int entryLine, String studentName, String studentDocument,
			String studentClass) {
		studentTable[entryLine][POSITION_NAME] = studentName;
		studentTable[entryLine][POSITION_CPF] = studentDocument;
		studentTable[entryLine][POSITION_CLASS] = studentClass;
	}

	/**
	 * Update all grades of one student
	 * 
	 * @param firstGrade
	 * @param secondGrade
	 */
	private static void updateOneFullEntryOfGrades(int studentId, String firstGrade, String secondGrade) {
		gradeTable[studentId][POSITION_FIRST_GRADE] = firstGrade;
		gradeTable[studentId][POSITION_SECOND_GRADE] = secondGrade;
	}

	/**
	 * Option 2 of program - list all entries
	 */
	private static void listAllEntryesOnDataBase() {
		clearScreen();
		System.out.println("-----------------------------------");
		for (int positionStudent = 0; positionStudent < firstFreePositionOnDataBase; positionStudent++) {
			listOneEntry(positionStudent);
			System.out.println("-----------------------------------");
		}
	}

	/**
	 * List just one entry (Student)
	 * 
	 * @param positionStudent
	 * @call by method list all entries
	 */
	private static void listOneEntry(int positionStudent) {
		System.out.println("NOME:\t" + studentTable[positionStudent][POSITION_NAME]);
		System.out.println("ID:\t" + positionStudent);
		System.out.println("CPF:\t" + studentTable[positionStudent][POSITION_CPF]);
		System.out.println("CLASSE:\t" + studentTable[positionStudent][POSITION_CLASS]);
		System.out.println("NOTA:\t\t1º BIMESTRE\t2º BIMESTRE");
		System.out.print("     \t\t" + gradeTable[positionStudent][POSITION_FIRST_GRADE] + "\t\t"
				+ gradeTable[positionStudent][POSITION_SECOND_GRADE] + "\n");
	}

	/**
	 * Option 3 of program - find user by name
	 */
	private static void findStudentByName() {
		String nameToSearch = getKeyboardInput("Digite o nome do aluno que deseja encontrar:");
		int entriesFound = 0;
		System.out.println("-----------------------------------");
		for (int lineNumber = 0; lineNumber < firstFreePositionOnDataBase; lineNumber++) {
			if (nameToSearch.equalsIgnoreCase(studentTable[lineNumber][POSITION_NAME])) {
				listOneEntry(lineNumber);
				System.out.println("-----------------------------------");
				entriesFound++;
			}
		}
		System.out.println("\n\n FORAM ENCONTRADOS " + entriesFound + " ALUNOS COM ESSE NOME.");
	}

	/**
	 * Option 4 of program - update grades
	 */
	private static void updateGrades() {
		int optionChosen = 9;
		do {
			System.out.println("- CADASTRO DE NOTAS -\n\n");
			System.out.println("  1 – cadastrar notas de toda a classe");
			System.out.println("  2 – alterar notas de toda a classe");
			System.out.println("  3 – alterar nota de um aluno (Você precisa conhecer o ID do aluno)");
			System.out.println("  4 – exibir a lista de alunos cadastrados");
			System.out.println("  5 – encontrar o ID de um aluno");
			System.out.println();
			System.out.println("  9 – sair da opção de cadastro de notas)");
			optionChosen = Integer.parseInt(getKeyboardInput('i'));
			switch (optionChosen) {
			case 1:
				clearScreen();
				updateAllClassGrades();
				System.out.println("\n\n\n\nVocê cadastrou as notas de todos ou alunos.\n\n");
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 2:
				clearScreen();
				updateAllClassGrades();
				System.out.println("\n\n\n\nVocê atualizou as notas de toda a classe.\n\n");
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 3:
				clearScreen();
				updateOneStudentGrades();
				clearScreen();
				break;
			case 4:
				clearScreen();
				listAllEntryesOnDataBase();
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 5:
				clearScreen();
				findStudentByName();
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 9:
				break;
			default:
				System.out.println("\n\nOpção inválida:");
				break;
			}
		} while (optionChosen != 9);

	}

	/**
	 * Update grade of all class in one time
	 */
	private static void updateAllClassGrades() {
		for (int studentId = 0; studentId < firstFreePositionOnDataBase; studentId++) {
			System.out.println("Aluno: " + studentTable[studentId][POSITION_NAME]);
			String firstGrade = getKeyboardInput("Digite a nota do primeiro bimestre: ", 'i');
			String secondGrade = getKeyboardInput("Digite a nota do segundo bimestre: ", 'i');
			updateOneFullEntryOfGrades(studentId, firstGrade, secondGrade);
		}
	}

	/**
	 * Update just one student grades
	 */
	private static void updateOneStudentGrades() {

		int studentId = Integer.parseInt(getKeyboardInput("Digite o ID do aluno: ", 'i'));
		listOneEntry(studentId);
		System.out.println(
				"\n\nEsse é o aluno que você vai alterar.\nSe estiver correto \"Y\" caso contrário digite \"N\" e presione enter");
		String rightStudent = getKeyboardInput();
		if (rightStudent.equalsIgnoreCase("y")) {
			String firstGrade = getKeyboardInput("Digite a nota do primeiro bimestre: ", 'i');
			String secondGrade = getKeyboardInput("Digite a nota do segundo bimestre: ", 'i');
			updateOneFullEntryOfGrades(studentId, firstGrade, secondGrade);
		}
	}

	/**
	 * Option 5 of program - update one Student
	 */
	private static void updateStudent() {
		int studentId = Integer.parseInt(getKeyboardInput("Digite o ID do aluno que deseja alterar: ", 'i'));
		listOneEntry(studentId);
		System.out.println(
				"\n\nEsse é o aluno que você vai alterar.\nSe estiver correto \"Y\" caso contrário digite \"N\" e presione enter");
		String rightStudent = getKeyboardInput();
		if (rightStudent.equalsIgnoreCase("y")) {
			String studentName = getKeyboardInput("Digite o nome do aluno:");
			String studentDocument = getKeyboardInput("Digite o número do CPF:", 'i');
			String studentClass = getKeyboardInput("Digite a classe:");
			updateOneFullEntryOfStudents(studentId, studentName, studentDocument, studentClass);
		}

	}

	/**
	 * Option 6 of program - delete one entry
	 */
	private static void deleteStudent() {
		int studentId = Integer.parseInt(getKeyboardInput("Digite o ID do aluno que deseja alterar: ", 'i'));
		listOneEntry(studentId);
		System.out.println(
				"\n\nEsse é o aluno que você vai alterar.\nSe estiver correto \"Y\" caso contrário digite \"N\" e presione enter");
		String rightStudent = getKeyboardInput();
		if (rightStudent.equalsIgnoreCase("y")) {

			for (int i = studentId; i < firstFreePositionOnDataBase; i++) {
				if (i == firstFreePositionOnDataBase - 1) {
					studentTable[i] = null;
				} else {
					studentTable[i][POSITION_NAME] = studentTable[i + 1][POSITION_NAME];
					studentTable[i][POSITION_NAME] = studentTable[i + 1][POSITION_NAME];
					studentTable[i][POSITION_NAME] = studentTable[i + 1][POSITION_NAME];
					gradeTable[i][POSITION_FIRST_GRADE] = gradeTable[i + 1][POSITION_FIRST_GRADE];
					gradeTable[i][POSITION_SECOND_GRADE] = gradeTable[i + 1][POSITION_SECOND_GRADE];
				}
			}
			firstFreePositionOnDataBase--;
		}
		if ((studentTable.length - firstFreePositionOnDataBase) > REDRAW_VALUE) {
			studentTable = decreaseArray(studentTable);
			gradeTable = decreaseArray(gradeTable);
		}
	}

	/**
	 * Option 8 of program - show usage status of database
	 */
	private static void listDatabaseSize() {

		System.out.println("INFORMAÇÕES DA BASE DE DADOS\nTAMANHO TOTAL:\t" + studentTable.length);
		System.out.println("ESPAÇO LIVRE:\t" + (studentTable.length - firstFreePositionOnDataBase));
		System.out.println("ESPAÇO OCUPADO:\t" + firstFreePositionOnDataBase);

	}

	public static void main(String[] args) {

		int optionChosen = 9;
		do {
			clearScreen();
			System.out.println("--------------------------------------------------");
			System.out.println("#### SOFTWARE DE GERENCIAMENTO DE ALUNOS 2.0 ####");
			System.out.println("--------------------------------------------------\n\n");
			System.out.println("  1 – cadastrar alunos");
			System.out.println("  2 – exibir a lista de alunos cadastrados");
			System.out.println("  3 – encontrar um aluno");
			System.out.println("  4 – atualizar notas");
			System.out.println("  5 – atualizar dados de um aluno");
			System.out.println("  6 – excluir aluno");
			System.out.println();
			System.out.println("  8 – mostrar número de alunos cadastrados e espaços livres");
			System.out.println("  9 – sair do programa");
			optionChosen = Integer.parseInt(getKeyboardInput('i'));
			switch (optionChosen) {
			case 1:
				clearScreen();
				insertStudent();
				clearScreen();
				break;
			case 2:
				clearScreen();
				listAllEntryesOnDataBase();
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 3:
				clearScreen();
				findStudentByName();
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 4:
				clearScreen();
				updateGrades();
				clearScreen();
				break;
			case 5:
				clearScreen();
				updateStudent();
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 6:
				clearScreen();
				deleteStudent();
				clearScreen();
				break;
			case 8:
				clearScreen();
				listDatabaseSize();
				getKeyboardInput("\n\nDigite qualquer tecla para continuar.");
				clearScreen();
				break;
			case 9:
				clearScreen();
				System.out.println("\nAté mais!\n\n\n\n\n");
				break;
			default:
				clearScreen();
				System.out.println("OPÇÃO INVÁLIDA\n\n\n\n\n");
				getKeyboardInput("Digite qualquer tecla para continuar.");
				clearScreen();
				break;
			}
		} while (optionChosen != 9);
	}
}