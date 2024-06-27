package com.te.LearnJava8.java8Features.streamAPI2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		Map<String, Integer> student01_marks = new HashMap<>();
		student01_marks.put("Science", 90);
		student01_marks.put("Maths", 80);
		student01_marks.put("History", 50);
		student01_marks.put("English", 70);

		Map<String, Integer> student02_marks = new HashMap<>();
		student02_marks.put("Science", 50);
		student02_marks.put("Maths", 40);
		student02_marks.put("History", 60);
		student02_marks.put("English", 40);

		Map<String, Integer> student03_marks = new HashMap<>();
		student03_marks.put("Science", 80);
		student03_marks.put("Maths", 70);
		student03_marks.put("History", 65);
		student03_marks.put("English", 45);

		Map<String, Integer> student04_marks = new HashMap<>();
		student04_marks.put("Science", 88);
		student04_marks.put("Maths", 65);
		student04_marks.put("History", 55);
		student04_marks.put("English", 35);

		Map<String, Integer> student05_marks = new HashMap<>();
		student05_marks.put("Science", 95);
		student05_marks.put("Maths", 90);
		student05_marks.put("History", 93);
		student05_marks.put("English", 85);

		List<Student> students = Arrays.asList(new Student(03, "Mahesh", Rating.BELOWAVERAGE, student01_marks),
				new Student(01, "Akash", Rating.BELOWAVERAGE, student02_marks),
				new Student(06, "Ramesh", Rating.BELOWAVERAGE, student03_marks),
				new Student(07, "Rahul", Rating.BELOWAVERAGE, student04_marks),
				new Student(01, "Pooja", Rating.BELOWAVERAGE, student05_marks));
		
		
		
		Function<Map<String, Integer>, Integer> calculateAverage=m->m.values().stream().mapToInt(n->n.intValue()).sum()/m.size();
	    students.stream().forEach(student->{
	    	if (calculateAverage.apply(student.getMarks())>=90) {
	    		student.setRating(Rating.EXCELLENT);	
			}else if (calculateAverage.apply(student.getMarks())>=80) {
				student.setRating(Rating.GOOD);	
			}else if (calculateAverage.apply(student.getMarks())>=70) {
				student.setRating(Rating.ABOVEAVERAGE);	
			}else if (calculateAverage.apply(student.getMarks())>=60) {
				student.setRating(Rating.AVERAGE);	
			}else if (calculateAverage.apply(student.getMarks())<60) {
				student.setRating(Rating.BELOWAVERAGE);	
			}
	    });

//		students.stream().forEach(student -> {
//			List<Integer> markList = student.getMarks().values().stream().collect(Collectors.toList());
//			int totalMarks = markList.stream().reduce(0, (a, b) -> a + b);
//			float averagemarks = totalMarks / markList.size();
//
//			if (averagemarks >= 90) {
//				student.setRating(Rating.EXCELLENT);
//			} else if (averagemarks >= 80) {
//				student.setRating(Rating.GOOD);
//
//			} else if (averagemarks >= 70 ) {
//				student.setRating(Rating.ABOVEAVERAGE);
//
//			} else if (averagemarks >= 60 ) {
//				student.setRating(Rating.AVERAGE);
//
//			} else if (averagemarks < 60) {
//				student.setRating(Rating.GOOD);
//
//			}
//
//		});

		List<Student> sortedStudents = students
				.stream().filter(student -> student.getRating() == Rating.ABOVEAVERAGE
						|| student.getRating() == Rating.GOOD || student.getRating() == Rating.EXCELLENT)
				.collect(Collectors.toList());

		for (Student student : sortedStudents) {
			System.out.println(student);

		}

	}

}
