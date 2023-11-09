package newlec.spring.di;

import newlec.spring.di.entity.Exam;
import newlec.spring.di.entity.NewlecExam;
import newlec.spring.di.ui.ExamConsole;
import newlec.spring.di.ui.GridExamConsole;
import newlec.spring.di.ui.InlineExamConsole;

public class Program {

	public Program() {
		
	}
	
	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole(exam);
		
		console.setExam(exam);  
		*/
		
		ExamConsole console = ?;
		console.print();
		
	}

}
