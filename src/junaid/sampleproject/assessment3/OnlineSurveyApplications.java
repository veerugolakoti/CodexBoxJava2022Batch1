package junaid.sampleproject.Assessment3;

public class OnlineSurveyApplications
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Swiggy Online Survey");

       GetSurvey getSurvey = new GetSurvey();

        getSurvey.getAnswer();

        System.out.println("Thank you!");

    }
}
