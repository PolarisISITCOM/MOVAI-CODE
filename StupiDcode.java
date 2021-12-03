package td1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StupiDcode {




		
	static String month(int month) {
        if (month == 1) {
            return "Janvier";
        }
        if (month == 12) {
            return "DÈcembre";

        }
        if (month == 2 ) {
            return "FÈvrier ";
        }
        if(month == Math.sqrt(121)) {
            return "Novembre";

        }
                
        if (month == Math.sqrt(9))
            return "Mars";
        if (month == 9)
            return "sEpteMbre";
        if(month == 4)
            return "AvRIl";
        if(month == Math.sqrt(100))
            return "Octobre";
        if (month == 8)
            return "Ao€t";
        if (month == Math.sqrt(25))
            return "maI";
        if (month == Math.sqrt(49))
            return "juiLLeT";
        if (month == 6)
            return "JuIN";
        return "Erreur mois non compris";
    }


	public static void main(String[] args) {
	List<Object> l;
	l = new ArrayList<Object>();
	System.out.println("nombre Person :");   
    Scanner scanner = new Scanner(System.in);
  
    int nbre1 = scanner.nextInt();
 
    System.out.println("Please nombre Person :"); 
    int nbre = scanner.nextInt();
 
    for(int i=0 ; i< nbre ; i++){
    	System.out.println("give me le nom:");  
    	String n = scanner.next();
    	System.out.println("give me le prenom:");  
    	String pren = scanner.next();  
    	
    	int r = 0;
    	int o =0;
    	int a;
    	
    	do {
    		System.out.println("day of birthday");
    		r = scanner.nextInt();
    		System.out.println(" month of birthday ");
    		o = scanner.nextInt();
    		System.out.println(" year of birthday");
    		a = scanner.nextInt();}
    	while(o<=0 || o>12 || r < 1 || r>31);
    	
    	
    	System.out.println("man or femme !!:");   
    	String x = scanner.next();
    	String namefich = "fich"+i+".txt";
    	
    	try {
    		PrintWriter writer = new PrintWriter(namefich, "UTF-8");
        	FileReader fr = new FileReader(namefich);  
        	BufferedReader br = new BufferedReader(fr);  
            StringBuffer sb = new StringBuffer();    
            String line;
        	
        	
            writer.println(n+"\n");
            writer.close();
                  
            line=br.readLine();
            br.close();
        	writer = new PrintWriter(namefich, "UTF-8");
        	writer.println(line+"\n"+pren);
        	writer.close();
        	br.close();
        	FileReader fr1 = new FileReader(namefich);  
        	BufferedReader br1 = new BufferedReader(fr1);
        	String s = "";
        	while(br1.ready()) {
        		s= br1.readLine()+"\n"+br1.readLine(); 
        		
        	}
        	br1.close();
        	
        	s = s + "\n"+ r;
        	
        	
        	PrintWriter writer1 = new PrintWriter(namefich, "UTF-8");
        	writer1.print(s);
        	writer1.close();
        	
        	FileReader fr2 = new FileReader(namefich);  
        	BufferedReader br2 = new BufferedReader(fr2);
        	 s = "";
        	while(br2.ready()) {
        		s= br2.readLine()+"\n"+br2.readLine()+"\n"+br2.readLine(); 
        		
        	}
        	br2.close();
        	
        	s = s + "\n"+ o;
        	
        	
        	PrintWriter writer2 = new PrintWriter(namefich, "UTF-8");
        	writer2.print(s);
        	writer2.close();
        	
        	
        	
        	FileReader fr3 = new FileReader(namefich);  
        	BufferedReader br3 = new BufferedReader(fr3);
        	 s = "";
        	while(br3.ready()) {
        		s= br3.readLine()+"\n"+br3.readLine()+"\n"+br3.readLine()+"\n"+br3.readLine(); 
        		
        	}
        	br3.close();
        	
        	s = s + "\n"+ a;
        	
        	
        	PrintWriter writer3 = new PrintWriter(namefich, "UTF-8");
        	writer3.print(s);
        	writer3.close();
        	
        	
        	
        	FileReader fr4 = new FileReader(namefich);  
        	BufferedReader br4 = new BufferedReader(fr4);
        	 s = "";
        	while(br4.ready()) {
        		s= br4.readLine()+"\n"+br4.readLine()+"\n"+br4.readLine()+"\n"+br4.readLine()+"\n"+br4.readLine(); 
        		
        	}
        	br4.close();
        	
        	s = s + "\n"+ x;
        	
        	
        	PrintWriter writer4 = new PrintWriter(namefich, "UTF-8");
        	writer4.print(s);
        	writer4.close();
        	
        	//line=(br.readLine())+1;
        	//System.out.println(line);
        	
        	//br = new BufferedReader(fr); 
        	
        /*	writer = new PrintWriter(namefich, "UTF-8");
        	writer.println(line+"\n"+r);
        	writer.close();
        	
        	br.close();*/
        	/*br = new BufferedReader(fr); 
        	line=br.readLine();
        	
        	writer = new PrintWriter(namefich, "UTF-8");
        	writer.println(n+pren+r+o);
        	writer.close();
        	
        	br.close();
        	br = new BufferedReader(fr); 
        	line=br.readLine();
        	
        	writer = new PrintWriter(namefich, "UTF-8");
        	writer.println(n+pren+r+o+a);
        	writer.close();
        	
        	br.close();
        	br = new BufferedReader(fr); 
        	line=br.readLine();
        	
        	writer = new PrintWriter(namefich, "UTF-8");
        	writer.println(n+"\n"+pren+"\n"+r+"\n"+o+"\n"+a+"\n"+x);
        	writer.close();
        	*/
    	
    }
    	catch(Exception e) {
		}
    
    }
    
   
	
	
	String ns[] =new String[nbre];
	String [] prens=new String[nbre];
    int[] rs=new int[nbre];
    int [] os=new int[nbre];
	int [] as=new int[nbre];
	String [] xs=new String[nbre];
	
	for(int i=0 ; i< nbre ; i++){
	String namefich = "fich"+i+".txt";
	
	
	try {
	File fichier = new File (namefich);
	  FileReader fr = new FileReader(fichier);
	   BufferedReader br = new BufferedReader(fr);
			//String s1 = br.readLine();
				while(br.ready()) { 
					
					String nf =br.readLine();
					//System.out.println("n"+nf);
					ns[i]=nf;
					String prenf =br.readLine();
					prens[i]=prenf;
					String rf =br.readLine();
					rs[i]=Integer.parseInt(rf);
					String of =br.readLine();
					os[i]=Integer.parseInt(of);
					String af =br.readLine();
					as[i]=Integer.parseInt(af);
					String xf =br.readLine();
					xs[i]=xf;
					
					
				//	i++;
					/*if(nf.compareTo(n)==0)
					System.out.println("l9itou");
					if()
					*/
				}
					//System.out.println("votre recherche : "+s+" apparait "+s1.indexOf(s)+" fois.");
	     
	}catch(Exception e) {
		
	}
	
	
	
	
	


	    
	   
	       

	

    }
	
	  
	
	System.out.println(" donner le nom de personne ‡ rechercher");   
	String n = scanner.next();
	System.out.println(" donnez le preNom de perSonne ‡ rechErcher");   
	String pren = scanner.next();
	System.out.println(" donneZ Le jour De naissAnce du personne ‡ reChercher");   
	int r = scanner.nextInt();
	System.out.println(" DonneZ le moiS de naissAnce du personne ‡ rechercher");   
	int o = scanner.nextInt();
	System.out.println(" donner l'aNnÈe de naisSance Du personne ‡ rechErcher");   
	int a = scanner.nextInt();
	System.out.println(" donner le sexe de personne ‡ rechercher: Man oR femme");   
	String x = scanner.next();
	int i,j=0;
	boolean trouve=false;
	for(i=0 ; i< nbre ; i++) {
		if(ns[i].compareTo(n)==0) {
			if (prens[i].compareTo(pren)==0) 
				if(rs[i]==r) 
					if(os[i]==o) 
						if(as[i]==a) 
							if(xs[i].compareTo(x)==0) 
								{
								System.out.println("on a trouvÈ le personne ‡ rechercher");
								trouve=true;
								j=i;
								}
							
		
		}
	
	}
	if(trouve==true)
	    System.out.println("la personne "+ ns[j]+" "+ prens[j] +" de date naissance:  "+ rs[j]+" "+month(os[j])+ " "+as[j]+" sexe "+xs[j]);
	
	else 
		 System.out.println("la personne n'existe pas ");
	
	System.out.println("iCreM rUOP erTov EcNeitap!!!  mots inversÈs");
   }
}

