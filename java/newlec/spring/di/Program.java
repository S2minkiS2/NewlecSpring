package newlec.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		ApplicationContext context = new ClassPathXmlApplicationContext("newlec/spring/di/setting.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		console.print();
		
	}

}
