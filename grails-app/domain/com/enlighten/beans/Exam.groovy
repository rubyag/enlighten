package com.enlighten.beans

class Exam {

    static constraints = {
    }
    private String examName; //from the Enum Subjects ,names can be selected
    private String examCode;   // examName + a number. eg java01,java02
    private int noOfQuestions;
    private int mOfEachQ;//marks of each question
    private int totalMarks;
    private int marksObtained;
    private Date date;
    private Set<Question> questionSet;
    private String timeDuration;// duration of exams


}
