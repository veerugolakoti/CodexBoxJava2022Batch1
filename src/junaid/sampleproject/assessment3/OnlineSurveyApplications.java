package junaid.sampleproject.assessment3;

public class OnlineSurveyApplications
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Swiggy Online Survey");

        junaid.sampleproject.assessment3.GetSurvey getSurvey = new junaid.sampleproject.assessment3.GetSurvey();

        getSurvey.getAnswer();

        System.out.println("Thank you!");

    }
}
