package newlec.spring.di;

import java.util.ArrayList;
import java.util.List;

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
		
		/* 스프링에게 지시하는 방법으로 코드를 변경하자 (setting.xml)
		Exam exam = new NewlecExam();
		// ExamConsole console = new InlineExamconsole(exam); //DI
		ExamConsole console = new GridExamConsole(exam); //생성자를 통해서 결합
		
		console.setExam(exam) 
		
		*/
		
		// setting.xml 지시서를 읽고 bean생성해서 IoC container에 넣어놔라. 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("newlec/spring/di/setting.xml");
		
		
		//Exam exam = context.getBean(Exam.class); //자료형명으로 꺼내기
		//System.out.println(exam.toString());
		
		//ExamConsole console = (ExamConsole) context.getBean("console"); //id명으로 꺼내기
		ExamConsole console = context.getBean(ExamConsole.class); //자료형명으로 꺼내기
		console.print();
		
		//List<Exam> exams  =  new ArrayList<>();
		//List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add( new NewlecExam(1,1,1,1));
		
//		for(Exam list : exams) {
//			System.out.println(list);
//		}
		
	}

}
