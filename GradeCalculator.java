public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = "AP Calculus A/B";
    int avgTime = 140;
    int hw1 = 100;
    int hw2 = 90;
    int hw3 = 80;
    int hw4 = 75;
    double weightHw = .35;
    double q1 = 83.33333333;
    double q2 = 95.0;
    double weightQ = .15;
    double exam = 86.6666666;
    double weightExam = .50;
    double avgHw = ((hw1 + hw2 + hw3 + hw4)/4);
    double avgQ = ((q1 + q2)/2);
    int finalGrade = (int)((avgHw*weightHw)+(avgQ*weightQ)+(exam*weightExam)+0.5);
    System.out.println("Your final grade in " + courseName + " after spending " + avgTime + " per week " + "is calculated to be " + finalGrade);
  }
}
