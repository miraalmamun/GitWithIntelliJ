import java.util.Random;

public class RandomString {

    public static void main(String[] args) {


        for (int i = 1; i <3 ; i++)
        {
            System.out.println("This is row # "+i+"\nWrite some remarks here. "+"\nThis is my remarks: "+getRandomString());
        }
    }

    public static String getRandomString()
    {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();
        StringBuffer buffer = new StringBuffer(targetStringLength);
        for (int i = 0; i < targetStringLength; i++)
        {
            int randomLimitInt = leftLimit+(int)(random.nextFloat()*(rightLimit-leftLimit+1));
            buffer.append((char) randomLimitInt);
        }
      String generatedString = buffer.toString();
        return generatedString;
    }
}
