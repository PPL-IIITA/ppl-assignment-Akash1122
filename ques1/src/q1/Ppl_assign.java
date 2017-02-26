
package q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ppl_assign
{
	public static void valentinecouples() throws IOException
	{
		String naam_b;
		String commit_b;
		String naam_g;
		String commit_g;
		int att_b;
		int int_b;
		int att_g;
		int int_g;
		double budget_b;
		double budget_g;
                String  temp;
                FileReader boy = new FileReader("boyrecord.txt");
                BufferedReader inboy = new  BufferedReader(boy);
                FileReader girl = new FileReader("girlrecord.txt");
                BufferedReader ingirl = new  BufferedReader(girl);
	
           
		File file = new File ("couplesrecord.txt");
                FileWriter incop = null;
                incop = new FileWriter(file);
                int flag = 0;
		Boy bo = new Boy("NA", "Geek", 0, 0, 0);
		Girl g = new Girl("NA", "Normal", 0, 0, 0);
		while (true)
		{
		

			if ((naam_b = inboy.readLine()) == null)
			{
				break;
			}
                        if((commit_b = inboy.readLine()) == null){
                            break;
                        }
                        
                        if((temp = (inboy.readLine())) == null){
                            break;
                        }
                        att_b = Integer.parseInt(temp);
                        
                        if((temp = (inboy.readLine())) == null){
                            break;
                        }
                        int_b = Integer.parseInt(temp);
                        
                        if((temp = (inboy.readLine())) == null){
                            break;
                        }
                        budget_b = Integer.parseInt(temp);
                        
			bo.setData(naam_b, commit_b, att_b, int_b, budget_b);
			if (flag == 0)
			{

                                if ((naam_g = ingirl.readLine()) == null)
			{
				break;
			}
                                if((commit_g = ingirl.readLine()) == null){
                            break;
                        }
                        
                        if((temp = (ingirl.readLine())) == null){
                            break;
                        }
                        att_g = Integer.parseInt(temp);
                        
                        if((temp = (ingirl.readLine())) == null){
                            break;
                        }
                        int_g = Integer.parseInt(temp);
                        
                        if((temp = (ingirl.readLine())) == null){
                            break;
                        }
                        budget_g = Integer.parseInt(temp);
		
				g.setData(naam_g, commit_g, att_g, int_g, budget_g);
			}
			if (bo.getBudget() >= g.getMaintenanceCost())
			{
				incop.write( bo.getName() + " " + "dates" + " " + g.getName() + "\naam_b");
                                
				 flag = 0;
			}
			else
			{
				flag = 1;
			}
		}
		ingirl.close();
		incop.close();
		inboy.close();
	}

    public static void main(String[] args) {
            try {
              
                valentinecouples();
            } catch (IOException ex) {
                Logger.getLogger(Ppl_assign.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
