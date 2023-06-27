import java.io.*;
import java.util.*;
public class exercise35 {
	public static void main(String[] args) throws IOException {
		HashMap<String, String> phoneList = phoneList("phonelist.txt");
		Scanner input = new Scanner(System.in);
		String phone = input.nextLine();
		while(!phone.equals("#")) {
			if(phoneList.containsKey(phone)) {
				System.out.println(phone + phoneList.get(phone));
			}
			else {
				System.out.println(phone + " unknown");
			}
			phone = input.nextLine();
		}
		input.close();
	}


    public static HashMap<String, String> phoneList (String filename) throws IOException{
        HashMap<String, String> phoneList = new HashMap<String, String>();
		Scanner input = new Scanner(new File(filename));
		while(input.hasNext()) {
			phoneList.put(input.next(), input.nextLine());
		}
		return phoneList;
    }
}




