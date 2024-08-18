import java.io.*;

public class csv_reader
{
    public static void main(String args[])
    {
        String file = "data.csv";

        BufferedReader reader = null;
        String line="";

        int maxRowcounts=10;
        int count=0;

        try
        {
            reader = new BufferedReader(new FileReader(file));

            while((line=reader.readLine())!=null && count<maxRowcounts)
            {
                String row[] = line.split(",");

                for(String index:row)
                {
                    System.out.printf("%-10s", index);
                }

                System.out.println();
                count++;
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        finally
        {
            try
            {
                reader.close();
            }

            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}