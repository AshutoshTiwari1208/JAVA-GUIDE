import java.io.*;

class LineByLine2
    {

    public static void main( String args []) throws IOException 
        {
            BufferedReader  br    = new BufferedReader(new InputStreamReader( System.in )  );

              System.out.print(" Enter ur age ");
              int  age   =    Integer.parseInt( br.readLine()) ; 


              System.out.print(" Enter ur name ");
              String name   =  br.readLine();



              System.out.print(" Enter salary  ");
              double  salary   =  Double.parseDouble(  br.readLine() );

              System.out.println( " name "   +  name );
              System.out.println( " age "   +  age );
              System.out.println( " salary "   +  salary );

             
          }
      }