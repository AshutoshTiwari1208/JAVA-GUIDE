import java.io.*;
       class  OpenFile
            {
               public static void main ( String args []  )throws InterruptedException
                   {
                    try 
                        {
                      
                      if ( args.length == 0 )
                      	 {
                      	 	System.out.print(" file name with path required ");
                      	 	return;

                      	 }
                    FileReader  fw    = new FileReader( args[0] );

                    BufferedReader  br    = new BufferedReader( fw );
                     String  str ;
                     while( true )
                     	    {
                           str    =   br.readLine();
                           if ( str  == null )   { break; }
                           System.out.println ( str );
                           Thread.sleep(40);
                     	    }

                       br.close();
                        fw.close();
                        } catch ( IOException e )            
                               {
                               e.printStackTrace();
                               }
                     }      
            }
